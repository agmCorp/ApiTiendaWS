package uy.com.bse.business;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import uy.com.bse.business.support.LoggingBusinessInterceptorBinding;
import uy.com.bse.dto.common.CodigueraDTO;
import uy.com.bse.dto.common.FacturaDTO;
import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.dto.mibse.NumeroClienteDTO;
import uy.com.bse.dto.objpersonal.ClienteDeudaDTO;
import uy.com.bse.dto.objpersonal.CotizacionObjPersonalDTO;
import uy.com.bse.dto.objpersonal.EmisionObjPersonalDTO;
import uy.com.bse.dto.pagoelectronico.EstadoTransaccionDTO;
import uy.com.bse.dto.pagoelectronico.InstFinancieraDTO;
import uy.com.bse.dto.pagoelectronico.MedioDePagoDTO;
import uy.com.bse.dto.polizasservicios.NuevaFacturacionInteractivaDTO;
import uy.com.bse.dto.seguridadservicios.SeguridadServiciosDTO;
import uy.com.bse.exception.BusinessException;
import uy.com.bse.facade.FachadaObjPersonalLocal;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.service.firmaelectronica.dao.FirmaElectronicaDAO;
import uy.com.bse.persistence.service.mibse.dao.MiBseDAO;
import uy.com.bse.persistence.service.objpersonal.dao.ObjPersonalDAO;
import uy.com.bse.persistence.service.pagoelectronico.dao.PagoElectronicoDAO;
import uy.com.bse.persistence.service.polizasservicios.dao.PolizasServiciosDAO;
import uy.com.bse.persistence.service.seguridadservicios.dao.SeguridadServiciosDAO;

