package uy.com.bse.persistence.service.firmaelectronica.dao;

import javax.ejb.Local;

import uy.com.bse.dto.firmaelectronica.FirmaElectronicaDTO;
import uy.com.bse.persistence.exception.PersistException;

@Local
public interface FirmaElectronicaDAO {
	FirmaElectronicaDTO getFirmaElectronica(String textoPlano) throws PersistException;
}
