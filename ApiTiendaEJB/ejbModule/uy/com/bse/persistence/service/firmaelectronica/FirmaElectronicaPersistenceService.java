package uy.com.bse.persistence.service.firmaelectronica;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaElectronica;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaElectronica_Service;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaTxtResp;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.firmaelectronica.dao.FirmaElectronicaDAO;
import uy.com.bse.persistence.service.firmaelectronica.impl.map.FirmaElectronicaMap;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class FirmaElectronicaPersistenceService extends PersistenceService implements FirmaElectronicaDAO {
	private static final String URL = "firmaElectronica.url";
	private static final String USER = "firmaElectronica.user";
	private static final String PWD = "firmaElectronica.pwd";

	private FirmaElectronica proxy;
	private String user;
	private String pwd;

	@PostConstruct
	private void init() {
		FirmaElectronica_Service ws = new FirmaElectronica_Service();
		proxy = ws.getFirmaElectronicaPort();
		Map<String, Object> requestCtx = ((BindingProvider) proxy).getRequestContext();
		requestCtx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, config.getString(URL));
		user = config.getString(USER);
		pwd = config.getString(PWD);
	}

	private void procesarErrorEnRespuesta(String errorCodigo, String errorDescripcion, String internalMessage)
			throws PersistException {
		final String RESULTADO_OK = "00";

		if (!errorCodigo.equals(RESULTADO_OK)) {
			ErrorDTO errorDTO = new ErrorDTO(errorCodigo, errorDescripcion, false);
			PersistException e = new PersistException(errorDTO, internalMessage);
			// TODO ALVARO LOGUEAR **MI** EXCEPCION e
			throw e;
		}
	}

	@Override
	public FirmaElectronicaDTO getFirmaElectronica(String textoPlano) throws PersistException {
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
