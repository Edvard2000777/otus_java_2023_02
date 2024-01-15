package LRUCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
public class LRUCacheController {
    @Autowired
    private LRUCacheManager cacheManager;

    @GetMapping("/cache/{key}")
    public Object getFromCache(@PathVariable String key) {
        return cacheManager.get(key);
    }

    @PostMapping("/cache/{key}")
    public void addToCache(@PathVariable String key, @RequestBody Object value) {
        cacheManager.put(key, value);
    }
}
