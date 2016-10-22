package com.eliteams.quick4j.core.feature.cache.redis;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * RedisCache : redis 缓存 插件
 *
 * @author StarZou
 * @since 2015-03-20 11:12
 */
@Component(value = "redisCache")
public class RedisCache {
    private int port = 6379;
    private String host = "127.0.0.1";
    private Jedis jedis = new Jedis(host, port);

    public String cache(String key, String value, int seconds) {
        String result = jedis.set(key, value);
        jedis.expire(key, seconds);
        return result;
    }

    public String get(String key) {
        return jedis.get(key);
    }
}
