package uy.com.bse.business;

import uy.com.bse.exception.BusinessException;
import uy.com.bse.persistence.exception.PersistException;

public class Fachada {
	
	protected void procesarPersistException(PersistException e, String internalMessage) throws BusinessException {
		BusinessException be = new BusinessException(e.getError(), internalMessage, e);
		throw be;
	}
}
