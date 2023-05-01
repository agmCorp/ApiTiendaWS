package uy.com.bse.persistence.service.objpersonal.impl.map;

import uy.com.bse.dto.objpersonal.ClienteDeudaDTO;
import uy.com.bse.persistence.proxy.objpersonal.ClienteDeudaTiendaResp;

public class ClienteDeudaMap {
	public static ClienteDeudaDTO map(ClienteDeudaTiendaResp resp) {
		ClienteDeudaDTO clienteDeudaDTO = new ClienteDeudaDTO();
		clienteDeudaDTO.setClienteConDeuda(resp.getClienteConDeuda().equals("S") ? true : false);
		return clienteDeudaDTO;
	}
}
