package com.quelili.back.util;

import com.quelili.back.common.CacheConsts;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {

    /**
     * 测试环境，初始化redis连接池
     */
    public static void init(){
        String host = "127.0.0.1";
        int port = 6379;
        String password = "123456";

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(8);
        jedisPoolConfig.setMaxWaitMillis(-1);

        CacheConsts.JEDIS_POOL = new JedisPool(jedisPoolConfig, host, port, 5000, password,0);

        System.out.println("[test]Redis 连接池初始化成功！");
    }
}
