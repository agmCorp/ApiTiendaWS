package uy.com.bse.persistence.support;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import org.apache.logging.log4j.Logger;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;

@Singleton
@Startup
@Lock(LockType.WRITE)
@AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
public class CacheUtilImpl implements CacheUtil {
	private static final String NOMBRE_CACHE = "tiendaCache";

	@Inject
	private Logger logger;

	private CacheManager cacheManager;
	private Cache<String, Object> tiendaCache;

	@PostConstruct
	private void init() {
		cacheManager = CacheManagerBuilder.newCacheManagerBuilder().withCache(NOMBRE_CACHE, CacheConfigurationBuilder
				.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(100)).build())
				.build(true);

		tiendaCache = cacheManager.getCache(NOMBRE_CACHE, String.class, Object.class);
	}

	@Override
	public void addToCache(String key, Object obj) {
		if (!tiendaCache.containsKey(key)) {
			tiendaCache.put(key, obj);
			logger.debug("Se agrega " + key + " al cache tiendaCache");
		}
	}

	@Override
	public void removeFromCache(String key) {
		if (tiendaCache.containsKey(key)) {
			tiendaCache.remove(key);
			logger.debug("Se elimina " + key + " del cache tiendaCache");
		}
	}

	@Override
	@Lock(LockType.READ)
	public Object getFromCache(String key) {
		Object obj = null;
		if (tiendaCache.containsKey(key)) {
			obj = tiendaCache.get(key);
			logger.debug("Se recupera " + key + " del cache tiendaCache");
		}
		return obj;
	}

	@PreDestroy
	private void end() {
		tiendaCache.clear();
		cacheManager.close();
	}
}
