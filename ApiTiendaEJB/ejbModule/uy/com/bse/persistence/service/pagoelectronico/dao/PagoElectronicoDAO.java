package uy.com.bse.persistence.service.pagoelectronico.dao;

import java.util.List;

import javax.ejb.Local;

import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.dto.pagoelectronico.EstadoTransaccionDTO;
import uy.com.bse.dto.pagoelectronico.InstFinancieraDTO;
import uy.com.bse.dto.pagoelectronico.MedioDePagoDTO;
import uy.com.bse.persistence.exception.PersistException;

@Local
public interface PagoElectronicoDAO {
	List<InstFinancieraDTO> getMediosDePagoFactura() throws PersistException;

	List<InstFinancieraDTO> getMediosDePagoPoliza() throws PersistException;

	List<MedioDePagoDTO> getMediosDePago() throws PersistException;

	EstadoTransaccionDTO getEstadoTransaccion(String idTransaccion) throws PersistException;
	
	FacturaDTO getFactura(Long nroFactura) throws PersistException;
}
