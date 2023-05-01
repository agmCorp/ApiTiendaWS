package uy.com.bse.persistence.service.pagoelectronico.impl.map;

import uy.com.bse.dto.pagoelectronico.EstadoTransaccionDTO;
import uy.com.bse.persistence.proxy.pagoelectronico.EstadoTransaccionResp;

public class EstadoTransaccionMap {
	public static EstadoTransaccionDTO map(EstadoTransaccionResp resp) {
		EstadoTransaccionDTO estadoTransaccionDTO = new EstadoTransaccionDTO();
		estadoTransaccionDTO.setCodigoErrorBanco(resp.getCodigoErrorBanco());

		return estadoTransaccionDTO;
	}
}
