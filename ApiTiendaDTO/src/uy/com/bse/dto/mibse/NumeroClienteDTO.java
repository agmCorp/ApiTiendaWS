package uy.com.bse.dto.mibse;

import java.io.Serializable;

public class NumeroClienteDTO implements Serializable {
	private static final long serialVersionUID = -1457061134973434840L;
	
	private Integer numCliente;

	public Integer getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(Integer numCliente) {
		this.numCliente = numCliente;
	}
}
