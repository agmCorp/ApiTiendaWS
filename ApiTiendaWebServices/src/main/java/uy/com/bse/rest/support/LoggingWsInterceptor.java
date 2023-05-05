package uy.com.bse.rest.support;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.logging.log4j.Logger;

import uy.com.bse.exception.WsException;
import uy.com.bse.util.common.EntityError;

@LoggingWsInterceptorBinding
@Interceptor
public class LoggingWsInterceptor {
	@Inject
	private Logger logger;
	private static final String TAG = "WEBSERVICE - ";

	@AroundInvoke
	public Object profile(InvocationContext ic) throws Exception {
		Long initTime = System.currentTimeMillis();
		String metodo = ic.getTarget().getClass().getCanonicalName() + "." + ic.getMethod().getName();

		Object obj = null;
		try {
			obj = ic.proceed();
		} catch (WsException wse) {
			EntityError entityError = ((EntityError) wse.getResponse().getEntity());
			String message = metodo + ", status response: " + wse.getMessage() + ", errorTraceNumber: "
					+ entityError.getErrorTraceNumber() + ", message: " + entityError.getMessage()
					+ ", internalMessage: " + wse.getInternalMessage();

			if (wse.getCause() != null) {
				logger.error(TAG + message, wse.getCause());

			} else {
				logger.error(TAG + message);
			}
			throw wse;
		} finally {
			long diffTime = System.currentTimeMillis() - initTime;
			logger.debug(TAG + "LATENCIA TOTAL SERVICIO REST " + metodo + ": " + diffTime + " milisegundo(s)");
		}
		return obj;
	}
}
