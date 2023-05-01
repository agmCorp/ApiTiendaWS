package uy.com.bse.exception;

import uy.com.bse.dto.common.ErrorDTO;

public class BusinessException extends Exception {
	private static final long serialVersionUID = -7611694853873551483L;
	
	private ErrorDTO error;
	
	public BusinessException() {
		super("Error en Servicio");
	}

	public BusinessException(ErrorDTO error) {
		this.error = error;
	}
	
	public BusinessException(String internalMessage) {
		super(internalMessage);
	}

	public BusinessException(Throwable t) {
		super(t);
	}

	public BusinessException(String internalMessage, Throwable t) {
		super(internalMessage, t);
	}

	public BusinessException(ErrorDTO error, String internalMessage) {
		super(internalMessage);
		this.error = error;
	}

	public BusinessException(ErrorDTO error, String internalMessage, Throwable t) {
		super(internalMessage, t);
		this.error = error;
	}
	
	public ErrorDTO getError() {
		return error;
	}
}


