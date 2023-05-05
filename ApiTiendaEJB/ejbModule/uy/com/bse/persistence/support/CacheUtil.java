package uy.com.bse.persistence.support;

public interface CacheUtil {
	void addToCache(String key, Object obj);

	void removeFromCache(String key);

	Object getFromCache(String key);
}
