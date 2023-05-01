package uy.com.bse.persistence.service.pagoelectronico.impl.map;

import java.util.ArrayList;
import java.util.List;

import uy.com.bse.dto.pagoelectronico.MedioDePagoDTO;
import uy.com.bse.persistence.proxy.pagoelectronico.MedioPago;
import uy.com.bse.persistence.proxy.pagoelectronico.MediosPagoResp;

public class MediosDePagoMap {
	public static List<MedioDePagoDTO> map(MediosPagoResp resp) {
		int id = 1;
		ArrayList<MedioDePagoDTO> medioDePagoDTOList = new ArrayList<>();
		for (MedioPago item : resp.getMediosPago()) {
			MedioDePagoDTO medioPagoDTO = new MedioDePagoDTO();
			medioPagoDTO.setId(id);
			medioPagoDTO.setCodigo(item.getCodigoMedio());
			medioPagoDTO.setNombre(item.getNombre());
			medioDePagoDTOList.add(medioPagoDTO);
			id++;
		}

		return medioDePagoDTOList;
	}
}
