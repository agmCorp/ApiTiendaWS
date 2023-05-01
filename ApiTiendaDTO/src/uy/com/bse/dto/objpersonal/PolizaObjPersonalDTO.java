package uy.com.bse.dto.objpersonal;

import java.io.Serializable;

public class PolizaObjPersonalDTO implements Serializable {
	private static final long serialVersionUID = 2448044820484709008L;

	private String fechaDesde;
	private String fechaHasta;
	private Integer nroPoliza;
	private Integer codRamo;

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

	public Integer getCodRamo() {
		return codRamo;
	}

	public void setCodRamo(Integer codRamo) {
		this.codRamo = codRamo;
	}
}