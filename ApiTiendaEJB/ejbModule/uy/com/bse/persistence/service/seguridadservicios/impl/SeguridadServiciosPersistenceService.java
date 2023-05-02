package uy.com.bse.persistence.service.seguridadservicios.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.dto.seguridadservicios.SeguridadServiciosDTO;
import uy.com.bse.persistence.exception.PersistException;
import uy.com.bse.persistence.proxy.seguridadservicios.IWsSeguridad;
import uy.com.bse.persistence.proxy.seguridadservicios.ParamLogin;
import uy.com.bse.persistence.proxy.seguridadservicios.ParamLogout;
import uy.com.bse.persistence.proxy.seguridadservicios.ResultGenerico;
import uy.com.bse.persistence.proxy.seguridadservicios.ResultLogin;
import uy.com.bse.persistence.proxy.seguridadservicios.ResultLogout;
import uy.com.bse.persistence.proxy.seguridadservicios.ServiciosError;
import uy.com.bse.persistence.proxy.seguridadservicios.WsSeguridadServicios;
import uy.com.bse.persistence.service.PersistenceService;
import uy.com.bse.persistence.service.seguridadservicios.dao.SeguridadServiciosDAO;
import uy.com.bse.persistence.service.seguridadservicios.impl.map.LoginMap;
import uy.com.bse.persistence.support.LoggingPersistenceInterceptorBinding;

@Stateless
@LoggingPersistenceInterceptorBinding
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class SeguridadServiciosPersistenceService extends PersistenceService implements SeguridadServiciosDAO {
	private static final String URL = "seguridadServicios.url";
	private static final String APP_ID = "seguridadServicios.appId";
	private static final String PWD = "seguridadServicios.pwd";

	@WebServiceRef(WsSeguridadServicios.class)
	private IWsSeguridad proxy;

	private String appId;
	private String pwd;
	private Boolean initOK = false;

	@PostConstruct
	private void init() {
		setEndpoint((BindingProvider) proxy, configSoap.getString(URL));
		appId = configSoap.getString(APP_ID);
		pwd = configSoap.getString(PWD);
		initOK = true;
	}

	@Override
	protected Boolean inicializacionCorrecta() {
		return initOK;
	}
	
	private void procesarErrorEnRespuesta(ResultGenerico errorResultGenerico, String internalMessage)
			throws PersistException {
		if (errorResultGenerico.isHayError()) {
			ServiciosError serviciosError = errorResultGenerico.getError();
			ErrorDTO errorDTO = new ErrorDTO(String.valueOf(serviciosError.getCodigo()),
					serviciosError.getDescripcion(), false);
			PersistException e = new PersistException(errorDTO, internalMessage);
			throw e;
		}
	}

	@Override
	public SeguridadServiciosDTO login(String seguridadServiciosUser) throws PersistException {
		procesarErrorEnInicializacion();
		
		ResultLogin resp = null;
		try {
			ParamLogin paramLogin = new ParamLogin();
			paramLogin.setUsuario(seguridadServiciosUser);
			paramLogin.setClave(pwd);
			paramLogin.setApplicationID(appId);
			resp = proxy.login(paramLogin);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia login");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia login");
		
		return LoginMap.map(resp);
	}

	@Override
	public void logout(String seguridadServiciosUser, String tokenSeguridad) throws PersistException {
		procesarErrorEnInicializacion();
		
		ResultLogout resp = null;
		try {
			ParamLogout paramLogout = new ParamLogout();
			paramLogout.setUsuario(seguridadServiciosUser);
			paramLogout.setClave(tokenSeguridad);
			resp = proxy.logout(paramLogout);
		} catch (Exception e) {
			procesarWSFault(e, "Fault en persistencia logout");
		}
		procesarErrorEnRespuesta(resp, "Respuesta con error en persistencia logout");
	}
}
