package uy.com.bse.persistence.exception;

import uy.com.bse.dto.common.ErrorDTO;

public class PersistException extends Exception {
	private static final long serialVersionUID = 7786355917639912498L;

	private ErrorDTO error;
	
	public PersistException() {
		super("Error en persistencia");
	}

	public PersistException(ErrorDTO error) {
		this.error = error;
	}
	
	public PersistException(String internalMessage) {
		super(internalMessage);
	}

	public PersistException(Throwable t) {
		super(t);
	}

	public PersistException(String internalMessage, Throwable t) {
		super(internalMessage, t);
	}

	public PersistException(ErrorDTO error, String internalMessage) {
		super(internalMessage);
		this.error = error;
	}

	public PersistException(ErrorDTO error, String internalMessage, Throwable t) {
		super(internalMessage, t);
		this.error = error;
	}
	
	public ErrorDTO getError() {
		return error;
	}
}
