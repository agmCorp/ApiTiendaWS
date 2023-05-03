package uy.com.bse.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class WsException extends WebApplicationException {
	private static final long serialVersionUID = 5909806934566695998L;

	private String internalMessage;

	public WsException() {
		super("Error en servicio");
	}

	public WsException(Response response) {
		super(response);
	}

	public WsException(Throwable t, Response response) {
		super(t, response);
	}

	public WsException(String internalMessage, Throwable t, Response response) {
		super(t, response);
		this.internalMessage = internalMessage;
	}

	public String getInternalMessage() {
		return internalMessage;
	}

	public void setInternalMessage(String internalMessage) {
		this.internalMessage = internalMessage;
	}
}
