package uy.com.bse.rest.objpersonal.impl;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.dto.mibse.FileUploadDTO;
import uy.com.bse.dto.mibse.NumeroClienteDTO;
import uy.com.bse.dto.objpersonal.ClienteDeudaDTO;
import uy.com.bse.dto.objpersonal.EmisionObjPersonalDTO;
import uy.com.bse.dto.pagoelectronico.EstadoTransaccionDTO;
import uy.com.bse.dto.pagoelectronico.InstFinancieraDTO;
import uy.com.bse.dto.pagoelectronico.MedioDePagoDTO;
import uy.com.bse.dto.polizasservicios.NuevaFacturacionInteractivaDTO;
import uy.com.bse.exception.BusinessException;
import uy.com.bse.rest.objpersonal.WsRestObjPersonalBase;
import uy.com.bse.rest.objpersonal.WsRestObjPersonalSecured;
import uy.com.bse.rest.objpersonal.param.ParamAdhesionFacturaDigitalDTO;
import uy.com.bse.rest.objpersonal.param.ParamEmisionDTO;
import uy.com.bse.rest.objpersonal.param.ParamFacturacionDTO;
import uy.com.bse.rest.objpersonal.param.ParamRecaptchaRequestDTO;
import uy.com.bse.rest.support.LoggingWsInterceptorBinding;
import uy.com.bse.util.DateHelper;
import uy.com.bse.util.fileupload.InputPartHelper;
import uy.com.bse.util.recaptcha.RecaptchaClient;

@LoggingWsInterceptorBinding
public class WsRestObjPersonalSecuredImpl extends WsRestObjPersonalBase implements WsRestObjPersonalSecured {

	private String getNewFilename(String userLoggedIn, String nroCotizacion, String filenamePrefix)
			throws BusinessException {
		// Define un nombre de archivo en función de datos del usuario logueado
		NumeroClienteDTO numeroClienteDTO = fachada.getNumeroCliente(userLoggedIn);
		String newFilename = filenamePrefix + "-" + nroCotizacion + "-" + getUserLoggedInTipoDoc(userLoggedIn) + "-"
				+ getUserLoggedInDoc(userLoggedIn) + "-" + numeroClienteDTO.getNumCliente() + "-"
				+ UUID.randomUUID().toString() + ".jpg";
		return newFilename;
	}

	private FileUploadDTO getFileUploadDTO(String filename, String mimetype, byte[] imageBytes) {
		FileUploadDTO fileUploadDTO = new FileUploadDTO();
		fileUploadDTO.setFilename(filename);
		fileUploadDTO.setMimetype(mimetype);
		fileUploadDTO.setSize(imageBytes.length);
		return fileUploadDTO;
	}

