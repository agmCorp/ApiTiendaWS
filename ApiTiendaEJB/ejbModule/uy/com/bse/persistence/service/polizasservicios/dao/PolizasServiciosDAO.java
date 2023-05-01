package uy.com.bse.persistence.service.polizasservicios.dao;

import java.util.Date;

import javax.ejb.Local;

import uy.com.bse.dto.polizasservicios.NuevaFacturacionInteractivaDTO;
import uy.com.bse.persistence.exception.PersistException;

@Local
public interface PolizasServiciosDAO {
	NuevaFacturacionInteractivaDTO nuevaFacturacionInteractiva(String seguridadServiciosUser, String tokenSeguridad,
			Integer codRamo, Integer nroPoliza, String contemplaDias, Date fecha) throws PersistException;
}
