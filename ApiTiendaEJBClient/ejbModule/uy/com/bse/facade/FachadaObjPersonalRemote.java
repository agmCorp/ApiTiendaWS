package uy.com.bse.facade;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.dto.common.IdTrnBanredDTO;
import uy.com.bse.dto.common.IdTrnRedesDTO;
import uy.com.bse.dto.common.IdTrnSistarbancDTO;
import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.dto.mibse.NumeroClienteDTO;
import uy.com.bse.dto.objpersonal.ClienteDeudaDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.dto.objpersonal.EmisionObjPersonalDTO;
import uy.com.bse.dto.pagoelectronico.EstadoTransaccionDTO;
import uy.com.bse.dto.pagoelectronico.InstFinancieraDTO;
import uy.com.bse.dto.pagoelectronico.MedioDePagoDTO;
import uy.com.bse.dto.polizasservicios.NuevaFacturacionInteractivaDTO;
import uy.com.bse.exception.BusinessException;

@Remote
public interface FachadaObjPersonalRemote {
	List<CodigueraDTO> getPlanesCobertura() throws BusinessException;

	List<CodigueraDTO> getTiposMovilidad() throws BusinessException;

	List<CodigueraDTO> getTiposObjeto() throws BusinessException;

	CotizacionObjPersonalDTO cotizarAnonimo(String planCobertura, String tipoObjeto, Double valorObjeto,
			String movilidad) throws BusinessException;

	EmisionObjPersonalDTO emitir(String tipoDocumento, String documento, String marca, String serie, String modelo,
			Long nroCotizacion, Integer planPago, Date fechaFactura, String consumoFinal) throws BusinessException;

	ClienteDeudaDTO controlarClienteConDeuda(String tipoDocumento, String documento, Long nroCotizacion,
			Integer nroCertificado) throws BusinessException;

	EstadoTransaccionDTO getEstadoTransaccion(String idTransaccion) throws BusinessException;

	List<InstFinancieraDTO> getBancos() throws BusinessException;

	List<InstFinancieraDTO> getBancosYTarjetas() throws BusinessException;

	List<MedioDePagoDTO> getMediosDePago() throws BusinessException;

	FacturaDTO getFactura(Long nroFactura) throws BusinessException;

	NuevaFacturacionInteractivaDTO nuevaFacturacionInteractiva(String userLoggedIn, Integer codRamo, Integer nroPoliza,
			String contemplaDias, Date fecha) throws BusinessException;

	void adherirFacturaDigital(String userLoggedIn, Integer codRamo, Integer nroPoliza, Integer sucursal)
			throws BusinessException;

	void subirArchivo(String userLoggedIn, String nombreArchivo, byte[] archivo, String mimeType)
			throws BusinessException;

	NumeroClienteDTO getNumeroCliente(String userLoggedIn) throws BusinessException;

	FirmaElectronicaDTO getFirmaElectronica(String textoPlano) throws BusinessException;

	IdTrnSistarbancDTO getIdTrnSistarbanc(String medioDePago, String nroFactura) throws BusinessException;

	IdTrnBanredDTO getIdTrnBanred(String medioDePago, String nroFactura) throws BusinessException;

	IdTrnRedesDTO informarPagoEnRedes(String userLoggedIn, String medioDePago, String nroFactura, Long documentId,
			String codProd, String descProducto, Integer codRamo, String descRamo, Integer nroPoliza,
			Integer nroCertificado, String tipoDocumento, String nroDocumento, String nombres, String apellidos)
			throws BusinessException;
}
