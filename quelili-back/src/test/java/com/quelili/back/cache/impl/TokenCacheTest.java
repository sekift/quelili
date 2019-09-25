package com.quelili.back.cache.impl;

import com.quelili.back.cache.ITokenCache;
import com.quelili.back.common.CacheConsts;
import com.quelili.back.util.JsonUtil;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisPool;

@SpringBootTest
@RunWith(SpringRunner.class)
@Import({TokenCache.class, BaseCache.class, JedisPool.class, CacheConsts.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TokenCacheTest {
	@Autowired
	private ITokenCache tokenCache;

	@Test
	public void set() {
		tokenCache.set("a", 0L);
	}

	@Test
	public void get() {
		System.out.println(JsonUtil.toJson(tokenCache.get("a")));
	}
}