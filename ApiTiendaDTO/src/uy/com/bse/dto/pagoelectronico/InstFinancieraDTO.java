package uy.com.bse.dto.pagoelectronico;

import java.io.Serializable;

public class InstFinancieraDTO implements Serializable {
	private static final long serialVersionUID = -7998497657113418562L;

	private Integer id;
	private Integer codigo;
	private Integer codigoBCU;
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigoBCU() {
		return codigoBCU;
	}

	public void setCodigoBCU(Integer codigoBCU) {
		this.codigoBCU = codigoBCU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
