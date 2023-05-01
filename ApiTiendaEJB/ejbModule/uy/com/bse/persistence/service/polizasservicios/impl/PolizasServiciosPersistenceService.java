package uy.com.bse.persistence.service.polizasservicios.impl;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

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
import uy.com.bse.persistence.support.LoggingPersistenceInterceptorBinding;
import uy.com.bse.util.DateHelper;

@Stateless
@LoggingPersistenceInterceptorBinding
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class PolizasServiciosPersistenceService extends PersistenceService implements PolizasServiciosDAO {
	private static final String URL = "polizasServicios.url";

	@WebServiceRef(WsServiciosPolizas.class)
	private IWsServiciosPolizas proxy;

	@PostConstruct
	private void init() {
		setEndpoint((BindingProvider) proxy, config.getString(URL));
	}

	private void procesarErrorEnRespuesta(ResultGenerico errorResultGenerico, String internalMessage)
			throws PersistException {

		if (errorResultGenerico.isHayError()) {
			ServiciosError serviciosError = errorResultGenerico.getError();
			ErrorDTO errorDTO = new ErrorDTO(String.valueOf(serviciosError.getCodigo()),
					serviciosError.getDescripcion(), false);
			PersistException e = new PersistException(errorDTO, internalMessage);
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
