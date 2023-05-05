package uy.com.bse.util.common;

import java.io.Serializable;

public class EntityError implements Serializable {
	private static final long serialVersionUID = 1085339368168723009L;
	
	private String errorTraceNumber;
	private String message;

	public EntityError(String errorTraceNumber, String message) {
		this.errorTraceNumber = errorTraceNumber;
		this.message = message;
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
}
