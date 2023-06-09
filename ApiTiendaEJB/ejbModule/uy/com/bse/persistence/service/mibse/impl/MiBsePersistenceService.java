package uy.com.bse.persistence.service.mibse.impl;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.mail.util.ByteArrayDataSource;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.mibse.NumeroClienteDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.mibse.IWsServiciosMiBse;
import uy.com.bse.persistence.proxy.mibse.ParamAdherirFacturaDigital;
import uy.com.bse.persistence.proxy.mibse.ParamInformarPagoRedes;
import uy.com.bse.persistence.proxy.mibse.ParamObtenerNumeroCliente;
import uy.com.bse.persistence.proxy.mibse.ParamSubirArchivo;
import uy.com.bse.persistence.proxy.mibse.ResultAdherirFacturaDigital;
import uy.com.bse.persistence.proxy.mibse.ResultGenerico;
import uy.com.bse.persistence.proxy.mibse.ResultInformarPagoRedes;
import uy.com.bse.persistence.proxy.mibse.ResultObtenerNumeroCliente;
import uy.com.bse.persistence.proxy.mibse.ResultSubirArchivo;
import uy.com.bse.persistence.proxy.mibse.ServiciosError;
import uy.com.bse.persistence.proxy.mibse.WsServiciosMiBse;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.mibse.dao.MiBseDAO;
import uy.com.bse.persistence.service.mibse.impl.map.NumeroClienteMap;
import uy.com.bse.persistence.support.LoggingPersistenceInterceptorBinding;

@Stateless
@LoggingPersistenceInterceptorBinding
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class MiBsePersistenceService extends PersistenceService implements MiBseDAO {
	private static final String URL = "miBse.url";

	@WebServiceRef(WsServiciosMiBse.class)
	private IWsServiciosMiBse proxy;
	
	private Boolean initOK = false;
	
	@PostConstruct
	private void init() {
		setEndpoint((BindingProvider) proxy, configSoap.getString(URL));
		initOK = true;
	}

	@Override
	protected Boolean inicializacionCorrecta() {
		return initOK;
	}

	private void procesarErrorEnRespuesta(ResultGenerico errorResultGenerico, String internalMessage)
			throws PersistException {

		if (errorResultGenerico.isHayError()) {
			ServiciosError serviciosError = errorResultGenerico.getError();
			ErrorDTO errorDTO = new ErrorDTO(String.valueOf(serviciosError.getCodigo()),
					serviciosError.getDescripcion(), false);
			PersistException e = new PersistException(errorDTO, internalMessage);
			throw e;
		}
	}

	@Override
	public void adherirFacturaDigital(String seguridadServiciosUser, String tokenSeguridad, Integer codRamo,
			Integer nroPoliza, Integer sucursal) throws PersistException {
		procesarErrorEnInicializacion();
		
		ResultAdherirFacturaDigital resp = null;
		try {
			ParamAdherirFacturaDigital param = new ParamAdherirFacturaDigital();
			param.setUsuario(seguridadServiciosUser);
			param.setClave(tokenSeguridad);
			param.setCodRamo(codRamo);
			param.setNumPoliza(nroPoliza);
			param.setSucursal(sucursal);

			resp = proxy.adherirFacturaDigital(param);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia adherirFacturaDigital");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia adherirFacturaDigital");
	}

	@Override
	public void subirArchivo(String seguridadServiciosUser, String tokenSeguridad, String nombreArchivo, byte[] archivo,
			String mimeType) throws PersistException {
		procesarErrorEnInicializacion();
		
		ResultSubirArchivo resp = null;
		try {
			ParamSubirArchivo param = new ParamSubirArchivo();
			param.setUsuario(seguridadServiciosUser);
			param.setClave(tokenSeguridad);
			param.setNombreArchivo(nombreArchivo);
			DataSource dataSource = new ByteArrayDataSource(archivo, mimeType);
			DataHandler dataHandler = new DataHandler(dataSource);
			param.setArchivo(dataHandler);
			param.setMimeType(mimeType);

			resp = proxy.subirArchivo(param);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia subirArchivo");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia subirArchivo");
	}

	@Override
	public NumeroClienteDTO getNumeroCliente(String seguridadServiciosUser, String tokenSeguridad)
			throws PersistException {
		procesarErrorEnInicializacion();
		
		ResultObtenerNumeroCliente resp = null;
		try {
			ParamObtenerNumeroCliente param = new ParamObtenerNumeroCliente();
			param.setUsuario(seguridadServiciosUser);
			param.setClave(tokenSeguridad);

			resp = proxy.obtenerNumeroCliente(param);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia getNumeroCliente");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia getNumeroCliente");
		
		return NumeroClienteMap.map(resp);
	}

	@Override
	public void informarPagoEnRedes(String seguridadServiciosUser, String tokenSeguridad, String idTransaccion,
			Long documentId, String codProd, String descProducto, Integer codRamo, String descRamo, Integer nroPoliza,
			Integer nroCertificado, String tipoDocumento, String nroDocumento, String nombres, String apellidos)  throws PersistException {
		procesarErrorEnInicializacion();
		
		ResultInformarPagoRedes resp = null;
		try {
			ParamInformarPagoRedes param = new ParamInformarPagoRedes();
			param.setUsuario(seguridadServiciosUser);
			param.setClave(tokenSeguridad);
			param.setIdTransaccion(idTransaccion);
			param.setDocumentId(String.valueOf(documentId));
			param.setCodProducto(codProd);
			param.setDescProducto(descProducto);
			param.setCodRamo(codRamo);
			param.setDescRamo(descRamo);
			param.setNumPoliza(nroPoliza);
			param.setCertificado(nroCertificado);
			param.setTipoDocumento(tipoDocumento);
			param.setNroDocumento(nroDocumento);
			param.setNombres(nombres);
			param.setApellidos(apellidos);

			resp = proxy.informarPagoRedes(param);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia informarPagoEnRedes");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia informarPagoEnRedes");
	}
}
