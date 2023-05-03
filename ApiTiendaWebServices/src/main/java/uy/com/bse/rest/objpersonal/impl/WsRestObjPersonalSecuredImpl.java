package uy.com.bse.rest.objpersonal.impl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.logging.log4j.Logger;
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
import uy.com.bse.rest.support.LoggingWsInterceptorBinding;
import uy.com.bse.util.DateHelper;
import uy.com.bse.util.InputPartHelper;

@LoggingWsInterceptorBinding
public class WsRestObjPersonalSecuredImpl extends WsRestObjPersonalBase implements WsRestObjPersonalSecured {
	@Inject
	Logger logger;

	@Override
	public Response obtenerBancos(SecurityContext securityContext) {
		String msgErr = "Error en servicio obtenerBancos";
		List<InstFinancieraDTO> resp = null;
		try {
			resp = getFachada().getBancos();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerBancosYTarjetas(SecurityContext securityContext) {
		String msgErr = "Error en servicio obtenerBancosYTarjetas";
		List<InstFinancieraDTO> resp = null;

		try {
			resp = getFachada().getBancosYTarjetas();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerMediosDePago(SecurityContext securityContext) {
		String msgErr = "Error en servicio obtenerMediosDePago";
		List<MedioDePagoDTO> resp = null;

		try {
			resp = getFachada().getMediosDePago();
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response emitir(SecurityContext securityContext, ParamEmisionDTO paramEmisionDTO) {
		String msgErr = "Error en servicio emitir";
		EmisionObjPersonalDTO resp = null;

		try {
			resp = getFachada().emitir(paramEmisionDTO.getTipoDocumento(), paramEmisionDTO.getDocumento(),
					paramEmisionDTO.getMarca(), paramEmisionDTO.getSerie(), paramEmisionDTO.getModelo(),
					Long.valueOf(paramEmisionDTO.getNroCotizacion()), Integer.valueOf(paramEmisionDTO.getPlanPago()),
					DateHelper.stringToDate(paramEmisionDTO.getFechaFactura(), DateHelper.HYPHEN_YEAR_FIRST),
					paramEmisionDTO.getConsumoFinal());
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response controlarDeuda(SecurityContext securityContext, String tipoDocumento, String documento,
			String nroCotizacion, String nroCertificado) {
		String msgErr = "Error en servicio controlarDeuda";
		ClienteDeudaDTO resp = null;

		try {
			resp = getFachada().controlarClienteConDeuda(tipoDocumento, documento, Long.valueOf(nroCotizacion),
					Integer.valueOf(nroCertificado));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response estadosTransaccion(SecurityContext securityContext, String idTransaccion) {
		String msgErr = "Error en servicio estadosTransaccion";
		EstadoTransaccionDTO resp = null;

		try {
			resp = getFachada().getEstadoTransaccion(idTransaccion);
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response facturas(SecurityContext securityContext, String nroFactura) {
		String msgErr = "Error en servicio facturas";
		FacturaDTO resp = null;

		try {
			resp = getFachada().getFactura(Long.valueOf(nroFactura));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response facturacion(SecurityContext securityContext, ParamFacturacionDTO paramFacturacionDTO) {
		String msgErr = "Error en servicio facturacion";
		NuevaFacturacionInteractivaDTO resp = null;

		try {
			resp = getFachada().nuevaFacturacionInteractiva(getUserLoggedIn(securityContext),
					Integer.valueOf(paramFacturacionDTO.getCodRamo()),
					Integer.valueOf(paramFacturacionDTO.getNroPoliza()), paramFacturacionDTO.getContemplaDias(),
					DateHelper.stringToDate(paramFacturacionDTO.getFecha(), DateHelper.HYPHEN_YEAR_FIRST));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response adhesionFacturaDigital(SecurityContext securityContext,
			ParamAdhesionFacturaDigitalDTO paramAdhesionFacturaDigitalDTO) {
		String msgErr = "Error en servicio adhesionFacturaDigital";
		
		try {
			getFachada().adherirFacturaDigital(getUserLoggedIn(securityContext),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getCodRamo()),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getNroPoliza()),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getSucursal()));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(new Object());
	}

	@Override
	public Response uploadFile(SecurityContext securityContext, String nroCotizacion, MultipartFormDataInput input) {
		String msgErr = "Error en servicio uploadFile";
		
		final String FORM_FILE_FIELD = "fileField";
		final String PNG_MIME_TYPE = "image/png";
		final String JPEG_MIME_TYPE = "image/jpeg";
		final Integer NEW_WIDTH_PX = 700;
		final Integer WIDTH_OFFSET_PX = NEW_WIDTH_PX / 10;
		final String FORMAT_NAME = "jpg";
		final String FILENAME_PREFIX = "TIENDA-OPERSONAL";
		final Integer FILE_SIZE_THRESHOLD_MEGA_BYTES = 5; // Máximo 5MB por archivo

		String msgError = null;
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		FileUploadDTO fileUploadDTO = null;

		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
		List<InputPart> inputParts = uploadForm.getOrDefault(FORM_FILE_FIELD, new ArrayList<InputPart>());

		if (inputParts.isEmpty()) {
			msgError = "No se encontró key fileField";
		} else {
			InputPart inputPart = inputParts.get(0); // Solo se procesa un archivo
			MultivaluedMap<String, String> header = inputPart.getHeaders();
			String filename = InputPartHelper.getFileName(header);
			String mimetype = InputPartHelper.getMimeType(header);

			logger.debug("Se recibe el archivo " + filename + ", MIME-TYPE " + mimetype);
			
			if (mimetype.equals(PNG_MIME_TYPE) || mimetype.equals(JPEG_MIME_TYPE)) {
				try {
					// Convierte el archivo recibido a Inputstream
					InputStream inputStream = inputPart.getBody(InputStream.class, null);

					// Se leen hasta FILE_SIZE_THRESHOLD_MEGA_BYTES
					byte[] bytes = InputPartHelper.readInputStream(inputStream, FILE_SIZE_THRESHOLD_MEGA_BYTES);
					
					if (bytes.length > 0) {
						// Convierte byte[] a BufferedImage
						is = new ByteArrayInputStream(bytes);
						BufferedImage image = ImageIO.read(is);

						// Se redimensiona la imagen para evitar vulnerabilidades
						int newWidth = (image.getWidth() == NEW_WIDTH_PX) ? NEW_WIDTH_PX + WIDTH_OFFSET_PX
								: NEW_WIDTH_PX;
						BufferedImage resizedImage = InputPartHelper.resizeImage(image, newWidth,
								(image.getHeight() * newWidth) / image.getWidth());

						// Convierte BufferedImage a byte[]
						baos = new ByteArrayOutputStream();
						ImageIO.write(resizedImage, FORMAT_NAME, baos);
						byte[] resizedFile = baos.toByteArray();

						// Define nuevo nombre de archivo en función de datos del usuario logueado
						String userLoggedIn = getUserLoggedIn(securityContext);
						NumeroClienteDTO numeroClienteDTO = getFachada().getNumeroCliente(userLoggedIn);
						String newFilename = FILENAME_PREFIX + "-" + nroCotizacion + "-"
								+ getUserLoggedInTipoDoc(userLoggedIn) + "-" + getUserLoggedInDoc(userLoggedIn) + "-"
								+ numeroClienteDTO.getNumCliente() + "-" + UUID.randomUUID().toString() + ".jpg";

						// Envía el archivo a persistencia
						getFachada().subirArchivo(userLoggedIn, newFilename, resizedFile, JPEG_MIME_TYPE);
						
						// Retorna resultado exitoso
						fileUploadDTO = new FileUploadDTO();
						fileUploadDTO.setFilename(filename);
						fileUploadDTO.setMimetype(mimetype);
						fileUploadDTO.setSize(bytes.length);
					} else {
						msgError = "El archivo " + filename + " es demasiado grande, se permiten hasta " + FILE_SIZE_THRESHOLD_MEGA_BYTES + "MB";
					}
				} catch (BusinessException be) {
					throw procesarBusinessException(be, msgErr);
				} catch (Exception e) {
					throw procesarException(e, msgErr);
				} finally {
					if (is != null) {
						try {
							is.close();
						} catch (IOException e) {
							throw procesarException(e, msgErr);
						}
					}
					if (baos != null) {
						try {
							baos.close();
						} catch (IOException e) {
							throw procesarException(e, msgErr);
						}
					}
				}
			} else {
				msgError = filename + " no es un archivo de imagen";
			}
		}

		if (msgError != null) {
			throw getGenericWsException(msgError);
		}
		
		return getResponseOK(fileUploadDTO); 
	}

	@Override
	public Response numeroCliente(SecurityContext securityContext) {
		String msgErr = "Error en servicio numeroCliente";
		NumeroClienteDTO resp = null;

		try {
			resp = getFachada().getNumeroCliente(getUserLoggedIn(securityContext));
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerFirmaElectronica(SecurityContext securityContext, String textoPlano) {
		String msgErr = "Error en servicio obtenerFirmaElectronica";
		FirmaElectronicaDTO resp = null;

		try {
			resp = getFachada().getFirmaElectronica(textoPlano);
		} catch (BusinessException be) {
			throw procesarBusinessException(be, msgErr);
		} catch (Exception e) {
			throw procesarException(e, msgErr);
		}

		return getResponseOK(resp);
	}
}
