package LRUCache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

public class LRUCacheManager {
    @Value("${cache.max-size}")
    private int maxSize;

    @Value("${cache.expire-time-seconds}")
    private int expireTimeSeconds;

    private Cache<String, Object> cache;

    @PostConstruct
    private void init() {
        cache = CacheBuilder.newBuilder()
                .maximumSize(maxSize)
                .expireAfterWrite(expireTimeSeconds, TimeUnit.SECONDS)
                .build();
    }

    public Object get(String key) {
        return cache.getIfPresent(key);
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }
}
