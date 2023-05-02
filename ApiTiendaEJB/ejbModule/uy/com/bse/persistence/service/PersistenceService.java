package uy.com.bse.persistence.service;

import java.util.Map;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.Logger;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.persistence.exception.PersistException;

public abstract class PersistenceService {
	private static final String CONFIG_ERROR = "configError";
	private static final String CONFIG_SOAP = "configSoap";
	private static final String ERROR_INESPERADO_CODIGO = "errorInesperado.codigo";
	private static final String ERROR_INESPERADO_MENSAJE = "errorInesperado.mensaje";

	protected ResourceBundle configError = ResourceBundle.getBundle(CONFIG_ERROR);
	protected ResourceBundle configSoap = ResourceBundle.getBundle(CONFIG_SOAP);

	@Inject
	protected Logger logger;

	protected void procesarWSFault(Exception e, String internalMessage) throws PersistException {
		ErrorDTO errorDTO = new ErrorDTO(configError.getString(ERROR_INESPERADO_CODIGO),
				configError.getString(ERROR_INESPERADO_MENSAJE), true);
		PersistException pe = new PersistException(errorDTO, internalMessage, e);
		throw pe;
	}

	protected void setEndpoint(BindingProvider proxy, String url) {
		Map<String, Object> requestCtx = proxy.getRequestContext();
		requestCtx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
	}

	protected void procesarErrorEnInicializacion() throws PersistException {
		if (!inicializacionCorrecta()) {
			ErrorDTO errorDTO = new ErrorDTO(configError.getString(ERROR_INESPERADO_CODIGO),
					configError.getString(ERROR_INESPERADO_MENSAJE), true);
			PersistException pe = new PersistException(errorDTO, "Componente no inicializado");
			throw pe;
		}
	}
	
	abstract protected Boolean inicializacionCorrecta();
}
