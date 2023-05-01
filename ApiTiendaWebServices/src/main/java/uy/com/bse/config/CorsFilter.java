package uy.com.bse.config;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CorsFilter implements ContainerResponseFilter {
	private static final String CONFIG = "configCors";
	private static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
	private static final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
	private static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
	private static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
	
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		
		ResourceBundle config = ResourceBundle.getBundle(CONFIG);
		responseContext.getHeaders().add("Access-Control-Allow-Origin", config.getString(ACCESS_CONTROL_ALLOW_ORIGIN));
		responseContext.getHeaders().add("Access-Control-Allow-Credentials", config.getString(ACCESS_CONTROL_ALLOW_CREDENTIALS));
		responseContext.getHeaders().add("Access-Control-Allow-Headers", config.getString(ACCESS_CONTROL_ALLOW_HEADERS));
		responseContext.getHeaders().add("Access-Control-Allow-Methods", config.getString(ACCESS_CONTROL_ALLOW_METHODS));
	}
}