package uy.com.bse.persistence.service.firmaelectronica.impl.map;

import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.persistence.proxy.firmaelectronica.FirmaTxtResp;

public class FirmaElectronicaMap {
	public static FirmaElectronicaDTO map(FirmaTxtResp resp) {
		FirmaElectronicaDTO firmaElectronicaDTO = new FirmaElectronicaDTO();
		firmaElectronicaDTO.setFirma(resp.getFirma());
		firmaElectronicaDTO.setSessionId(resp.getSesionId());
		return firmaElectronicaDTO;
	}
}
