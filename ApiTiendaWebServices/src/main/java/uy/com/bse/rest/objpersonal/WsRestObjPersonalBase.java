package uy.com.bse.rest.objpersonal;

import javax.ejb.EJB;
import javax.ws.rs.core.SecurityContext;

import uy.com.bse.facade.FachadaObjPersonalLocal;
import uy.com.bse.rest.WsRestBase;

public class WsRestObjPersonalBase extends WsRestBase {
	@EJB
	protected FachadaObjPersonalLocal fachada;

	protected String getUserLoggedIn(SecurityContext securityContext) {
		return getKeycloakAccessToken(securityContext).getPreferredUsername().toUpperCase();
	}

	protected String getUserLoggedInTipoDoc(String userLoggedIn) {
		return userLoggedIn.split("#")[0];
	}

	protected String getUserLoggedInDoc(String userLoggedIn) {
		return userLoggedIn.split("#")[1];
	}
}