@Stateless
@LoggingBusinessInterceptorBinding
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FachadaObjPersonalLocalImpl extends Fachada implements FachadaObjPersonalLocal {
	@EJB
	private ObjPersonalDAO objPersonalDAO;
	@EJB
	private PagoElectronicoDAO pagoElectronicoDAO;
	@EJB
	private SeguridadServiciosDAO seguridadServiciosDAO;
	@EJB
	private PolizasServiciosDAO polizasServiciosDAO;
	@EJB
	private MiBseDAO miBseDAO;
	@EJB
	private FirmaElectronicaDAO firmaElectronicaDAO;

	@Override
	public List<CodigueraDTO> getPlanesCobertura() throws BusinessException {
		List<CodigueraDTO> codigueraList = null;

		try {
			codigueraList = objPersonalDAO.getPlanesCobertura();
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getPlanesCobertura");
		}

		return codigueraList;
	}

	@Override
	public List<CodigueraDTO> getTiposMovilidad() throws BusinessException {
		List<CodigueraDTO> codigueraList = null;

		try {
			codigueraList = objPersonalDAO.getTiposMovilidad();
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getTiposMovilidad");
		}

		return codigueraList;
	}

	@Override
	public List<CodigueraDTO> getTiposObjeto() throws BusinessException {
		List<CodigueraDTO> codigueraList = null;

		try {
			codigueraList = objPersonalDAO.getTiposObjeto();
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getTiposObjeto");
		}

		return codigueraList;
	}

	@Override
	public CotizacionObjPersonalDTO cotizarAnonimo(String planCobertura, String tipoObjeto, Double valorObjeto,
			String movilidad) throws BusinessException {
		CotizacionObjPersonalDTO cotizacionObjPersonalDTO = null;

		try {
			cotizacionObjPersonalDTO = objPersonalDAO.cotizarAnonimo(planCobertura, tipoObjeto, valorObjeto, movilidad);
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio cotizarAnonimo");
		}

		return cotizacionObjPersonalDTO;
	}

	@Override
	public EmisionObjPersonalDTO emitir(String tipoDocumento, String documento, String marca, String serie,
			String modelo, Long nroCotizacion, Integer planPago, Date fechaFactura, String consumoFinal)
			throws BusinessException {
		EmisionObjPersonalDTO emisionObjPersonalDTO = null;

		try {
			emisionObjPersonalDTO = objPersonalDAO.emitir(tipoDocumento, documento, marca, serie, modelo, nroCotizacion,
					planPago, fechaFactura, consumoFinal);
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio emitir");
		}

		return emisionObjPersonalDTO;
	}

	@Override
	public ClienteDeudaDTO controlarClienteConDeuda(String tipoDocumento, String documento, Long nroCotizacion,
			Integer nroCertificado) throws BusinessException {
		ClienteDeudaDTO clienteDeuda = null;

		try {
			clienteDeuda = objPersonalDAO.getClienteDeuda(tipoDocumento, documento, nroCotizacion, nroCertificado);
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio controlarClienteConDeuda");
		}

		return clienteDeuda;
	}

	@Override
	public EstadoTransaccionDTO getEstadoTransaccion(String idTransaccion) throws BusinessException {
		EstadoTransaccionDTO estadoTransaccion = null;

		try {
			estadoTransaccion = pagoElectronicoDAO.getEstadoTransaccion(idTransaccion);
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getEstadoTransaccion");
		}

		return estadoTransaccion;
	}

	@Override
	public List<InstFinancieraDTO> getMediosDePagoFactura() throws BusinessException {
		List<InstFinancieraDTO> instFinancieraList = null;

		try {
			instFinancieraList = pagoElectronicoDAO.getMediosDePagoFactura();
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getMediosDePagoFactura");
		}

		return instFinancieraList;
	}

	@Override
	public List<InstFinancieraDTO> getMediosDePagoPoliza() throws BusinessException {
		List<InstFinancieraDTO> instFinancieraList = null;

		try {
			instFinancieraList = pagoElectronicoDAO.getMediosDePagoPoliza();
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getMediosDePagoPoliza");
		}

		return instFinancieraList;
	}

	@Override
	public List<MedioDePagoDTO> getMediosDePago() throws BusinessException {
		List<MedioDePagoDTO> medioDePagoList = null;

		try {
			medioDePagoList = pagoElectronicoDAO.getMediosDePago();
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getMediosDePago");
		}

		return medioDePagoList;
	}

	@Override
	public FacturaDTO getFactura(Long nroFactura) throws BusinessException {
		FacturaDTO facturaDTO = null;

		try {
			facturaDTO = pagoElectronicoDAO.getFactura(nroFactura);
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getFactura");
		}

		return facturaDTO;
	}

	@Override
	public NuevaFacturacionInteractivaDTO nuevaFacturacionInteractiva(String userLoggedIn, Integer codRamo,
			Integer nroPoliza, String contemplaDias, Date fecha) throws BusinessException {
		NuevaFacturacionInteractivaDTO nuevaFacturacionInteractivaDTO = null;

		try {
			SeguridadServiciosDTO seguridadServiciosDTO = seguridadServiciosDAO.login(userLoggedIn);
			nuevaFacturacionInteractivaDTO = polizasServiciosDAO.nuevaFacturacionInteractiva(userLoggedIn,
					seguridadServiciosDTO.getToken(), codRamo, nroPoliza, contemplaDias, fecha);
			seguridadServiciosDAO.logout(userLoggedIn, seguridadServiciosDTO.getToken());
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio nuevaFacturacionInteractiva");
		}

		return nuevaFacturacionInteractivaDTO;
	}

	@Override
	public void adherirFacturaDigital(String userLoggedIn, Integer codRamo, Integer nroPoliza, Integer sucursal)
			throws BusinessException {
		try {
			SeguridadServiciosDTO seguridadServiciosDTO = seguridadServiciosDAO.login(userLoggedIn);
			miBseDAO.adherirFacturaDigital(userLoggedIn, seguridadServiciosDTO.getToken(), codRamo, nroPoliza,
					sucursal);
			seguridadServiciosDAO.logout(userLoggedIn, seguridadServiciosDTO.getToken());
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio adherirFacturaDigital");
		}
	}

	@Override
	public void subirArchivo(String userLoggedIn, String nombreArchivo, byte[] archivo, String mimeType)
			throws BusinessException {
		try {
			SeguridadServiciosDTO seguridadServiciosDTO = seguridadServiciosDAO.login(userLoggedIn);
			miBseDAO.subirArchivo(userLoggedIn, seguridadServiciosDTO.getToken(), nombreArchivo, archivo, mimeType);
			seguridadServiciosDAO.logout(userLoggedIn, seguridadServiciosDTO.getToken());
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio subirArchivo");
		}
	}

	@Override
	public NumeroClienteDTO getNumeroCliente(String userLoggedIn) throws BusinessException {
		NumeroClienteDTO numeroClienteDTO = null;

		try {
			SeguridadServiciosDTO seguridadServiciosDTO = seguridadServiciosDAO.login(userLoggedIn);
			numeroClienteDTO = miBseDAO.getNumeroCliente(userLoggedIn, seguridadServiciosDTO.getToken());
			seguridadServiciosDAO.logout(userLoggedIn, seguridadServiciosDTO.getToken());
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getNumeroCliente");
		}

		return numeroClienteDTO;
	}

	@Override
	public FirmaElectronicaDTO getFirmaElectronica(String textoPlano) throws BusinessException {
		FirmaElectronicaDTO firmaElectronicaDTO = null;

		try {
			firmaElectronicaDTO = firmaElectronicaDAO.getFirmaElectronica(textoPlano);
		} catch (PersistException e) {
			procesarPersistException(e, "Error en negocio getFirmaElectronica");
		}

		return firmaElectronicaDTO;
	}
}
