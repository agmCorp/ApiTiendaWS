package uy.com.bse.dto.firmaelectronica;

import java.io.Serializable;

public class FirmaElectronicaDTO implements Serializable {
	private static final long serialVersionUID = -4395554027459456699L;

	private String firma;
	private Long sessionId;

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
}
