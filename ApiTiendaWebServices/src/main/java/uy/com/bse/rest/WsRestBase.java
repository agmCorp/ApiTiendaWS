package uy.com.bse.rest;

import java.security.Principal;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.logging.log4j.Logger;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.AccessToken;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.exception.BusinessException;
import uy.com.bse.exception.WsException;
import uy.com.bse.util.common.EntityError;
import uy.com.bse.util.recaptcha.RecaptchaConfig;

public class WsRestBase {
	private static final String CONFIG_ERROR = "configError";
	private static final String ERROR_INESPERADO_CODIGO = "errorInesperado.codigo";
	private static final String ERROR_INESPERADO_MENSAJE = "errorInesperado.mensaje";
	private ResourceBundle configError = ResourceBundle.getBundle(CONFIG_ERROR);

	private static final String CONFIG_RECAPTCHA = "configRecaptcha";
	private static final String SERVICE_URL = "serviceUrl";
	private static final String SECRET_KEY = "secretKey";
	private static final String PROXY_ENABLED = "proxyEnabled";
	private static final String PROXY_HOST = "proxyHost";
	private static final String PROXY_PORT = "proxyPort";
	private ResourceBundle configRecaptcha = ResourceBundle.getBundle(CONFIG_RECAPTCHA);

	@Inject
	protected Logger logger;

	private EntityError getGenericError() {
		return new EntityError(configError.getString(ERROR_INESPERADO_CODIGO),
				configError.getString(ERROR_INESPERADO_MENSAJE));
	}

	protected RecaptchaConfig getRecaptchaConfig() {
		RecaptchaConfig recaptchaConfig = new RecaptchaConfig();
		recaptchaConfig.setServiceUrl(configRecaptcha.getString(SERVICE_URL));
		recaptchaConfig.setSecretKey(configRecaptcha.getString(SECRET_KEY));
		recaptchaConfig.setProxyEnabled(configRecaptcha.getString(PROXY_ENABLED).toLowerCase().equals("true"));
		if (recaptchaConfig.getProxyEnabled()) {
			recaptchaConfig.setProxyHost(configRecaptcha.getString(PROXY_HOST));
			recaptchaConfig.setProxyPort(configRecaptcha.getString(PROXY_PORT));
		}

		return recaptchaConfig;
	}

	protected AccessToken getKeycloakAccessToken(SecurityContext securityContext) {
		Principal userPricipal = securityContext.getUserPrincipal();
		@SuppressWarnings("unchecked")
		KeycloakPrincipal<KeycloakSecurityContext> kp = (KeycloakPrincipal<KeycloakSecurityContext>) userPricipal;
		return kp.getKeycloakSecurityContext().getToken();
	}

	protected Response getResponseOK(Object resp) {
		ResponseBuilder builder = Response.ok();
		builder.status(Status.OK);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(resp);

		return builder.build();
	}

	protected WsException getGenericWsException(String internalMessage) {
		EntityError entityError = getGenericError();
		ResponseBuilder builder = Response.serverError();
		builder.status(Status.INTERNAL_SERVER_ERROR);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(entityError);
		WsException wsException = new WsException(builder.build());
		wsException.setInternalMessage(internalMessage);
		return wsException;
	}

	protected WsException procesarBusinessException(BusinessException e, String internalMessage) {
		ErrorDTO businessExceptionError = e.getError();
		EntityError entityError = new EntityError(businessExceptionError.getErrorTraceNumber(),
				businessExceptionError.getMessage());
		ResponseBuilder builder = Response.serverError();
		builder.status(businessExceptionError.getFatal() ? Status.INTERNAL_SERVER_ERROR : Status.BAD_REQUEST);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(entityError);
		WsException wsException = new WsException(builder.build());
		wsException.setInternalMessage(internalMessage);
		return wsException;
	}

	protected WsException procesarException(Exception e, String internalMessage) {
		EntityError entityError = getGenericError();
		ResponseBuilder builder = Response.serverError();
		builder.status(Status.INTERNAL_SERVER_ERROR);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(entityError);
		WsException wsException = new WsException(e, builder.build());
		wsException.setInternalMessage(internalMessage);
		return wsException;
	}
}
