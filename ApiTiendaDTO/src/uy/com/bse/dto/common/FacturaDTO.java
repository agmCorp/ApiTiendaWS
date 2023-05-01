package uy.com.bse.dto.common;

import java.io.Serializable;

public class FacturaDTO implements Serializable {
	private static final long serialVersionUID = 4014777486609203550L;

	private Integer codRamo;
	private String codProducto;
	private Integer nroPoliza;
	private String descProducto;
	private String descRamo;
	private String tipoDocumento;
	private String nroDocumento;
	private String apellidos;
	private String nombres;
	private Long numeroFactura;
	private String cb1;
	private String cb2;
	private Integer certificado;
	private String codigoAdhesion;
	private String consumoFinal;
	private String cuotas;
	private String datosBien;
	private Long documentId;
	private String facturaCFE;
	private String fechaFactura;
	private String fechaVto1;
	private String fechaVto2;
	private Double importeGravado;
	private Double importeGravadoOriginal;
	private Double importePagar;
	private Double importePagarOriginal;
	private String moneda;
	private String monedaOriginal;
	private String pagable;
	private String pagableObs;

	public Integer getCodRamo() {
		return codRamo;
	}

	public void setCodRamo(Integer codRamo) {
		this.codRamo = codRamo;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public Integer getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(Integer nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public String getDescRamo() {
		return descRamo;
	}

	public void setDescRamo(String descRamo) {
		this.descRamo = descRamo;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Long getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(Long numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getCb1() {
		return cb1;
	}

	public void setCb1(String cb1) {
		this.cb1 = cb1;
	}

	public String getCb2() {
		return cb2;
	}

	public void setCb2(String cb2) {
		this.cb2 = cb2;
	}

	public Integer getCertificado() {
		return certificado;
	}

	public void setCertificado(Integer certificado) {
		this.certificado = certificado;
	}

	public String getCodigoAdhesion() {
		return codigoAdhesion;
	}

	public void setCodigoAdhesion(String codigoAdhesion) {
		this.codigoAdhesion = codigoAdhesion;
	}

	public String getConsumoFinal() {
		return consumoFinal;
	}

	public void setConsumoFinal(String consumoFinal) {
		this.consumoFinal = consumoFinal;
	}

	public String getCuotas() {
		return cuotas;
	}

	public void setCuotas(String cuotas) {
		this.cuotas = cuotas;
	}

	public String getDatosBien() {
		return datosBien;
	}

	public void setDatosBien(String datosBien) {
		this.datosBien = datosBien;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getFacturaCFE() {
		return facturaCFE;
	}

	public void setFacturaCFE(String facturaCFE) {
		this.facturaCFE = facturaCFE;
	}

	public String getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaVto1() {
		return fechaVto1;
	}

	public void setFechaVto1(String fechaVto1) {
		this.fechaVto1 = fechaVto1;
	}

	public String getFechaVto2() {
		return fechaVto2;
	}

	public void setFechaVto2(String fechaVto2) {
		this.fechaVto2 = fechaVto2;
	}

	public Double getImporteGravado() {
		return importeGravado;
	}

	public void setImporteGravado(Double importeGravado) {
		this.importeGravado = importeGravado;
	}

	public Double getImporteGravadoOriginal() {
		return importeGravadoOriginal;
	}

	public void setImporteGravadoOriginal(Double importeGravadoOriginal) {
		this.importeGravadoOriginal = importeGravadoOriginal;
	}

	public Double getImportePagar() {
		return importePagar;
	}

	public void setImportePagar(Double importePagar) {
		this.importePagar = importePagar;
	}

	public Double getImportePagarOriginal() {
		return importePagarOriginal;
	}

	public void setImportePagarOriginal(Double importePagarOriginal) {
		this.importePagarOriginal = importePagarOriginal;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getMonedaOriginal() {
		return monedaOriginal;
	}

	public void setMonedaOriginal(String monedaOriginal) {
		this.monedaOriginal = monedaOriginal;
	}

	public String getPagable() {
		return pagable;
	}

	public void setPagable(String pagable) {
		this.pagable = pagable;
	}

	public String getPagableObs() {
		return pagableObs;
	}

	public void setPagableObs(String pagableObs) {
		this.pagableObs = pagableObs;
	}
}
