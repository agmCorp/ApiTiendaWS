package uy.com.bse.rest.objpersonal.impl;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

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
			resp = fachada.cotizarAnonimo(paramCotizacionDTO.getPlanCobertura(), paramCotizacionDTO.getTipoObjeto(),
					Double.valueOf(paramCotizacionDTO.getValorObjeto()), paramCotizacionDTO.getMovilidad());
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response recaptchaSiteVerify(ParamRecaptchaRequestDTO paramRecaptchaRequestDTO) {
		RecaptchaClient client = new RecaptchaClient(getRecaptchaConfig());
		return client.verify(paramRecaptchaRequestDTO.getResponse(), paramRecaptchaRequestDTO.getRemoteIp());
	}

	@Override
	public Response redireccion(HttpHeaders header, HttpServletResponse response, String referrer) {
		final String INTERNAL_MESSAGE = "Error en servicio redireccion";

		URI uri = null;
		try {
			uri = new URI(referrer);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		ResponseBuilder builder = Response.ok();
		builder.status(Status.OK);
		builder.type(MediaType.TEXT_HTML);
		builder.entity("<!doctype html><html><head></head><body>" +
			    "<script type='text/javascript'>" +
			    "window.location.href ='" +
			    uri +
			    "'</script></body></html>");
		
		return builder.build();
	}
}
