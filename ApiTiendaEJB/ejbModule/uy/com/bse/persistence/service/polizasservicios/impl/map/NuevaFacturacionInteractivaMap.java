package uy.com.bse.persistence.service.polizasservicios.impl.map;

import uy.com.bse.dto.polizasservicios.NuevaFacturacionInteractivaDTO;
import uy.com.bse.persistence.proxy.polizasservicios.ResultNuevaFacturacionInteractiva;

public class NuevaFacturacionInteractivaMap {
	public static NuevaFacturacionInteractivaDTO map(ResultNuevaFacturacionInteractiva resp) {
		NuevaFacturacionInteractivaDTO nuevaFacturacionInteractivaDTO = new NuevaFacturacionInteractivaDTO();
		nuevaFacturacionInteractivaDTO.setMensaje(resp.getMensaje());
		for (String item : resp.getNumerosFacturas()) {
			nuevaFacturacionInteractivaDTO.setUnNumeroFactura(item);
		}
		for (Long item : resp.getNumerosFacturasElectronica()) {
			nuevaFacturacionInteractivaDTO.setUnNumeroFacturaElectronica(item);
		}
		
		return nuevaFacturacionInteractivaDTO;
	}
}
