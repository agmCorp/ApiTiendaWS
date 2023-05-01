package uy.com.bse.util;

import java.util.ResourceBundle;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {
	private static final String CONFIG = "configError";
	private static final String ERROR_INESPERADO_CODIGO = "errorConstraintViolation.codigo";

	private ResourceBundle config = ResourceBundle.getBundle(CONFIG);
	
    @Override
    public Response toResponse(ConstraintViolationException e) {
        String message = e.getConstraintViolations().stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.joining(", "));
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new EntityError(config.getString(ERROR_INESPERADO_CODIGO), message))
                .build();
    }
}
