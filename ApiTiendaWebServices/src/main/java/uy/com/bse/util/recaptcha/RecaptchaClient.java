package uy.com.bse.util.recaptcha;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
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

	public RecaptchaResponse verify(String response, String remoteIP) {
		RecaptchaRequest request = new RecaptchaRequest();
		request.setSecret(secretKey);
		request.setResponse(response);
		request.setRemoteIP(remoteIP);

		Response recaptchaResponse = client.target(serviceUrl).request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(request, MediaType.APPLICATION_JSON));

		return recaptchaResponse.readEntity(RecaptchaResponse.class);
	}
}
