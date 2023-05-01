package uy.com.bse.dto.pagoelectronico;

import java.io.Serializable;

public class EstadoTransaccionDTO implements Serializable {
	private static final long serialVersionUID = -4933137728619149929L;

	private String codigoErrorBanco;

	public String getCodigoErrorBanco() {
		return codigoErrorBanco;
	}

	public void setCodigoErrorBanco(String codigoErrorBanco) {
		this.codigoErrorBanco = codigoErrorBanco;
	}
}
