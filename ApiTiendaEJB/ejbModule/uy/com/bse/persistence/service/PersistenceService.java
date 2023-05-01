package uy.com.bse.persistence.service;

import java.util.Map;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.Logger;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.persistence.exception.PersistException;

public class PersistenceService {
	private static final String CONFIG = "configSoap";
	private static final String ERROR_INESPERADO_CODIGO = "errorInesperado.codigo";
	private static final String ERROR_INESPERADO_MENSAJE = "errorInesperado.mensaje";

	protected ResourceBundle config = ResourceBundle.getBundle(CONFIG);

	@Inject
	protected Logger logger;

	protected void procesarWSFault(Exception e, String internalMessage) throws PersistException {
		ErrorDTO errorDTO = new ErrorDTO(config.getString(ERROR_INESPERADO_CODIGO),
				config.getString(ERROR_INESPERADO_MENSAJE), true);
		PersistException pe = new PersistException(errorDTO, internalMessage, e);
		throw pe;
	}

	protected void setEndpoint(BindingProvider proxy, String url) {
		Map<String, Object> requestCtx = proxy.getRequestContext();
		requestCtx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
	}
}
