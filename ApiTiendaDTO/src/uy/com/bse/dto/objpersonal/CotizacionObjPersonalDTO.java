package uy.com.bse.dto.objpersonal;

import java.util.Date;
import java.util.List;

import uy.com.bse.dto.common.CotizacionTiendaDTO;
import uy.com.bse.dto.common.PlanDeCuotasDTO;

public class CotizacionObjPersonalDTO extends CotizacionTiendaDTO {
	private static final long serialVersionUID = 5713851469534780259L;

	private String tipoObjeto;
	private Double valorObjeto;
	private String tipoMovilidad;
	private Date fechaFactura;
	private String marca;
	private String serie;
	private String modelo;
	private List<PlanDeCuotasDTO> planDeCuotasList;

	public String getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

	public Double getValorObjeto() {
		return valorObjeto;
	}

	public void setValorObjeto(Double valorObjeto) {
		this.valorObjeto = valorObjeto;
	}

	public String getTipoMovilidad() {
		return tipoMovilidad;
	}

	public void setTipoMovilidad(String tipoMovilidad) {
		this.tipoMovilidad = tipoMovilidad;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
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

	public List<PlanDeCuotasDTO> getPlanDeCuotasList() {
		return planDeCuotasList;
	}

	public void setPlanDeCuotasList(List<PlanDeCuotasDTO> planDeCuotasList) {
		this.planDeCuotasList = planDeCuotasList;
	}
}
