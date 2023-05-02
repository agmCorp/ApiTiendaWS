package uy.com.bse.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class WsException extends WebApplicationException {
	private static final long serialVersionUID = 5909806934566695998L;

	public WsException(Response response) {
		super(response);
	}
	
	public WsException(Throwable t, Response response) {
		super(t, response);
	}
}
 