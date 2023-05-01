package uy.com.bse.persistence.service.objpersonal.impl.map;

import java.util.ArrayList;
import java.util.List;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.persistence.proxy.objpersonal.ItemCodiguera;
import uy.com.bse.persistence.proxy.objpersonal.TiposMovilidadTiendaResp;

public class TiposMovilidadMap {
	public static List<CodigueraDTO> map(TiposMovilidadTiendaResp resp) {
		int id = 1;
		ArrayList<CodigueraDTO> codigueraDTOList = new ArrayList<>();
		for (ItemCodiguera item : resp.getTiposMovilidadList().getTipoMovilidad()) {
			CodigueraDTO codigueraDTO = new CodigueraDTO();
			codigueraDTO.setId(id);
			codigueraDTO.setItem(item.getCodigo());
			codigueraDTO.setLabel(item.getNombre());
			codigueraDTOList.add(codigueraDTO);
			id++;
		}

		return codigueraDTOList;
	}
}
