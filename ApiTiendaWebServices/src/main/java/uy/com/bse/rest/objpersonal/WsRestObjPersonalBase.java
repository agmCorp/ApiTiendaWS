package uy.com.bse.rest.objpersonal;

import javax.ejb.EJB;
import javax.ws.rs.core.SecurityContext;

import uy.com.bse.exception.BusinessException;
import uy.com.bse.facade.FachadaObjPersonalLocal;
import uy.com.bse.rest.WsRestBase;

public class WsRestObjPersonalBase extends WsRestBase {
	@EJB
	private FachadaObjPersonalLocal fachada;

	protected FachadaObjPersonalLocal getFachada() throws BusinessException {
		if (fachada == null) {
			throw getGenericWsException("Error al crear FachadaObjPersonalLocal"); 
		}
		return fachada;
	}

	// TODO ALVARO ACA NECESITO EL USUARIO LOGUEADO
	protected String getUserLoggedIn(SecurityContext securityContext) {
		// return getKeycloakAccessToken(securityContext).getPreferredUsername();
		return "CI#49545150";
	}

	// TODO ALVARO ACA NECESITO EL USUARIO LOGUEADO
	protected String getUserLoggedInTipoDoc(String userLoggedIn) {
		return userLoggedIn.split("#")[0];
	}

	// TODO ALVARO ACA NECESITO EL USUARIO LOGUEADO
	protected String getUserLoggedInDoc(String userLoggedIn) {
		return userLoggedIn.split("#")[1];
	}
}
