package uy.com.bse.persistence.service.pagoelectronico.impl.map;

import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.persistence.proxy.pagoelectronico.Factura;
import uy.com.bse.persistence.proxy.pagoelectronico.FacturaResp;
import uy.com.bse.util.DateHelper;

public class FacturaMap {
	public static FacturaDTO map(FacturaResp resp) {
		FacturaDTO facturaDTO = new FacturaDTO();
		Factura wsFactura = resp.getFactura();

		facturaDTO.setCodRamo(wsFactura.getRamo());
		facturaDTO.setCodProd(wsFactura.getProducto());
		facturaDTO.setNroPoliza(wsFactura.getPoliza());
		facturaDTO.setDescProducto(wsFactura.getDescripcionProducto());
		facturaDTO.setDescRamo(wsFactura.getDescripcionRamo());
		facturaDTO.setTipoDocumento(wsFactura.getTipoDocumento());
		facturaDTO.setNroDocumento(wsFactura.getNroDocumento());
		facturaDTO.setApellidos(wsFactura.getApellidos());
		facturaDTO.setNombres(wsFactura.getNombres());
		facturaDTO.setNumeroFactura(wsFactura.getNumeroFactura());
		facturaDTO.setCb1(wsFactura.getCb1());
		facturaDTO.setCb2(wsFactura.getCb2());
		facturaDTO.setCertificado(wsFactura.getCertificado());
		facturaDTO.setCodigoAdhesion(wsFactura.getCodigoAdhesion());
		facturaDTO.setConsumoFinal(wsFactura.getConsumoFinal());
		facturaDTO.setCuotas(wsFactura.getCuotas());
		facturaDTO.setDatosBien(wsFactura.getDatosBien());
		facturaDTO.setDocumentId(wsFactura.getDocumentId());
		facturaDTO.setFacturaCFE(wsFactura.getFacturaCFE());
		facturaDTO.setFechaFactura(
				DateHelper.xmlGregorianCalendarToString(wsFactura.getFechaFactura(), DateHelper.HYPHEN_YEAR_FIRST));
		facturaDTO.setFechaVto1(
				DateHelper.xmlGregorianCalendarToString(wsFactura.getFechaVto1(), DateHelper.HYPHEN_YEAR_FIRST));
		facturaDTO.setFechaVto2(
				DateHelper.xmlGregorianCalendarToString(wsFactura.getFechaVto2(), DateHelper.HYPHEN_YEAR_FIRST));
		facturaDTO.setImporteGravado(wsFactura.getImporteGravado());
		facturaDTO.setImporteGravadoOriginal(wsFactura.getImporteGravadoOriginal());
		facturaDTO.setImportePagar(wsFactura.getImportePagar());
		facturaDTO.setImportePagarOriginal(wsFactura.getImportePagarOriginal());
		facturaDTO.setMoneda(wsFactura.getMoneda());
		facturaDTO.setMonedaOriginal(wsFactura.getMonedaOriginal());
		facturaDTO.setPagable(wsFactura.getPagable());
		facturaDTO.setPagableObs(wsFactura.getPagableObs());

		return facturaDTO;
	}
}
