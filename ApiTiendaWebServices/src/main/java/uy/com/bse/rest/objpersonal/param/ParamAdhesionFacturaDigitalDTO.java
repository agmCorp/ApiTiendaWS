package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ParamAdhesionFacturaDigitalDTO implements Serializable {
	private static final long serialVersionUID = 4683246606909655970L;

	@NotEmpty(message = "No se encontró el parámetro 'codRamo'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'codRamo' no es un número")
	private String codRamo;

	@NotEmpty(message = "No se encontró el parámetro 'nroPoliza'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'nroPoliza' no es un número")
	private String nroPoliza;

	@NotEmpty(message = "No se encontró el parámetro 'sucursal'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'sucursal' no es un número")
	private String sucursal;

	public String getCodRamo() {
		return codRamo;
	}

	public void setCodRamo(String codRamo) {
		this.codRamo = codRamo;
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
}
