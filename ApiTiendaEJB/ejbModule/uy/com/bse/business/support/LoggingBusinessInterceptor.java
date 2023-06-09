package uy.com.bse.business.support;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.logging.log4j.Logger;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.exception.BusinessException;

@LoggingBusinessInterceptorBinding
@Interceptor
public class LoggingBusinessInterceptor {
	@Inject
	private Logger logger;
	private static final String TAG = "NEGOCIO - ";

	@PostConstruct
	public void postConstruct(InvocationContext ic) throws Exception {
		String clase = ic.getTarget().getClass().getCanonicalName();

		try {
			ic.proceed();
		} catch (Exception e) {
			logger.error(TAG + "Error en PostConstruct " + clase, e);
			throw e;
		}
	}

	@AroundInvoke
	public Object profile(InvocationContext ic) throws Exception {
		String metodo = ic.getTarget().getClass().getCanonicalName() + "." + ic.getMethod().getName();

		Object obj = null;
		try {
			obj = ic.proceed();
		} catch (BusinessException be) {
			ErrorDTO errorDTO = be.getError();
			Boolean fatal = errorDTO.getFatal();
			String message = metodo + ", errorTraceNumber: " + errorDTO.getErrorTraceNumber()
					+ ", message: " + errorDTO.getMessage() + ", fatal: " + errorDTO.getFatal() + ", internalMessage: "
					+ be.getMessage();
			if (fatal) {
				logger.error(TAG + "Error FATAL en método: " + message, be);
			} else {
				logger.error(TAG + "Error NO FATAL en método: " + message);
			}
			throw be;
		}
		return obj;
	}
}
