package uy.com.bse.persistence.service.objpersonal.impl.map;

import java.util.ArrayList;
import java.util.List;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.persistence.proxy.objpersonal.PlanCoberturaTienda;
import uy.com.bse.persistence.proxy.objpersonal.PlanesCoberturaTiendaResp;

public class PlanesCoberturaMap {
	public static List<CodigueraDTO> map(PlanesCoberturaTiendaResp resp) {
		int id = 1;
		ArrayList<CodigueraDTO> codigueraDTOList = new ArrayList<>();
		for (PlanCoberturaTienda item : resp.getPlanesCoberturaList().getPlanCobertura()) {
			CodigueraDTO codigueraDTO = new CodigueraDTO();
			codigueraDTO.setId(id);
			codigueraDTO.setItem(item.getPlan());
			codigueraDTO.setLabel(item.getDescripcion());
			codigueraDTOList.add(codigueraDTO);
			id++;
		}

		return codigueraDTOList;
	}
}
