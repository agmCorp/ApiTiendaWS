package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ParamCotizacionDTO implements Serializable {
	private static final long serialVersionUID = 3858330298824905939L;

	@NotEmpty(message = "No se encontró el parámetro 'planCobertura'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'planCobertura' no es un número")
	private String planCobertura;

	@NotEmpty(message = "No se encontró el parámetro 'tipoObjeto'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'tipoObjeto' no es un número")
	private String tipoObjeto;

	@NotEmpty(message = "No se encontró el parámetro 'valorObjeto'")
	@Pattern(regexp = "\\d+(\\.\\d+)?", message = "El parámetro 'valorObjeto' no es un número")
	private String valorObjeto;

	@NotEmpty(message = "No se encontró el parámetro 'movilidad'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'movilidad' no es un número")
	private String movilidad;

	public String getPlanCobertura() {
		return planCobertura;
	}

	public void setPlanCobertura(String planCobertura) {
		this.planCobertura = planCobertura;
	}

	public String getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

	public String getValorObjeto() {
		return valorObjeto;
	}

	public void setValorObjeto(String valorObjeto) {
		this.valorObjeto = valorObjeto;
	}

	public String getMovilidad() {
		return movilidad;
	}

	public void setMovilidad(String movilidad) {
		this.movilidad = movilidad;
	}
}
