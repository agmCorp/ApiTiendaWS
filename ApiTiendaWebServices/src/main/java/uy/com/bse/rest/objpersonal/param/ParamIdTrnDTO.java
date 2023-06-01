package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class ParamIdTrnDTO implements Serializable {
	private static final long serialVersionUID = -8108255446308595408L;

	@NotEmpty(message = "No se encontró el parámetro 'medioDePago'")
	private String medioDePago;

	@NotEmpty(message = "No se encontró el parámetro 'nroFactura'")
	private String nroFactura;

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public String getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}
}