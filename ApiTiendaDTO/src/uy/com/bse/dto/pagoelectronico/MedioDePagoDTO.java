package uy.com.bse.dto.pagoelectronico;

import java.io.Serializable;

public class MedioDePagoDTO implements Serializable {
	private static final long serialVersionUID = 631348041340162139L;

	private Integer id;
	private String codigo;
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
