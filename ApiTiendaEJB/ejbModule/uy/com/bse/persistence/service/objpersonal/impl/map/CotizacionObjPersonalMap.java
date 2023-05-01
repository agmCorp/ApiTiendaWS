package uy.com.bse.persistence.service.objpersonal.impl.map;

import java.util.ArrayList;
import java.util.List;

import uy.com.bse.dto.common.PlanDeCuotasDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.persistence.proxy.objpersonal.CotizacionOPersonalTienda;
import uy.com.bse.persistence.proxy.objpersonal.CotizacionOPersonalTienda.PlanesCuotas;
import uy.com.bse.persistence.proxy.objpersonal.CotizacionOPersonalTiendaResp;
import uy.com.bse.persistence.proxy.objpersonal.CuotaPagoTienda;
import uy.com.bse.persistence.proxy.objpersonal.PlanCuotaTienda;
import uy.com.bse.util.DateHelper;

public class CotizacionObjPersonalMap {
	public static CotizacionObjPersonalDTO map(CotizacionOPersonalTiendaResp resp) {
		CotizacionObjPersonalDTO cotizacionObjPersonalDTO = new CotizacionObjPersonalDTO();
		CotizacionOPersonalTienda wsCotizacionOPersonal = resp.getCotizacion();

		cotizacionObjPersonalDTO.setCodRamo(wsCotizacionOPersonal.getRamo().getRamo());
		cotizacionObjPersonalDTO.setRamoDsc(wsCotizacionOPersonal.getRamo().getDescripcion());
		cotizacionObjPersonalDTO.setProducto(wsCotizacionOPersonal.getProducto().getProducto());
		cotizacionObjPersonalDTO.setProductoDsc(wsCotizacionOPersonal.getProducto().getDescripcion());
		cotizacionObjPersonalDTO.setPlanCobertura(wsCotizacionOPersonal.getPlanCobertura().getPlan());
		cotizacionObjPersonalDTO.setPlanCoberturaDsc(wsCotizacionOPersonal.getPlanCobertura().getDescripcion());
		cotizacionObjPersonalDTO.setSucursal(wsCotizacionOPersonal.getSucursal());
		cotizacionObjPersonalDTO.setProductor(wsCotizacionOPersonal.getProductor());
		cotizacionObjPersonalDTO.setTipoDocumento(wsCotizacionOPersonal.getTipoDocumento());
		cotizacionObjPersonalDTO.setNroDocumento(wsCotizacionOPersonal.getNroDocumento());
		cotizacionObjPersonalDTO.setNroCotizacion(Long.valueOf(wsCotizacionOPersonal.getNroCotizacion()));
		cotizacionObjPersonalDTO.setPremioFacturar(wsCotizacionOPersonal.getPremioFacturar());
		cotizacionObjPersonalDTO.setPremio(wsCotizacionOPersonal.getPremio());
		cotizacionObjPersonalDTO.setFechaDesde(DateHelper
				.xmlGregorianCalendarToString(wsCotizacionOPersonal.getFechaDesde(), DateHelper.HYPHEN_YEAR_FIRST));
		cotizacionObjPersonalDTO.setFechaHasta(DateHelper
				.xmlGregorianCalendarToString(wsCotizacionOPersonal.getFechaHasta(), DateHelper.HYPHEN_YEAR_FIRST));
		cotizacionObjPersonalDTO.setCodMoneda(wsCotizacionOPersonal.getMoneda().getCodigo());
		cotizacionObjPersonalDTO.setMonedaDsc(wsCotizacionOPersonal.getMoneda().getDescripcion());
		cotizacionObjPersonalDTO.setSimboloMoneda(wsCotizacionOPersonal.getMoneda().getSimbolo());
		cotizacionObjPersonalDTO.setPlanDeCuotasList(parse(wsCotizacionOPersonal.getPlanesCuotas()));

		return cotizacionObjPersonalDTO;
	}

	public static List<PlanDeCuotasDTO> parse(PlanesCuotas wsPlanesDeCuotas) {
		List<PlanDeCuotasDTO> planDeCuotasList = new ArrayList<>();

		int i = 1;
		for (PlanCuotaTienda wsPlanCuota : wsPlanesDeCuotas.getPlanCuota()) {
			PlanDeCuotasDTO planDeCuotasDTO = new PlanDeCuotasDTO();

			planDeCuotasDTO.setId(i);
			planDeCuotasDTO.setCantCuotas(wsPlanCuota.getCantCuotas());
			planDeCuotasDTO.setDescripcion(wsPlanCuota.getPlanPago().getDescripcion());
			planDeCuotasDTO.setPrimerCuota(getPrimerCuota(wsPlanCuota.getCuotas()));
			planDeCuotasDTO.setTotal(wsPlanCuota.getImporteTotal());
			planDeCuotasDTO.setId(wsPlanCuota.getCantCuotas());
			planDeCuotasList.add(planDeCuotasDTO);
			i++;
		}
		return planDeCuotasList;
	}

	private static Double getPrimerCuota(List<CuotaPagoTienda> list) {
		Double result = 0d;
		for (CuotaPagoTienda cuotaPago : list) {
			if (cuotaPago.getNroCuota() == 1) {
				result = cuotaPago.getImporte();
				break;
			}
		}
		return result;
	}
}
