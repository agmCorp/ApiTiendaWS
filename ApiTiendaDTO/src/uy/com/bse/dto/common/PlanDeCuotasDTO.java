package uy.com.bse.dto.common;

import java.io.Serializable;

public class PlanDeCuotasDTO implements Serializable {
	private static final long serialVersionUID = 6769040836962019404L;
	
	private Integer id;
	private Integer cantCuotas;
	private String descripcion;
	private Double primerCuota;
	private Double total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(Integer cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrimerCuota() {
		return primerCuota;
	}

	public void setPrimerCuota(Double primerCuota) {
		this.primerCuota = primerCuota;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
