package uy.com.bse.persistence.service.seguridadservicios.dao;

import javax.ejb.Local;

import uy.com.bse.dto.seguridadservicios.SeguridadServiciosDTO;
import uy.com.bse.persistence.exception.PersistException;

@Local
public interface SeguridadServiciosDAO {
	SeguridadServiciosDTO login(String seguridadServiciosUser) throws PersistException;

	void logout(String seguridadServiciosUser, String tokenSeguridad) throws PersistException;
}
