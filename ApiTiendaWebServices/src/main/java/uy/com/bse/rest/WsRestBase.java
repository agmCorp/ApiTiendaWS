package uy.com.bse.rest;

import java.security.Principal;
import java.util.ResourceBundle;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.AccessToken;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.exception.BusinessException;
import uy.com.bse.exception.WsException;
import uy.com.bse.util.EntityError;

public class WsRestBase {
	private static final String CONFIG_ERROR = "configError";
	private static final String ERROR_INESPERADO_CODIGO = "errorInesperado.codigo";
	private static final String ERROR_INESPERADO_MENSAJE = "errorInesperado.mensaje";

	private ResourceBundle configError = ResourceBundle.getBundle(CONFIG_ERROR);

	protected ErrorDTO getGenericError() {
		return new ErrorDTO(configError.getString(ERROR_INESPERADO_CODIGO),
				configError.getString(ERROR_INESPERADO_MENSAJE), true);
	}

	protected Response getResponseOK(Object resp) {
		ResponseBuilder builder = Response.ok();
		builder.status(Status.OK);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(resp);

		return builder.build();
	}

	protected WsException businessExceptionToWsException(BusinessException e) {
		// TODO ALVARO LOGUEAR LA BusinessException e aunque ya se loguea en capas abajo
		ErrorDTO businessExceptionError = e.getError();
		EntityError entityError = new EntityError(businessExceptionError.getErrorTraceNumber(),
				businessExceptionError.getMessage());
		ResponseBuilder builder = Response.serverError();
		builder.status(businessExceptionError.getFatal() ? Status.INTERNAL_SERVER_ERROR : Status.BAD_REQUEST);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(entityError);
		return new WsException(builder.build());
	}

	// TODO ALVARO VER SI HAGO ESTO
	protected WsException exceptionToWsException(Exception e) {
		// TODO ALVARO LOGUEAR LA Exception
		ErrorDTO errorDTO = getGenericError();
		EntityError entityError = new EntityError(errorDTO.getErrorTraceNumber(), errorDTO.getMessage());
		ResponseBuilder builder = Response.serverError();
		builder.status(Status.INTERNAL_SERVER_ERROR);
		builder.type(MediaType.APPLICATION_JSON);
		builder.entity(entityError);
		return new WsException(builder.build());
	}

	protected AccessToken getKeycloakAccessToken(SecurityContext securityContext) {
		Principal userPricipal = securityContext.getUserPrincipal();
		@SuppressWarnings("unchecked")
		KeycloakPrincipal<KeycloakSecurityContext> kp = (KeycloakPrincipal<KeycloakSecurityContext>) userPricipal;
		return kp.getKeycloakSecurityContext().getToken();
	}
}
