package uy.com.bse.rest.objpersonal;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import uy.com.bse.rest.objpersonal.param.ParamAdhesionFacturaDigitalDTO;
import uy.com.bse.rest.objpersonal.param.ParamEmisionDTO;
import uy.com.bse.rest.objpersonal.param.ParamFacturacionDTO;
import uy.com.bse.rest.objpersonal.param.ParamRecaptchaRequestDTO;

@Path("/objPersonal/securedX")
@Produces(MediaType.APPLICATION_JSON)
public interface WsRestObjPersonalSecured {

	@GET
	@Path("/bancos")
	Response obtenerBancos(@Context SecurityContext securityContext);

	@GET
	@Path("/bancos-tarjetas")
	Response obtenerBancosYTarjetas(@Context SecurityContext securityContext);

	@GET
	@Path("/medios-de-pago")
	Response obtenerMediosDePago(@Context SecurityContext securityContext);

	@POST
	@Path("/emision")
	@Consumes(MediaType.APPLICATION_JSON)
	Response emitir(@Context SecurityContext securityContext, @Valid ParamEmisionDTO paramEmisionDTO);

	@GET
	@Path("/control-deuda/{tipoDocumento}/{documento}/{nroCotizacion}/{nroCertificado}")
	Response controlarDeuda(@Context SecurityContext securityContext, @PathParam("tipoDocumento") String tipoDocumento,

			@PathParam("documento") String documento,

			@Pattern(regexp = "\\d+", message = "El parámetro 'nroCotizacion' no es un número") @PathParam("nroCotizacion") String nroCotizacion,

			@Pattern(regexp = "\\d+", message = "El parámetro 'nroCertificado' no es un número") @PathParam("nroCertificado") String nroCertificado);

	@GET
	@Path("/estados-transaccion/{idTransaccion}")
	Response estadosTransaccion(@Context SecurityContext securityContext,
			@PathParam("idTransaccion") String idTransaccion);

	@GET
	@Path("/facturas/{nroFactura}")
	Response facturas(@Context SecurityContext securityContext,
			@Pattern(regexp = "\\d+", message = "El parámetro 'nroFactura' no es un número") @PathParam("nroFactura") String nroFactura);

	@POST
	@Path("/facturacion")
	@Consumes(MediaType.APPLICATION_JSON)
	Response facturacion(@Context SecurityContext securityContext, @Valid ParamFacturacionDTO paramFacturacionDTO);

	@POST
	@Path("/adhesion-factura-digital")
	@Consumes(MediaType.APPLICATION_JSON)
	Response adhesionFacturaDigital(@Context SecurityContext securityContext,
			@Valid ParamAdhesionFacturaDigitalDTO paramAdhesionFacturaDigitalDTO);

	@POST
	@Path("/upload/{nroCotizacion}")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	Response uploadFile(@Context SecurityContext securityContext,

			@Pattern(regexp = "\\d+", message = "El parámetro 'nroCotizacion' no es un número") @PathParam("nroCotizacion") String nroCotizacion,

			MultipartFormDataInput input);

	@GET
	@Path("/numero-cliente")
	Response numeroCliente(@Context SecurityContext securityContext);

	@GET
	@Path("/firma-electronica")
	Response obtenerFirmaElectronica(@Context SecurityContext securityContext,
			@NotEmpty(message = "No se encontró el parámetro 'textoPlano'") @QueryParam("textoPlano") String textoPlano);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/redireccion")
	Response redireccion(@Context SecurityContext securityContext, @Context HttpHeaders header,

			@Context HttpServletResponse response,

			@NotEmpty(message = "No se encontró el parámetro 'referrer'") @QueryParam("referrer") String referrer);

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/recaptcha-site-verify")
	Response recaptchaSiteVerify(@Context SecurityContext securityContext, @Valid ParamRecaptchaRequestDTO paramRecaptchaRequestDTO);
}
