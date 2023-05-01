package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ParamEmisionDTO implements Serializable {
	private static final long serialVersionUID = 1661536133425443044L;

	@NotEmpty(message = "No se encontró el parámetro 'tipoDocumento'")
	private String tipoDocumento;

	@NotEmpty(message = "No se encontró el parámetro 'documento'")
	private String documento;

	@NotEmpty(message = "No se encontró el parámetro 'marca'")
	private String marca;

	@NotEmpty(message = "No se encontró el parámetro 'serie'")
	private String serie;

	@NotEmpty(message = "No se encontró el parámetro 'modelo'")
	private String modelo;

	@NotEmpty(message = "No se encontró el parámetro 'nroCotizacion'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'nroCotizacion' no es un número")
	private String nroCotizacion;

	@NotEmpty(message = "No se encontró el parámetro 'planPago'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'planPago' no es un número")
	private String planPago;

	@NotEmpty(message = "No se encontró el parámetro 'fechaFactura'")
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "El parámetro 'fechaFactura' no cumple el formato yyyy-mm-dd")
	private String fechaFactura;

	@NotEmpty(message = "No se encontró el parámetro 'consumoFinal'")
	@Size(max = 1, message = "El parámetro 'consumoFinal' es demasiado largo")
	private String consumoFinal;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNroCotizacion() {
		return nroCotizacion;
	}

	public void setNroCotizacion(String nroCotizacion) {
		this.nroCotizacion = nroCotizacion;
	}

	public String getPlanPago() {
		return planPago;
	}

	public void setPlanPago(String planPago) {
		this.planPago = planPago;
	}

	public String getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getConsumoFinal() {
		return consumoFinal;
	}

	public void setConsumoFinal(String consumoFinal) {
		this.consumoFinal = consumoFinal;
	}
}
