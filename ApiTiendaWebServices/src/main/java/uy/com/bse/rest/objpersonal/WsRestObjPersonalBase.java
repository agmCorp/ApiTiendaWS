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
		// TODO ALVARO LOGUEAR CREO O SACAR ESTO
		if (fachada == null) {
			throw new BusinessException(getGenericError(), "Error al crear FachadaObjPersonalLocal");
		}
		return fachada;
	}

	protected String getUserLoggedIn(SecurityContext securityContext) {
		// TODO ALVARO ACA NECESITO EL USUARIO LOGUEADO
		// return getKeycloakAccessToken(securityContext).getPreferredUsername();
		return "CI#49545150";
	}
}
