package uy.com.bse.persistence.service.objpersonal.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.dto.objpersonal.ClienteDeudaDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.dto.objpersonal.EmisionObjPersonalDTO;
import uy.com.bse.persistence.exception.PersistException;

@Local
public interface ObjPersonalDAO {
	List<CodigueraDTO> getPlanesCobertura() throws PersistException;

	List<CodigueraDTO> getTiposMovilidad() throws PersistException;

	List<CodigueraDTO> getTiposObjeto() throws PersistException;

	CotizacionObjPersonalDTO cotizarAnonimo(String planCobertura, String tipoObjeto, Double valorObjeto,
			String movilidad) throws PersistException;

	EmisionObjPersonalDTO emitir(String tipoDocumento, String documento, String marca, String serie, String modelo,
			Long nroCotizacion, Integer planPago, Date fechaFactura, String consumoFinal) throws PersistException;

	ClienteDeudaDTO getClienteDeuda(String tipoDocumento, String documento, Long nroCotizacion, Integer nroCertificado)
			throws PersistException;
}
