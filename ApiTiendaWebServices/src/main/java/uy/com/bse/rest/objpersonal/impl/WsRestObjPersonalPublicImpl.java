package uy.com.bse.rest.objpersonal.impl;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.exception.BusinessException;
import uy.com.bse.rest.objpersonal.WsRestObjPersonalBase;
import uy.com.bse.rest.objpersonal.WsRestObjPersonalPublic;
import uy.com.bse.rest.objpersonal.param.ParamCotizacionDTO;
import uy.com.bse.rest.objpersonal.param.ParamRecaptchaRequestDTO;
import uy.com.bse.rest.support.LoggingWsInterceptorBinding;
import uy.com.bse.util.recaptcha.RecaptchaClient;

@LoggingWsInterceptorBinding
public class WsRestObjPersonalPublicImpl extends WsRestObjPersonalBase implements WsRestObjPersonalPublic {

	@Override
	public Response obtenerPlanesCobertura() {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerPlanesCobertura";
		List<CodigueraDTO> resp = null;

		try {
			resp = fachada.getPlanesCobertura();
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
			resp = fachada.getTiposMovilidad();
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
			resp = fachada.getTiposObjeto();
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
			resp = fachada.cotizarAnonimo(paramCotizacionDTO.getPlanCobertura(),
					paramCotizacionDTO.getTipoObjeto(), Double.valueOf(paramCotizacionDTO.getValorObjeto()),
					paramCotizacionDTO.getMovilidad());
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}
	

	@Override
	public Response recaptchaSiteVerify(SecurityContext securityContext,
			@Valid ParamRecaptchaRequestDTO paramRecaptchaRequestDTO) {
		RecaptchaClient client = new RecaptchaClient(getRecaptchaConfig());
		return client.verify(paramRecaptchaRequestDTO.getResponse(), paramRecaptchaRequestDTO.getRemoteIp());
	}
}
