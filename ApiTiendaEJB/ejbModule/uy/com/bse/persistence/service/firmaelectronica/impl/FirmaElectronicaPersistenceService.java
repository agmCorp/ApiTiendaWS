package uy.com.bse.persistence.service.firmaelectronica.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaElectronica;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaElectronica_Service;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaTxtResp;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.firmaelectronica.dao.FirmaElectronicaDAO;
import uy.com.bse.persistence.service.firmaelectronica.impl.map.FirmaElectronicaMap;
import uy.com.bse.persistence.support.LoggingPersistenceInterceptorBinding;

@Stateless
@LoggingPersistenceInterceptorBinding
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class FirmaElectronicaPersistenceService extends PersistenceService implements FirmaElectronicaDAO {
	private static final String URL = "firmaElectronica.url";
	private static final String USER = "firmaElectronica.user";
	private static final String PWD = "firmaElectronica.pwd";

	@WebServiceRef(FirmaElectronica_Service.class)
	private FirmaElectronica proxy;
	
	private String user;
	private String pwd;
	private Boolean initOK = false;
	
	@Override
	protected Boolean inicializacionCorrecta() {
		return initOK;
	}

	@PostConstruct
	private void init() {
		setEndpoint((BindingProvider) proxy, configSoap.getString(URL));
		user = configSoap.getString(USER);
		pwd = configSoap.getString(PWD);
		initOK = true;
	}

	private void procesarErrorEnRespuesta(String errorCodigo, String errorDescripcion, String internalMessage)
			throws PersistException {
		final String RESULTADO_OK = "00";

		if (!errorCodigo.equals(RESULTADO_OK)) {
			ErrorDTO errorDTO = new ErrorDTO(errorCodigo, errorDescripcion, false);
			PersistException e = new PersistException(errorDTO, internalMessage);
			throw e;
		}
	}

	@Override
	public FirmaElectronicaDTO getFirmaElectronica(String textoPlano) throws PersistException {
		procesarErrorEnInicializacion();
		
		FirmaTxtResp resp = null;
		try {
			resp = proxy.firmarTexto(user, pwd, textoPlano);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getFirmaElectronica");
		}
		procesarErrorEnRespuesta(resp.getCodigoError(), resp.getDescripcionError(),
				"Respuesta con error en persistencia getFirmaElectronica");
		
		return FirmaElectronicaMap.map(resp);
	}
}
