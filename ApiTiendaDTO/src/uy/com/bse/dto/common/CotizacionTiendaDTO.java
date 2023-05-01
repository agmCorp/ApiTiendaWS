package uy.com.bse.dto.common;

import java.io.Serializable;

public class CotizacionTiendaDTO implements Serializable {
	private static final long serialVersionUID = -8617974251084728276L;

	protected Integer codRamo;
	protected String ramoDsc;
	protected String producto;
	protected String productoDsc;
	protected String planCobertura;
	protected String planCoberturaDsc;

	protected Integer sucursal;
	protected Integer productor;
	protected String tipoDocumento;
	protected String nroDocumento;

	protected Long nroCotizacion;
	protected Double premioFacturar;
	protected Double premio;
	protected String fechaDesde;
	protected String fechaHasta;
	protected String codMoneda;
	protected String monedaDsc;
	protected String simboloMoneda;

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

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getProductoDsc() {
		return productoDsc;
	}

	public void setProductoDsc(String productoDsc) {
		this.productoDsc = productoDsc;
	}

	public String getPlanCobertura() {
		return planCobertura;
	}

	public void setPlanCobertura(String planCobertura) {
		this.planCobertura = planCobertura;
	}

	public String getPlanCoberturaDsc() {
		return planCoberturaDsc;
	}

	public void setPlanCoberturaDsc(String planCoberturaDsc) {
		this.planCoberturaDsc = planCoberturaDsc;
	}

	public Integer getSucursal() {
		return sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	public Integer getProductor() {
		return productor;
	}

	public void setProductor(Integer productor) {
		this.productor = productor;
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

	public Long getNroCotizacion() {
		return nroCotizacion;
	}

	public void setNroCotizacion(Long nroCotizacion) {
		this.nroCotizacion = nroCotizacion;
	}

	public Double getPremioFacturar() {
		return premioFacturar;
	}

	public void setPremioFacturar(Double premioFacturar) {
		this.premioFacturar = premioFacturar;
	}

	public Double getPremio() {
		return premio;
	}

	public void setPremio(Double premio) {
		this.premio = premio;
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

	public String getCodMoneda() {
		return codMoneda;
	}

	public void setCodMoneda(String codMoneda) {
		this.codMoneda = codMoneda;
	}

	public String getMonedaDsc() {
		return monedaDsc;
	}

	public void setMonedaDsc(String monedaDsc) {
		this.monedaDsc = monedaDsc;
	}

	public String getSimboloMoneda() {
		return simboloMoneda;
	}

	public void setSimboloMoneda(String simboloMoneda) {
		this.simboloMoneda = simboloMoneda;
	}
}
