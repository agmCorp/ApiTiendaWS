package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ParamFacturacionDTO implements Serializable {
	private static final long serialVersionUID = -4111893806130293600L;

	@NotEmpty(message = "No se encontró el parámetro 'codRamo'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'codRamo' no es un número")
	private String codRamo;

	@NotEmpty(message = "No se encontró el parámetro 'nroPoliza'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'nroPoliza' no es un número")
	private String nroPoliza;

	@Size(max = 1, message = "El parámetro 'contemplaDias' es demasiado largo")
	private String contemplaDias;

	@Pattern(regexp = "(^$)|(\\d{4}-\\d{2}-\\d{2})", message = "El parámetro 'fecha' no cumple el formato yyyy-mm-dd")
	private String fecha;

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

	public String getContemplaDias() {
		return contemplaDias;
	}

	public void setContemplaDias(String contemplaDias) {
		this.contemplaDias = contemplaDias;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
