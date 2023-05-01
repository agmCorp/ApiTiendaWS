package uy.com.bse.persistence.service.pagoelectronico.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.dto.pagoelectronico.EstadoTransaccionDTO;
import uy.com.bse.dto.pagoelectronico.InstFinancieraDTO;
import uy.com.bse.dto.pagoelectronico.MedioDePagoDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.pagoelectronico.EntidadesBancariasResp;
import uy.com.bse.persistence.proxy.pagoelectronico.EstadoTransaccionResp;
import uy.com.bse.persistence.proxy.pagoelectronico.FacturaResp;
import uy.com.bse.persistence.proxy.pagoelectronico.MediosPagoResp;
import uy.com.bse.persistence.proxy.pagoelectronico.PagosElectronicos;
import uy.com.bse.persistence.proxy.pagoelectronico.PagosElectronicos_Service;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.pagoelectronico.dao.PagoElectronicoDAO;
import uy.com.bse.persistence.service.pagoelectronico.impl.map.EstadoTransaccionMap;
import uy.com.bse.persistence.service.pagoelectronico.impl.map.FacturaMap;
import uy.com.bse.persistence.service.pagoelectronico.impl.map.InstFinancierasMap;
import uy.com.bse.persistence.service.pagoelectronico.impl.map.MediosDePagoMap;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class PagoElectronicoPersistenceService extends PersistenceService implements PagoElectronicoDAO {
	private static final String URL = "pagoElectronico.url";
	private static final String USER = "pagoElectronico.user";
	private static final String PWD = "pagoElectronico.pwd";
	private static final String RUBRO_FACTURA = "F";
	private static final String RUBRO_POLIZA = "P1";

	// TODO ALVARO VER
	@WebServiceRef(PagosElectronicos_Service.class)
	private PagosElectronicos proxy;
	private String user;
	private String pwd;

	@PostConstruct
	private void init() {
		//PagosElectronicos_Service ws = new PagosElectronicos_Service();
		//proxy = ws.getPagosElectronicosPort();
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
			logger.error("xxx*****************bbbbbbbbbbbbbbbbbbbbbdfsabbbbbbbbbbbbbbbbbbbbb");
			throw e;
		}
	}

	private List<InstFinancieraDTO> getInstFinancieras(String rubro) throws PersistException {
		EntidadesBancariasResp resp = null;
		try {
			resp = proxy.consultaEntidadesBancariasPorRubro(user, pwd, rubro);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getInstFinancieras");
		}
		procesarErrorEnRespuesta(resp.getCodigoError(), resp.getDescripcionError(),
				"Respuesta con error en persistencia getInstFinancieras rubro " + rubro);
		return InstFinancierasMap.map(resp);
	}

	@Override
	public List<InstFinancieraDTO> getBancos() throws PersistException {
		return getInstFinancieras(RUBRO_FACTURA);
	}

	@Override
	public List<InstFinancieraDTO> getBancosYTarjetas() throws PersistException {
		return getInstFinancieras(RUBRO_POLIZA);
	}

	@Override
	public List<MedioDePagoDTO> getMediosDePago() throws PersistException {
		MediosPagoResp resp = null;
		try {
			resp = proxy.consultaMediosPago(user, pwd);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getMediosDePago");
		}
		procesarErrorEnRespuesta(resp.getCodigoError(), resp.getDescripcionError(),
				"Respuesta con error en persistencia getMediosDePago");
		return MediosDePagoMap.map(resp);
	}

	@Override
	public EstadoTransaccionDTO getEstadoTransaccion(String idTransaccion) throws PersistException {
		EstadoTransaccionResp resp = null;
		try {
			resp = proxy.consultaEstadoTransaccion(user, pwd, idTransaccion);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getEstadoTransaccion");
		}
		procesarErrorEnRespuesta(resp.getCodigoError(), resp.getDescripcionError(),
				"Respuesta con error en persistencia getEstadoTransaccion");
		return EstadoTransaccionMap.map(resp);
	}

	@Override
	public FacturaDTO getFactura(Long nroFactura) throws PersistException {
		FacturaResp resp = null;
		try {
			resp = proxy.consultaFactura(user, pwd, nroFactura);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getFactura");
		}
		procesarErrorEnRespuesta(resp.getCodigoError(), resp.getDescripcionError(),
				"Respuesta con error en persistencia getFactura");
		return FacturaMap.map(resp);
	}
}
