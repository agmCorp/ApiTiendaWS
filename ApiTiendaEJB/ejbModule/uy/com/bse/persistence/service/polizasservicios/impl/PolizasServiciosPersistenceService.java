package uy.com.bse.persistence.service.polizasservicios.impl;

import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.polizasservicios.NuevaFacturacionInteractivaDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.polizasservicios.IWsServiciosPolizas;
import uy.com.bse.persistence.proxy.polizasservicios.ParamNuevaFacturacionInteractiva;
import uy.com.bse.persistence.proxy.polizasservicios.ResultGenerico;
import uy.com.bse.persistence.proxy.polizasservicios.ResultNuevaFacturacionInteractiva;
import uy.com.bse.persistence.proxy.polizasservicios.ServiciosError;
import uy.com.bse.persistence.proxy.polizasservicios.WsServiciosPolizas;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.polizasservicios.dao.PolizasServiciosDAO;
import uy.com.bse.persistence.service.polizasservicios.impl.map.NuevaFacturacionInteractivaMap;
import uy.com.bse.util.DateHelper;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class PolizasServiciosPersistenceService extends PersistenceService implements PolizasServiciosDAO {
	private static final String URL = "polizasServicios.url";

	private IWsServiciosPolizas proxy;

	@PostConstruct
	private void init() {
		WsServiciosPolizas ws = new WsServiciosPolizas();
		proxy = ws.getWsServiciosPolizasPort();
		Map<String, Object> requestCtx = ((BindingProvider) proxy).getRequestContext();
		requestCtx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, config.getString(URL));
	}

	private void procesarErrorEnRespuesta(ResultGenerico errorResultGenerico, String internalMessage)
			throws PersistException {

		if (errorResultGenerico.isHayError()) {
			ServiciosError serviciosError = errorResultGenerico.getError();
			ErrorDTO errorDTO = new ErrorDTO(String.valueOf(serviciosError.getCodigo()),
					serviciosError.getDescripcion(), false);
			PersistException e = new PersistException(errorDTO, internalMessage);
			// TODO ALVARO LOGUEAR **MI** EXCEPCION e
			throw e;
		}
	}

	@Override
	public NuevaFacturacionInteractivaDTO nuevaFacturacionInteractiva(String seguridadServiciosUser,
			String tokenSeguridad, Integer codRamo, Integer nroPoliza, String contemplaDias, Date fecha)
			throws PersistException {
		ResultNuevaFacturacionInteractiva resp = null;
		try {
			ParamNuevaFacturacionInteractiva param = new ParamNuevaFacturacionInteractiva();
			param.setUsuario(seguridadServiciosUser);
			param.setClave(tokenSeguridad);
			param.setCodRamo(String.valueOf(codRamo));
			param.setNumPoliza(String.valueOf(nroPoliza));
			param.setContemplaDias(contemplaDias);
			param.setFecha(DateHelper.dateToString(fecha, DateHelper.HYPHEN_YEAR_FIRST));

			resp = proxy.nuevaFacturacionInteractiva(param);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia nuevaFacturacionInteractiva");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia nuevaFacturacionInteractiva");
		return NuevaFacturacionInteractivaMap.map(resp);
	}
}
