package uy.com.bse.util.recaptcha;

import java.io.Serializable;

public class RecaptchaRequest implements Serializable {
	private static final long serialVersionUID = 5135963155181888399L;
	
	private String secret;
	private String response;
	private String remoteIP;

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getRemoteIP() {
		return remoteIP;
	}

	public void setRemoteIP(String remoteIP) {
		this.remoteIP = remoteIP;
	}
}