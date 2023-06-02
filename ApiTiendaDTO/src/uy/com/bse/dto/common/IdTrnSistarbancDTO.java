package uy.com.bse.dto.common;

import java.io.Serializable;

public class IdTrnSistarbancDTO implements Serializable {
	private static final long serialVersionUID = -8390747831493022353L;
	
	private String idTrn;

	public String getIdTrn() {
		return idTrn;
	}

	public void setIdTrn(String idTrn) {
		this.idTrn = idTrn;
	}
}
