package uy.com.bse.rest.objpersonal.param;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ParamInformarPagoEnRedesDTO implements Serializable {
	private static final long serialVersionUID = 4683246606909655970L;

	@NotEmpty(message = "No se encontró el parámetro 'medioDePago'")
	private String medioDePago;

	@NotEmpty(message = "No se encontró el parámetro 'nroFactura'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'nroFactura' no es un número")
	private String nroFactura;

	@NotEmpty(message = "No se encontró el parámetro 'documentId'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'documentId' no es un número")
	private String documentId;

	@NotEmpty(message = "No se encontró el parámetro 'codProd'")
	private String codProd;

	@NotEmpty(message = "No se encontró el parámetro 'descProducto'")
	private String descProducto;

	@NotEmpty(message = "No se encontró el parámetro 'codRamo'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'codRamo' no es un número")
	private String codRamo;

	@NotEmpty(message = "No se encontró el parámetro 'descRamo'")
	private String descRamo;

	@NotEmpty(message = "No se encontró el parámetro 'nroPoliza'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'nroPoliza' no es un número")
	private String nroPoliza;

	@NotEmpty(message = "No se encontró el parámetro 'nroCertificado'")
	@Pattern(regexp = "\\d+", message = "El parámetro 'nroCertificado' no es un número")
	private String nroCertificado;

	@NotEmpty(message = "No se encontró el parámetro 'tipoDocumento'")
	private String tipoDocumento;

	@NotEmpty(message = "No se encontró el parámetro 'nroDocumento'")
	private String nroDocumento;

	@NotEmpty(message = "No se encontró el parámetro 'nombres'")
	private String nombres;

	@NotEmpty(message = "No se encontró el parámetro 'apellidos'")
	private String apellidos;

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

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getCodProd() {
		return codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public String getCodRamo() {
		return codRamo;
	}

	public void setCodRamo(String codRamo) {
		this.codRamo = codRamo;
	}

	public String getDescRamo() {
		return descRamo;
	}

	public void setDescRamo(String descRamo) {
		this.descRamo = descRamo;
	}

	public String getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(String nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public String getNroCertificado() {
		return nroCertificado;
	}

	public void setNroCertificado(String nroCertificado) {
		this.nroCertificado = nroCertificado;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
