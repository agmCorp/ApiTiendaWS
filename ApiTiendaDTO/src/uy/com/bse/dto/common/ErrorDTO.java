package uy.com.bse.dto.common;

import java.io.Serializable;

public class ErrorDTO implements Serializable {
	private static final long serialVersionUID = -2738044779367357093L;
	
	private String errorTraceNumber;
	private String message;
	private Boolean fatal;

	public ErrorDTO(String errorTraceNumber, String message, Boolean fatal) {
		this.errorTraceNumber = errorTraceNumber;
		this.message = message;
		this.fatal = fatal;
	}
	
	public String getErrorTraceNumber() {
		return errorTraceNumber;
	}

	public void setErrorTraceNumber(String errorTraceNumber) {
		this.errorTraceNumber = errorTraceNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getFatal() {
		return fatal;
	}

	public void setFatal(Boolean fatal) {
		this.fatal = fatal;
	}
}
