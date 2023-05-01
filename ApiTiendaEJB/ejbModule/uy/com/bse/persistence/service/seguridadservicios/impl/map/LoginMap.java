package uy.com.bse.persistence.service.seguridadservicios.impl.map;

import uy.com.bse.dto.seguridadservicios.SeguridadServiciosDTO;
import uy.com.bse.persistence.proxy.seguridadservicios.ResultLogin;

public class LoginMap {
	public static SeguridadServiciosDTO map(ResultLogin resp) {
		SeguridadServiciosDTO seguridadServiciosDTO = new SeguridadServiciosDTO();
		seguridadServiciosDTO.setToken(resp.getToken());

		return seguridadServiciosDTO;
	}
}
