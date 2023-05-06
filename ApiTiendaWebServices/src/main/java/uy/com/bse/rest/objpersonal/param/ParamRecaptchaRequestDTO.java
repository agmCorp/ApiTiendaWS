package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class ParamRecaptchaRequestDTO implements Serializable {
	private static final long serialVersionUID = 8931981332037751950L;
	
	@NotEmpty(message = "No se encontró el parámetro 'response'")
	private String response;
	private String remoteIp;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}
}
