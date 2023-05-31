package uy.com.bse.dto.objpersonal;

import java.io.Serializable;

public class PolizaObjPersonalDTO implements Serializable {
	private static final long serialVersionUID = 2448044820484709008L;

	private String codProducto;
	private String productoDsc;
	private Integer codRamo;
	private String ramoDsc;
	private String fechaDesde;
	private String fechaHasta;
	private Integer nroPoliza;

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getProductoDsc() {
		return productoDsc;
	}

	public void setProductoDsc(String productoDsc) {
		this.productoDsc = productoDsc;
	}

	public Integer getCodRamo() {
		return codRamo;
	}

	public void setCodRamo(Integer codRamo) {
		this.codRamo = codRamo;
	}

	public String getRamoDsc() {
		return ramoDsc;
	}

	public void setRamoDsc(String ramoDsc) {
		this.ramoDsc = ramoDsc;
	}

	public String getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public String getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public Integer getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(Integer nroPoliza) {
		this.nroPoliza = nroPoliza;
	}
}