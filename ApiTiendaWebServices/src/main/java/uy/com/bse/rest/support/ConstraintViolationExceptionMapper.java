package uy.com.bse.rest.support;

import java.util.ResourceBundle;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import uy.com.bse.util.common.EntityError;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {
	private static final String CONFIG_ERROR = "configError";
	private static final String ERROR_REGLA_VALIDACION_CODIGO = "errorReglaValidacion.codigo";
	private static final String ERROR_REGLA_VALIDACION_MENSAJE = "errorReglaValidacion.mensaje";

	private ResourceBundle configError = ResourceBundle.getBundle(CONFIG_ERROR);
	
    @Override
    public Response toResponse(ConstraintViolationException e) {
        String message = e.getConstraintViolations().stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.joining(", "));
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new EntityError(configError.getString(ERROR_REGLA_VALIDACION_CODIGO), configError.getString(ERROR_REGLA_VALIDACION_MENSAJE) + ": " + message))
                .build();
    }
}
