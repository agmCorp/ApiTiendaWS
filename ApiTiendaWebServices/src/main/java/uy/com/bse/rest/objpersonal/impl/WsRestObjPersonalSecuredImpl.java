package uy.com.bse.rest.objpersonal.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
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
import uy.com.bse.util.DateHelper;

public class WsRestObjPersonalSecuredImpl extends WsRestObjPersonalBase implements WsRestObjPersonalSecured {

	// TODO ALVARO OJO
	//@Inject
	//protected Logger logger;

	@Override
	public Response obtenerBancos(SecurityContext securityContext) {
		List<InstFinancieraDTO> resp = null;
		try {
			resp = getFachada().getBancos();
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerBancosYTarjetas(SecurityContext securityContext) {
		List<InstFinancieraDTO> resp = null;

		try {
			// TODO ALVARO
			//logger.error("ANTES DE INVOCAR!!!!!");

			resp = getFachada().getBancosYTarjetas();
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerMediosDePago(SecurityContext securityContext) {
		List<MedioDePagoDTO> resp = null;

		try {
			resp = getFachada().getMediosDePago();
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response emitir(SecurityContext securityContext, ParamEmisionDTO paramEmisionDTO) {
		EmisionObjPersonalDTO resp = null;

		try {
			resp = getFachada().emitir(paramEmisionDTO.getTipoDocumento(), paramEmisionDTO.getDocumento(),
					paramEmisionDTO.getMarca(), paramEmisionDTO.getSerie(), paramEmisionDTO.getModelo(),
					Long.valueOf(paramEmisionDTO.getNroCotizacion()), Integer.valueOf(paramEmisionDTO.getPlanPago()),
					DateHelper.stringToDate(paramEmisionDTO.getFechaFactura(), DateHelper.HYPHEN_YEAR_FIRST),
					paramEmisionDTO.getConsumoFinal());
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response controlarDeuda(SecurityContext securityContext, String tipoDocumento, String documento,
			String nroCotizacion, String nroCertificado) {
		ClienteDeudaDTO resp = null;

		try {
			resp = getFachada().controlarClienteConDeuda(tipoDocumento, documento, Long.valueOf(nroCotizacion),
					Integer.valueOf(nroCertificado));
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response estadosTransaccion(SecurityContext securityContext, String idTransaccion) {
		EstadoTransaccionDTO resp = null;

		try {
			resp = getFachada().getEstadoTransaccion(idTransaccion);
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response facturas(SecurityContext securityContext, String nroFactura) {
		FacturaDTO resp = null;

		try {
			resp = getFachada().getFactura(Long.valueOf(nroFactura));
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		} catch(Exception ex) { // TODO ALVARO PONERLO EN TODOS LADOS POR LAS DUDAS?
			throw exceptionToWsException(ex);
		}

		
		return getResponseOK(resp);
	}

	@Override
	public Response facturacion(SecurityContext securityContext, ParamFacturacionDTO paramFacturacionDTO) {
		NuevaFacturacionInteractivaDTO resp = null;

		try {
			resp = getFachada().nuevaFacturacionInteractiva(getUserLoggedIn(securityContext),
					Integer.valueOf(paramFacturacionDTO.getCodRamo()),
					Integer.valueOf(paramFacturacionDTO.getNroPoliza()), paramFacturacionDTO.getContemplaDias(),
					DateHelper.stringToDate(paramFacturacionDTO.getFecha(), DateHelper.HYPHEN_YEAR_FIRST));
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response adhesionFacturaDigital(SecurityContext securityContext,
			ParamAdhesionFacturaDigitalDTO paramAdhesionFacturaDigitalDTO) {
		try {
			getFachada().adherirFacturaDigital(getUserLoggedIn(securityContext),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getCodRamo()),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getNroPoliza()),
					Integer.valueOf(paramAdhesionFacturaDigitalDTO.getSucursal()));
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(new Object());
	}

	@Override
	public Response uploadFile(SecurityContext securityContext, MultipartFormDataInput input) {
		// TODO ALVARO
		/*
		 * debo controlar tamaño de archivo debo devolver response error si filefiled no
		 * existe debo devolver error si hay alguna ioexception luego debo llamar al
		 * servicio soap usar constantes para todo en lugar de textos escritos por ahi
		 * Esto recibe tantos archivos como campos fileField ponga en el form. writes
		 * the whole File to the Memory causing a OOME
		 */
		final String FORM_FILE_FIELD = "fileField";
		final String JPEG_MIME_TYPE = "image/jpeg";

		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
		List<InputPart> inputParts = uploadForm.get(FORM_FILE_FIELD); // puede ser nullpointer si le erro al nombrar al
																		// campito en front

		for (InputPart inputPart : inputParts) {
			try {
				MultivaluedMap<String, String> header = inputPart.getHeaders();
				String fileName = getFileName(header);

				// Convert the uploaded file to inputstream
				InputStream inputStream = inputPart.getBody(InputStream.class, null);
				byte[] bytes = IOUtils.toByteArray(inputStream);

				System.out.println("recibi un archivo de nombre " + fileName + " y tamaño: " + bytes.length + "bytes");

				/* aca hago lo que hago siempre */
				try {
					getFachada().subirArchivo(getUserLoggedIn(securityContext),
							"oravla_" + UUID.randomUUID().toString() + ".jpg", bytes, JPEG_MIME_TYPE);
				} catch (BusinessException e) {
					throw businessExceptionToWsException(e);
				}

				// COMO ACA HAY UN RETURN, SE SUBE UN SOLO ARCHIVO PERO EN REALIDAD SE PROCESAN
				// LOS DOS, TENDRIA QUE PONER UN BRAKE O ALGO.
				return getResponseOK(new Object());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * header sample { Content-Type=[image/png], Content-Disposition=[form-data;
	 * name="file"; filename="filename.extension"] }
	 **/
	private String getFileName(MultivaluedMap<String, String> header) {
		final String CONTENT_DISPOSITION = "Content-Disposition";
		final String FILENAME = "filename";

		String result = null;
		String[] contentDisposition = header.getFirst(CONTENT_DISPOSITION).split(";");
		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith(FILENAME))) {
				String[] name = filename.split("=");
				result = name[1].trim().replaceAll("\"", "");
				break;
			}
		}

		/*
		 * MultivaluedMap heades = part.getHeaders(); String CDHeader =
		 * heades.getFirst("Content-Disposition"); String fileName =""; Pattern p =
		 * Pattern.compile("filename=\".*\""); Matcher m = p.matcher(CDHeader); if
		 * (m.find()){ fileName = m.group(); }
		 */

		return result;
	}

	@Override
	public Response numeroCliente(SecurityContext securityContext) {
		NumeroClienteDTO resp = null;

		try {
			resp = getFachada().getNumeroCliente(getUserLoggedIn(securityContext));
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}

	@Override
	public Response obtenerFirmaElectronica(SecurityContext securityContext, String textoPlano) {
		FirmaElectronicaDTO resp = null;

		try {
			resp = getFachada().getFirmaElectronica(textoPlano);
		} catch (BusinessException e) {
			throw businessExceptionToWsException(e);
		}

		return getResponseOK(resp);
	}
}
