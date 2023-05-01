package uy.com.bse.dto.objpersonal;

import java.io.Serializable;

public class ClienteDeudaDTO implements Serializable {
	private static final long serialVersionUID = 8552822865345375645L;

	private Boolean clienteConDeuda;

	public Boolean getClienteConDeuda() {
		return clienteConDeuda;
	}

	public void setClienteConDeuda(Boolean clienteConDeuda) {
		this.clienteConDeuda = clienteConDeuda;
	}
}
