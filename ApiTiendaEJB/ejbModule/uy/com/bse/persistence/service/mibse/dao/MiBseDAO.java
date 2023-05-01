package uy.com.bse.persistence.service.mibse.dao;

import javax.ejb.Local;

import uy.com.bse.dto.mibse.NumeroClienteDTO;
import uy.com.bse.persistence.exception.PersistException;

@Local
public interface MiBseDAO {
	void adherirFacturaDigital(String seguridadServiciosUser, String tokenSeguridad, Integer codRamo, Integer nroPoliza,
			Integer sucursal) throws PersistException;

	void subirArchivo(String seguridadServiciosUser, String tokenSeguridad, String nombreArchivo, byte[] archivo,
			String mimeType) throws PersistException;

	NumeroClienteDTO getNumeroCliente(String seguridadServiciosUser, String tokenSeguridad) throws PersistException;
}