	@Override
	public Response obtenerBancos(SecurityContext securityContext) {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerBancos";
		List<InstFinancieraDTO> resp = null;
		try {
			resp = fachada.getBancos();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerBancosYTarjetas(SecurityContext securityContext) {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerBancosYTarjetas";
		List<InstFinancieraDTO> resp = null;

		try {
			resp = fachada.getBancosYTarjetas();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerMediosDePago(SecurityContext securityContext) {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerMediosDePago";
		List<MedioDePagoDTO> resp = null;

		try {
			resp = fachada.getMediosDePago();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response emitir(SecurityContext securityContext, ParamEmisionDTO paramEmisionDTO) {
		final String INTERNAL_MESSAGE = "Error en servicio emitir";
		EmisionObjPersonalDTO resp = null;

		try {
			resp = fachada.emitir(paramEmisionDTO.getTipoDocumento(), paramEmisionDTO.getDocumento(),
					paramEmisionDTO.getMarca(), paramEmisionDTO.getSerie(), paramEmisionDTO.getModelo(),
					Long.valueOf(paramEmisionDTO.getNroCotizacion()), Integer.valueOf(paramEmisionDTO.getPlanPago()),
					DateHelper.stringToDate(paramEmisionDTO.getFechaFactura(), DateHelper.HYPHEN_YEAR_FIRST),
					paramEmisionDTO.getConsumoFinal());
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response controlarDeuda(SecurityContext securityContext, String tipoDocumento, String documento,
			String nroCotizacion, String nroCertificado) {
		final String INTERNAL_MESSAGE = "Error en servicio controlarDeuda";
		ClienteDeudaDTO resp = null;

		try {
			resp = fachada.controlarClienteConDeuda(tipoDocumento, documento, Long.valueOf(nroCotizacion),
					Integer.valueOf(nroCertificado));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response estadosTransaccion(SecurityContext securityContext, String idTransaccion) {
		final String INTERNAL_MESSAGE = "Error en servicio estadosTransaccion";
		EstadoTransaccionDTO resp = null;

		try {
			resp = fachada.getEstadoTransaccion(idTransaccion);
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response facturas(SecurityContext securityContext, String nroFactura) {
		final String INTERNAL_MESSAGE = "Error en servicio facturas";
		FacturaDTO resp = null;

		try {
			resp = fachada.getFactura(Long.valueOf(nroFactura));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response facturacion(SecurityContext securityContext, ParamFacturacionDTO paramFacturacionDTO) {
		final String INTERNAL_MESSAGE = "Error en servicio facturacion";
		NuevaFacturacionInteractivaDTO resp = null;

		try {
			resp = fachada.nuevaFacturacionInteractiva(getUserLoggedIn(securityContext),
					Integer.valueOf(paramFacturacionDTO.getCodRamo()),
					Integer.valueOf(paramFacturacionDTO.getNroPoliza()), paramFacturacionDTO.getContemplaDias(),
					DateHelper.stringToDate(paramFacturacionDTO.getFecha(), DateHelper.HYPHEN_YEAR_FIRST));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response adhesionFacturaDigital(SecurityContext securityContext,
			ParamAdhesionFacturaDigitalDTO paramAdhesionFacturaDigitalDTO) {
		final String INTERNAL_MESSAGE = "Error en servicio adhesionFacturaDigital";

		try {
			fachada.adherirFacturaDigital(getUserLoggedIn(securityContext),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getCodRamo()),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getNroPoliza()),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getSucursal()));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(new Object());
	}

	@Override
	public Response uploadFile(SecurityContext securityContext, String nroCotizacion, MultipartFormDataInput input) {
		final String FORM_FILE_FIELD = "fileField";
		final String JPEG_MIME_TYPE = "image/jpeg";
		final String ALLOWED_MIMETYPES = "image/png;" + JPEG_MIME_TYPE;
		final String FILENAME_PREFIX = "TIENDA-OPERSONAL";
		final String INTERNAL_MESSAGE = "Error en servicio uploadFile";

		List<InputPart> inputPartList = InputPartHelper.getInputPartList(input, FORM_FILE_FIELD);
		if (inputPartList.isEmpty()) {
			throw getGenericWsException("No se encontró key " + FORM_FILE_FIELD);
		}

		InputPart inputPart = inputPartList.get(0); // Solo se procesa una imagen

		String filename = InputPartHelper.getFileName(inputPart);
		if (filename == null || filename.isEmpty()) {
			throw getGenericWsException("No se encontró archivo");
		}

		String mimetype = InputPartHelper.getMimeType(inputPart);
		if (mimetype == null || mimetype.isEmpty()) {
			throw getGenericWsException("No se encontró mimetype");
		}

		logger.debug("Se recibe el archivo " + filename + ", MIME-TYPE " + mimetype);

		if (!ALLOWED_MIMETYPES.toLowerCase().contains(mimetype.toLowerCase())) {
			throw getGenericWsException(filename + " no es un archivo de imagen permitido");
		}

		FileUploadDTO fileUploadDTO = null;
		try {
			byte[] imageBytes = InputPartHelper.readFile(inputPart);
			if (imageBytes.length <= 0) {
				throw getGenericWsException("El archivo " + filename + " es demasiado grande");
			}

			// Se redimensiona la imagen
			byte[] resizedImage = InputPartHelper.resize(imageBytes);

			// Envía el archivo a persistencia
			String userLoggedIn = getUserLoggedIn(securityContext);
			String newFilename = getNewFilename(userLoggedIn, nroCotizacion, FILENAME_PREFIX);
			fachada.subirArchivo(userLoggedIn, newFilename, resizedImage, JPEG_MIME_TYPE);

			// Resultado exitoso
			fileUploadDTO = getFileUploadDTO(filename, mimetype, imageBytes);
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (IOException e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(fileUploadDTO);
	}

	@Override
	public Response numeroCliente(SecurityContext securityContext) {
		final String INTERNAL_MESSAGE = "Error en servicio numeroCliente";
		NumeroClienteDTO resp = null;

		try {
			resp = fachada.getNumeroCliente(getUserLoggedIn(securityContext));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerFirmaElectronica(SecurityContext securityContext, String textoPlano) {
		final String INTERNAL_MESSAGE = "Error en servicio obtenerFirmaElectronica";
		FirmaElectronicaDTO resp = null;

		try {
			resp = fachada.getFirmaElectronica(textoPlano);
		} catch (BusinessException be) {
			throw procesarBusinessException(be, INTERNAL_MESSAGE);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response redireccion(SecurityContext securityContext, HttpHeaders header, HttpServletResponse response,
			String referrer) {
		final String INTERNAL_MESSAGE = "Error en servicio redireccion";

		URI uri = null;
		try {
			uri = new URI(referrer);
		} catch (Exception e) {
			throw procesarException(e, INTERNAL_MESSAGE);
		}

		return Response.temporaryRedirect(uri).build();
	}
}
