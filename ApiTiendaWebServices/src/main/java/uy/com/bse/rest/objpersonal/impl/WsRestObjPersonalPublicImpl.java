package uy.com.bse.rest.objpersonal.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.exception.BusinessException;
import uy.com.bse.rest.objpersonal.WsRestObjPersonalBase;
import uy.com.bse.rest.objpersonal.WsRestObjPersonalPublic;
import uy.com.bse.rest.objpersonal.param.ParamCotizacionDTO;
import uy.com.bse.rest.support.LoggingWsInterceptorBinding;

@LoggingWsInterceptorBinding
public class WsRestObjPersonalPublicImpl extends WsRestObjPersonalBase implements WsRestObjPersonalPublic {

	@Override
	public Response obtenerPlanesCobertura() {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerPlanesCobertura";
		List<CodigueraDTO> resp = null;

		try {
			resp = getFachada().getPlanesCobertura();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerTiposMovilidad() {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerTiposMovilidad";
		List<CodigueraDTO> resp = null;

		try {
			resp = getFachada().getTiposMovilidad();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerTiposObjeto() {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerTiposObjeto";
		List<CodigueraDTO> resp = null;

		try {
			resp = getFachada().getTiposObjeto();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response cotizarAnonimo(ParamCotizacionDTO paramCotizacionDTO) {
		final String INTERNAL_MESSAGE = "Error en servicio cotizarAnonimo";
		CotizacionObjPersonalDTO resp = null;

		try {
			resp = getFachada().cotizarAnonimo(paramCotizacionDTO.getPlanCobertura(),
					paramCotizacionDTO.getTipoObjeto(), Double.valueOf(paramCotizacionDTO.getValorObjeto()),
					paramCotizacionDTO.getMovilidad());
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}
}
