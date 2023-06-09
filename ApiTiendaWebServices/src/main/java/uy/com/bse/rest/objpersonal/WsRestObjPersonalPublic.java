package uy.com.bse.rest.objpersonal;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import uy.com.bse.rest.objpersonal.param.ParamCotizacionDTO;
import uy.com.bse.rest.objpersonal.param.ParamRecaptchaRequestDTO;

@Path("/objPersonal/public")
@Produces(MediaType.APPLICATION_JSON)
public interface WsRestObjPersonalPublic {

	@GET
	@Path("/planes-cobertura")
	Response obtenerPlanesCobertura();

	@GET
	@Path("/tipos-movilidad")
	Response obtenerTiposMovilidad();

	@GET
	@Path("/tipos-objeto")
	Response obtenerTiposObjeto();

	@POST
	@Path("/cotizacion")
	@Consumes(MediaType.APPLICATION_JSON)
	Response cotizarAnonimo(@Valid ParamCotizacionDTO paramCotizacionDTO);

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/recaptcha-site-verify")
	Response recaptchaSiteVerify(@Valid ParamRecaptchaRequestDTO paramRecaptchaRequestDTO);

	@POST
	@Produces(MediaType.TEXT_HTML)
	@Path("/redireccion")
	Response redireccion(@Context HttpHeaders header, @Context HttpServletResponse response,
			@NotEmpty(message = "No se encontró el parámetro 'referrer'") @QueryParam("referrer") String referrer);

}
