package uy.com.bse.persistence.service.pagoelectronico.impl.map;

import java.util.ArrayList;
import java.util.List;

import uy.com.bse.dto.pagoelectronico.InstFinancieraDTO;
import uy.com.bse.persistence.proxy.pagoelectronico.EntidadBancaria;
import uy.com.bse.persistence.proxy.pagoelectronico.EntidadesBancariasResp;

public class InstFinancierasMap {
	public static List<InstFinancieraDTO> map(EntidadesBancariasResp resp) {
		int id = 1;
		ArrayList<InstFinancieraDTO> instFinancieraDTOList = new ArrayList<>();
		for (EntidadBancaria item : resp.getEntidadesBancarias()) {
			InstFinancieraDTO instFinancieraDTO = new InstFinancieraDTO();
			instFinancieraDTO.setId(id);
			instFinancieraDTO.setCodigo(item.getCodEntidad());
			instFinancieraDTO.setCodigoBCU(item.getCodEntidadBCU());
			instFinancieraDTO.setNombre(item.getNombre());
			instFinancieraDTOList.add(instFinancieraDTO);
			id++;
		}

		return instFinancieraDTOList;
	}
}
