package uy.com.bse.persistence.service.objpersonal.impl.map;

import uy.com.bse.dto.objpersonal.EmisionObjPersonalDTO;
import uy.com.bse.dto.objpersonal.PolizaObjPersonalDTO;
import uy.com.bse.persistence.proxy.objpersonal.EmisionOPersonalTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.PolizaOPersonalTienda;
import uy.com.bse.util.DateHelper;

public class EmisionObjPersonalMap {
	public static EmisionObjPersonalDTO map(EmisionOPersonalTiendaResp resp) {
		EmisionObjPersonalDTO emisionObjPersonalDTO = new EmisionObjPersonalDTO();
		emisionObjPersonalDTO.setPolizaObjPersonal(parse(resp.getPoliza()));

		return emisionObjPersonalDTO;
	}

	public static PolizaObjPersonalDTO parse(PolizaOPersonalTienda wsPolizaOPersonal) {
		PolizaObjPersonalDTO polizaObjPersonal = new PolizaObjPersonalDTO();
		polizaObjPersonal.setFechaDesde(DateHelper.xmlGregorianCalendarToString(wsPolizaOPersonal.getFechaDesde(),
				DateHelper.HYPHEN_YEAR_FIRST));
		polizaObjPersonal.setFechaHasta(DateHelper.xmlGregorianCalendarToString(wsPolizaOPersonal.getFechaHasta(),
				DateHelper.HYPHEN_YEAR_FIRST));
		polizaObjPersonal.setNroPoliza(wsPolizaOPersonal.getNroPoliza());
		polizaObjPersonal.setCodRamo(wsPolizaOPersonal.getRamo().getRamo());
		return polizaObjPersonal;
	}
}
