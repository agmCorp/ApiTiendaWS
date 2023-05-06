package uy.com.bse.util.recaptcha;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public class RecaptchaClient {
	private Client client;
	private String serviceUrl;
	private String secretKey;

	public RecaptchaClient(RecaptchaConfig recaptchaConfig) {
		serviceUrl = recaptchaConfig.getServiceUrl();
		secretKey = recaptchaConfig.getSecretKey();
		if (recaptchaConfig.getProxyEnabled()) {
			client = ClientBuilder.newBuilder()
					.property("org.jboss.resteasy.jaxrs.client.proxy.host", recaptchaConfig.getProxyHost())
					.property("org.jboss.resteasy.jaxrs.client.proxy.port", recaptchaConfig.getProxyPort()).build();
		} else {
			client = ClientBuilder.newClient();
		}
	}
	
	public Response verify(String response, String remoteIp) {
		WebTarget target = client.target(serviceUrl);
		Invocation.Builder builder = target.request(MediaType.APPLICATION_FORM_URLENCODED);
		MultivaluedMap<String, String> formData = new MultivaluedHashMap<>();
		formData.add("secret", secretKey);
		formData.add("response", response);
		formData.add("remoteip", remoteIp);
		Response recaptchaResponse = builder.post(Entity.form(formData));
		
		return recaptchaResponse;
	}
}
