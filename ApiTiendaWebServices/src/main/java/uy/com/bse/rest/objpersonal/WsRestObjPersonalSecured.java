package uy.com.bse.rest.objpersonal;

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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import uy.com.bse.rest.objpersonal.param.ParamAdhesionFacturaDigitalDTO;
import uy.com.bse.rest.objpersonal.param.ParamEmisionDTO;
import uy.com.bse.rest.objpersonal.param.ParamFacturacionDTO;
import uy.com.bse.rest.objpersonal.param.ParamIdTrnDTO;
import uy.com.bse.rest.objpersonal.param.ParamInformarPagoEnRedesDTO;

@Path("/objPersonal/secured")
@Produces(MediaType.APPLICATION_JSON)
public interface WsRestObjPersonalSecured {

	@GET
	@Path("/medios-de-pago-factura")
	Response obtenerMediosDePagoFactura(@Context SecurityContext securityContext);

	@GET
	@Path("/medios-de-pago-poliza")
	Response obtenerMediosDePagoPoliza(@Context SecurityContext securityContext);

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

	@POST
	@Path("/id-trn-sistarbanc")
	@Consumes(MediaType.APPLICATION_JSON)
	Response obtenerIdTrnSistarbanc(@Context SecurityContext securityContext, @Valid ParamIdTrnDTO paramIdTrnDTO);

	@POST
	@Path("/id-trn-banred")
	@Consumes(MediaType.APPLICATION_JSON)
	Response obtenerIdTrnBanred(@Context SecurityContext securityContext, @Valid ParamIdTrnDTO paramIdTrnDTO);

	@POST
	@Path("/pago-en-redes")
	@Consumes(MediaType.APPLICATION_JSON)
	Response informarPagoEnRedes(@Context SecurityContext securityContext,
			@Valid ParamInformarPagoEnRedesDTO paramInformarPagoEnRedesDTO);
}
