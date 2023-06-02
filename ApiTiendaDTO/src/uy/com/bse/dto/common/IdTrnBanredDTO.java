package uy.com.bse.dto.common;

import java.io.Serializable;

public class IdTrnBanredDTO implements Serializable {
	private static final long serialVersionUID = -4219825724689759655L;
	
	private String idTrn;
	private String idTrnFirmado;

	public String getIdTrn() {
		return idTrn;
	}

	public void setIdTrn(String idTrn) {
		this.idTrn = idTrn;
	}

	public String getIdTrnFirmado() {
		return idTrnFirmado;
	}

	public void setIdTrnFirmado(String idTrnFirmado) {
		this.idTrnFirmado = idTrnFirmado;
	}
}
