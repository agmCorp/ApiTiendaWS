package uy.com.bse.dto.seguridadservicios;

import java.io.Serializable;

public class SeguridadServiciosDTO implements Serializable {
	private static final long serialVersionUID = -2850394990294459053L;
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
