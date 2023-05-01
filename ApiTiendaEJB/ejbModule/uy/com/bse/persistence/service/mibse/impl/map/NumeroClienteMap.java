package uy.com.bse.persistence.service.mibse.impl.map;

import uy.com.bse.dto.mibse.NumeroClienteDTO;
import uy.com.bse.persistence.proxy.mibse.ResultObtenerNumeroCliente;

public class NumeroClienteMap {
	public static NumeroClienteDTO map(ResultObtenerNumeroCliente resp) {
		NumeroClienteDTO numeroClienteDTO = new NumeroClienteDTO();
		numeroClienteDTO.setNumCliente(Integer.valueOf(resp.getNumCliente()));
		return numeroClienteDTO;
	}
}
