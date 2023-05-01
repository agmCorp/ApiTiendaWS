package uy.com.bse.dto.polizasservicios;

import java.io.Serializable;
import java.util.ArrayList;

public class NuevaFacturacionInteractivaDTO implements Serializable {
	private static final long serialVersionUID = 620427819748620137L;

	private String mensaje;
	private ArrayList<String> numerosFactura = new ArrayList<String>();
	private ArrayList<Long> numerosFacturaElectronica = new ArrayList<Long>();

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ArrayList<String> getNumerosFactura() {
		return numerosFactura;
	}

	public void setNumerosFactura(ArrayList<String> numerosFactura) {
		this.numerosFactura = numerosFactura;
	}

	public ArrayList<Long> getNumerosFacturaElectronica() {
		return numerosFacturaElectronica;
	}

	public void setNumerosFacturaElectronica(ArrayList<Long> numerosFacturaElectronica) {
		this.numerosFacturaElectronica = numerosFacturaElectronica;
	}
	
	public void setUnNumeroFactura(String numero) {
		numerosFactura.add(numero);
	}

	public void setUnNumeroFacturaElectronica(Long numero) {
		numerosFacturaElectronica.add(numero);
	}
}
