package com.quelili.back.config;

import com.quelili.back.common.CacheConsts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Component
// @Order(value=1)//有多个CommandLineRunner接口时可以指定执行顺序（小的先执行）
public class DataInitConfig implements CommandLineRunner {
	
	@Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${spring.redis.password}")
    private String password;
    
    @Value("${spring.redis.database}")
    private int database;
    
	@Override
	public void run(String... args) throws Exception {

		System.out.println("<<<<<<<<<<<<初始化back的Redis数据成功>>>>>>>>>>>>>>");
		
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);

        CacheConsts.JEDIS_POOL = new JedisPool(jedisPoolConfig, host, port, timeout, password, database);
	}

}
