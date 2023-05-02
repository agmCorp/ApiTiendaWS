package uy.com.bse.persistence.support;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.logging.log4j.Logger;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.persistence.exception.PersistException;

@LoggingPersistenceInterceptorBinding
@Interceptor
public class LoggingPersistenceInterceptor {
	@Inject
	private Logger logger;

	@PostConstruct
	public void postConstruct(InvocationContext ic) throws Exception {
		String clase = ic.getTarget().getClass().getCanonicalName();

		logger.debug("PERSISTENCIA - Inicio PostConstruct " + clase);
		try {
			ic.proceed();
		} catch (Exception e) {
			logger.error("PERSISTENCIA - Error FATAL en PostConstruct, el componente no se pudo inicializar correctamente " + clase, e);
		} finally {
			logger.debug("PERSISTENCIA - Fin PostConstruct " + clase);
		}
	}

	@AroundInvoke
	public Object profile(InvocationContext ic) throws Exception {
		Long initTime = System.currentTimeMillis();
		String metodo = ic.getTarget().getClass().getCanonicalName() + "." + ic.getMethod().getName();

		/* TODO ALVARO
		 * SEGUIR CON ESTO, ESTOY LOGUEANDO TODOS LOS PARAMETROS QUE RECIBEN LOS METODOS INTERCEPTADOS
		 * FALTA VER COMO HAGO CUNADO USR O PWD SON NULL POR ERROR EN EL RESOURCEBUNDLE
		 * FALTA PROBAR CON EXCEPCIONES Y ESO (FAULT Y DE NEGOCIO)
		 * FALTA VER SI PONGO ESTO EN EL INTERCEPTOR BUSINESS (la verdad no me interesa tan arriba, prefiero aca abajo del todo)
		 */
		Object obj = null;
		try {
			Object[] params = ic.getParameters();
			if (params.length > 0) {
				String parametros = "";
				for (Object param : params) {
					parametros += "\"" + param + "\" ";
				}
				logger.debug("PERSISTENCIA - Los parámetros de " + metodo + " son: " + parametros.trim());
			}
			obj = ic.proceed();
		} catch (PersistException pe) {
			ErrorDTO errorDTO = pe.getError();
			Boolean fatal = errorDTO.getFatal();
			String message = metodo + ", traceNumber: " + errorDTO.getErrorTraceNumber() + ", message: "
					+ errorDTO.getMessage() + ", fatal: " + errorDTO.getFatal() + ", internalMessage: "
					+ pe.getMessage();
			if (fatal) {
				logger.error("PERSISTENCIA - Error FATAL en método: " + message, pe);
			} else {
				logger.error("PERSISTENCIA - Error NO FATAL en método: " + message);
			}
			throw pe;
		} finally {
			long diffTime = System.currentTimeMillis() - initTime;
			logger.debug("PERSISTENCIA - PROXY " + metodo + " latencia " + diffTime + " milisegundos");
		}
		return obj;
	}
}
