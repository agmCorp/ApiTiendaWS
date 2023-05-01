package uy.com.bse.persistence.service.objpersonal.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.objpersonal.ClienteDeudaDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.dto.objpersonal.EmisionObjPersonalDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.objpersonal.ClienteDeudaTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.CotizacionOPersonalTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.EmisionOPersonal;
import uy.com.bse.persistence.proxy.objpersonal.EmisionOPersonalTienda;
import uy.com.bse.persistence.proxy.objpersonal.EmisionOPersonalTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.ErrorTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.PlanesCoberturaTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.TiposMovilidadTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.TiposObjetosTiendaResp;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.objpersonal.dao.ObjPersonalDAO;
import uy.com.bse.persistence.service.objpersonal.impl.map.ClienteDeudaMap;
import uy.com.bse.persistence.service.objpersonal.impl.map.CotizacionObjPersonalMap;
import uy.com.bse.persistence.service.objpersonal.impl.map.EmisionObjPersonalMap;
import uy.com.bse.persistence.service.objpersonal.impl.map.PlanesCoberturaMap;
import uy.com.bse.persistence.service.objpersonal.impl.map.TiposMovilidadMap;
import uy.com.bse.persistence.service.objpersonal.impl.map.TiposObjetoMap;
import uy.com.bse.persistence.support.LoggingPersistenceInterceptorBinding;
import uy.com.bse.util.DateHelper;

@Stateless
@LoggingPersistenceInterceptorBinding
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class ObjPersonalPersistenceService extends PersistenceService implements ObjPersonalDAO {
	private static final String URL = "objPersonal.url";
	private static final String USER = "objPersonal.user";
	private static final String PWD = "objPersonal.pwd";

	@WebServiceRef(EmisionOPersonal.class)
	private EmisionOPersonalTienda proxy;

	private String user;
	private String pwd;

	@PostConstruct
	private void init() {
		setEndpoint((BindingProvider) proxy, config.getString(URL));
		user = config.getString(USER);
		pwd = config.getString(PWD);
	}

	private void procesarErrorEnRespuesta(ErrorTiendaResp errorTiendaResp, String internalMessage)
			throws PersistException {
		final String RESULTADO_OK = "00";

		if (!errorTiendaResp.getErrorCodigo().equals(RESULTADO_OK)) {
			ErrorDTO errorDTO = new ErrorDTO(errorTiendaResp.getErrorCodigo(), errorTiendaResp.getErrorDescripcion(),
					false);
			PersistException e = new PersistException(errorDTO, internalMessage);
			throw e;
		}
	}

	@Override
	public List<CodigueraDTO> getPlanesCobertura() throws PersistException {
		PlanesCoberturaTiendaResp resp = null;
		try {
			resp = proxy.consultaPlanesCobertura(user, pwd);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getPlanesCobertura");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia getPlanesCobertura");
		return PlanesCoberturaMap.map(resp);
	}

	@Override
	public List<CodigueraDTO> getTiposMovilidad() throws PersistException {
		TiposMovilidadTiendaResp resp = null;
		try {
			resp = proxy.consultaTiposMovilidad(user, pwd);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getTiposMovilidad");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia getTiposMovilidad");
		return TiposMovilidadMap.map(resp);
	}

	@Override
	public List<CodigueraDTO> getTiposObjeto() throws PersistException {
		TiposObjetosTiendaResp resp = null;
		try {
			resp = proxy.consultaTiposObjetos(user, pwd);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getTiposObjeto");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia getTiposObjeto");
		return TiposObjetoMap.map(resp);
	}

	@Override
	public CotizacionObjPersonalDTO cotizarAnonimo(String planCobertura, String tipoObjeto, Double valorObjeto,
			String movilidad) throws PersistException {
		CotizacionOPersonalTiendaResp resp = null;
		try {
			resp = proxy.cotizarOPersonalAnonimo(user, pwd, planCobertura, tipoObjeto, valorObjeto, movilidad);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia cotizarAnonimo");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia cotizarAnonimo");
		return CotizacionObjPersonalMap.map(resp);
	}

	@Override
	public EmisionObjPersonalDTO emitir(String tipoDocumento, String documento, String marca, String serie,
			String modelo, Long nroCotizacion, Integer planPago, Date fechaFactura, String consumoFinal)
			throws PersistException {
		EmisionOPersonalTiendaResp resp = null;
		try {
			resp = proxy.emitirOPersonal(user, pwd, tipoDocumento, documento, marca, serie, modelo, nroCotizacion,
					String.valueOf(planPago), DateHelper.dateToXMLGregorianCalendar(fechaFactura), consumoFinal);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia emitir");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia emitir");
		return EmisionObjPersonalMap.map(resp);
	}

	@Override
	public ClienteDeudaDTO getClienteDeuda(String tipoDocumento, String documento, Long nroCotizacion,
			Integer nroCertificado) throws PersistException {
		ClienteDeudaTiendaResp resp = null;
		try {
			resp = proxy.controlarClienteConDeuda(user, pwd, tipoDocumento, documento, nroCotizacion.intValue(),
					nroCertificado);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getClienteDeuda");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia getClienteDeuda");
		return ClienteDeudaMap.map(resp);
	}
}
