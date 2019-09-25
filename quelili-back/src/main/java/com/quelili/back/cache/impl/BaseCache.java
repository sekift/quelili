package com.quelili.back.cache.impl;

import com.google.common.collect.Lists;
import com.quelili.back.cache.IBaseCache;
import com.quelili.back.common.CacheConsts;
import com.quelili.back.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Tuple;
import redis.clients.jedis.exceptions.JedisException;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

//@Configuration
//@EnableCaching
@Service
public class BaseCache implements IBaseCache {
	private static final Logger logger = LoggerFactory.getLogger(BaseCache.class);

    @Override
    public Jedis getJedis()  {
        
        Jedis jedis = CacheConsts.JEDIS_POOL.getResource();
        return jedis;

    }

    @Override
    public void release(Jedis jedis, boolean isBroken) {
        if (jedis != null) {
            if (isBroken) {
            	CacheConsts.JEDIS_POOL.returnBrokenResource(jedis);
            } else {
            	CacheConsts.JEDIS_POOL.returnResource(jedis);
            }
        }
    }

    @Override
    public String addString(String key, String value, int cacheSeconds) {
        Jedis jedis = null;
        boolean isBroken = false;
        String lastVal = null;
        try {
            jedis = this.getJedis();
            lastVal = jedis.getSet(key, value);
            if (cacheSeconds != 0) {
                jedis.expire(key, cacheSeconds);
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return lastVal;
    }

    @Override
    public long incr(String key) {
        Jedis jedis = null;
        boolean isBroken = false;
        long lastVal = 0;
        try {
            jedis = this.getJedis();
            lastVal = jedis.incr(key);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return lastVal;
    }

    @Override
    public void addString(Map<String, String> batchData, int cacheSeconds) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            Pipeline pipeline = jedis.pipelined();
            for (Map.Entry<String, String> element : batchData.entrySet()) {
                if (cacheSeconds != 0) {
                    pipeline.setex(element.getKey(), cacheSeconds, element.getValue());
                } else {
                    pipeline.set(element.getKey(), element.getValue());
                }
            }
            pipeline.sync();
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void addList(String key, List<String> list, int cacheSeconds) {
        if (list != null && list.size() > 0) {
            Jedis jedis = null;
            boolean isBroken = false;
            try {
                jedis = this.getJedis();
                if (jedis.exists(key)) {
                    jedis.del(key);
                }
                jedis.rpush(key, list.toArray(new String[list.size()]));
                if (cacheSeconds != 0) {
                    jedis.expire(key, cacheSeconds);
                }
            } catch (JedisException e) {
                isBroken = true;
                logger.error("", e);
            } catch (Exception e) {
                isBroken = true;
                logger.error("", e);
            } finally {
                release(jedis, isBroken);
            }
        }
    }

    @Override
    public void addToSet(String key, String[] value) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.sadd(key, value);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void removeSet(String key, String value) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.srem(key, value);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void rpush(String key, String data, int cacheSeconds) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.rpush(key, data);
            if (cacheSeconds != 0) {
                jedis.expire(key, cacheSeconds);
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void rpush(String key, String data) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.rpush(key, data);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void rpush(String key, List<String> batchData, int cacheSeconds) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.rpush(key, batchData.toArray(new String[batchData.size()]));
            if (cacheSeconds != 0) {
                jedis.expire(key, cacheSeconds);
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    /**
     * 鍒犻櫎list涓殑鍏冪礌
     *
     * @param key
     * @param values
     */
    @Override
    public void deleteDataFromList(String key, List<String> values) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            Pipeline pipeline = jedis.pipelined();
            if (values != null && !values.isEmpty()) {
                for (String val : values) {
                    pipeline.lrem(key, 0, val);
                }
            }
            pipeline.sync();
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void addHashMap(String key, String field, String value, int cacheSeconds) {
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            if (jedis != null) {
                jedis.hset(key, field, value);
                if (cacheSeconds != 0) {
                    jedis.expire(key, cacheSeconds);
                }
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void addHashMap(String key, Map<String, String> map, int cacheSeconds) {
        boolean isBroken = false;
        Jedis jedis = null;
        if (map != null && map.size() > 0) {
            try {
                jedis = this.getJedis();
                jedis.hmset(key, map);
                if (cacheSeconds != 0) {
                    jedis.expire(key, cacheSeconds);
                }
            } catch (Exception e) {
                isBroken = true;
                logger.error("", e);
            } finally {
                release(jedis, isBroken);
            }
        }
    }

    @Override
    public String getString(String key) {
        String value = null;
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            if (jedis.exists(key)) {
                value = jedis.get(key);
                value = StringUtil.isNotEmpty(value) && !"nil".equalsIgnoreCase(value) ? value : null;
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return value;
    }

    @Override
    public String get(String key, Callable<String> callable) {
        String value = this.getString(key);
        if (value == null) {
            try {
                String dbValue = callable.call();
                this.addString(key, dbValue, 0);
                value = this.getString(key);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value;
    }

    @Override
    public List<String> getString(String[] keys) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            return jedis.mget(keys);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public List<String> getList(String key, Callable<List<String>> callable) {
        List<String> list = this.getList(key);
        if (list != null) {
            try {
                list = callable.call();
                this.addList(key, list, 0);
            } catch (Exception e) {
                logger.error("", e);
            }
        }
        return list;
    }

    @Override
    public List<String> lpop(String key, int length) {

        List<String> list = Lists.newArrayList();
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            for (int i = 0; i < length && jedis.llen(key) > 0; i++) {
                String value = jedis.lpop(key);
                list.add(value);
            }
        } catch (JedisException e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return list;

    }

    @Override
    public String lindex(String key, long index) {
        String val = "";
        boolean isBroken = false;
        Jedis jedis = null;
        try{
            jedis = this.getJedis();
            val = jedis.lindex(key, index);
        } catch (Exception e){
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }

        return val;
    }

    @Override
    public List<String> getList(String key) {
        List<String> list = null;
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            if (jedis.exists(key)) {
                list = jedis.lrange(key, 0, -1);
            }
        } catch (JedisException e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return list;
    }

    @Override
    public long getListSize(String key) {
        long size = 0;
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            size = jedis.llen(key);
        } catch (JedisException e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return size;
    }

    @Override
    public Set<String> getSet(String key) {
        Set<String> list = null;
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            if (jedis.exists(key)) {
                list = jedis.smembers(key);
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return list;
    }

    @Override
    public Map<String, String> getHashMap(String key) {
        Map<String, String> hashMap = null;
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            hashMap = jedis.hgetAll(key);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return hashMap;
    }

    @Override
    public Map<String, String> getHashMap(String key, Callable<Map<String, String>> callable) {
        Map<String, String> map = getHashMap(key);
        if (map == null || map.size() == 0) {
            try {
                Map<String, String> dbValueMap = callable.call();
                this.addHashMap(key, dbValueMap, 0);
                map = this.getHashMap(key);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    @Override
    public String getHashMapValue(String key, String field) {
        String value = null;
        boolean isBroken = false;
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            if (jedis != null) {
                if (jedis.exists(key)) {
                    value = jedis.hget(key, field);
                }
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return value;
    }

    public Long getIdentifyId(String identifyName) {
        boolean isBroken = false;
        Jedis jedis = null;
        Long identify = null;
        try {
            jedis = this.getJedis();
            if (jedis != null) {
                identify = jedis.incr(identifyName);
                if (identify == 0) {
                    return jedis.incr(identifyName);
                } else {
                    return identify;
                }
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    /**
     * 根据key删除数据
     *
     * @param key
     * @return
     */
    @Override
    public Long delete(String key) {
        boolean isBroken = false;
        Jedis jedis = null;
        long result = 0;
        try {
            jedis = this.getJedis();
            return jedis.del(key);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return result;
    }

    @Override
    public void flushDB(int dbIndex) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.select(dbIndex);
            jedis.flushDB();
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public boolean existKey(String key) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            return jedis.exists(key);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return false;
    }

    @Override
    public String hget(String key, String field, Callable<Map<String, String>> callable) {
        Map<String, String> map = getHashMap(key);
        if (map == null || map.size() == 0) {
            try {
                Map<String, String> dbValueMap = callable.call();
                this.addHashMap(key, dbValueMap, 0);
            } catch (Exception e) {
                logger.error("", e);
            }
        }
        return this.getHashMapValue(key, field);
    }

    @Override
    public void zadd(String key, long score, String value) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.zadd(key, score, value);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public List<String> zRevRangeWithScore(String key, long start, long end) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            Set<Tuple> tuples = jedis.zrevrangeWithScores(key, start, end);
            List<String> list = Lists.newArrayList();
            for (Tuple tuple : tuples) {
                list.add(tuple.getElement());
            }
            return list;
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public List<String> zRangeWithScore(String key, long start, long end) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            Set<Tuple> tuples = jedis.zrangeWithScores(key, start, end);
            List<String> list = Lists.newArrayList();
            for (Tuple tuple : tuples) {
                list.add(tuple.getElement());
            }
            return list;
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public Set<String> zRangeByScore(String key, long min, long max) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            return jedis.zrangeByScore(key, min, max);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public Set<String> zRevRangeByScore(String key, long min, long max, int offset, int count) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            return jedis.zrevrangeByScore(key, max, min, offset, count);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public Set<Tuple> zRangeByScoreWithScore(String key, long min, long max) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            return jedis.zrangeByScoreWithScores(key, min, max);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public void zRemoveRange(String key, long min, long max) {

        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.zremrangeByScore(key, min + "", max + "");
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }

    }

    @Override
    public boolean zExist(String key, String member) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            Long index = jedis.zrank(key, member);
            if (null == index) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return false;
    }

    @Override
    public Integer zCount(String key) {
    	return zCount(key, 0L,Long.MAX_VALUE);
	}

    @Override
    public Integer zCount(String key, Long min, Long max) {
    	if (min == null) { min = 0L;}
    	if (max == null) { max = Long.MAX_VALUE;}

        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            Long count = jedis.zcount(key, min, max);
            return count.intValue();
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
        return null;
    }

    @Override
    public void expire(String key, int cacheSeconds) {
        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.expire(key, cacheSeconds);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }
    }

    @Override
    public void trim(String key, long start, long end) {

        Jedis jedis = null;
        boolean isBroken = false;
        try {
            jedis = this.getJedis();
            jedis.ltrim(key, start, end);
        } catch (Exception e) {
            isBroken = true;
            logger.error("", e);
        } finally {
            release(jedis, isBroken);
        }

    }

    @Override
    public Set<String> keys(String string) {
        Jedis jedis = null;
        Set<String> set = null;
        try {
            jedis = this.getJedis();
            set = jedis.keys(string);
        } catch (Exception e) {
            logger.error("redis keys error", e);
        } finally {
            release(jedis, false);
        }

        return set;
    }

    @Override
    public void hdel(String key, String... fields) {
        Jedis jedis = null;
        try {
            jedis = this.getJedis();
            jedis.hdel(key, fields);
        } catch (Exception e) {
            logger.error("redis hdel error", e);
        } finally {
            release(jedis, false);
        }

    }

	@Override
	public int trans(String key, int cacheSeconds) {
		// TODO Auto-generated method stub
		Jedis jedis = null;
        try {
            jedis = this.getJedis();
            redis.clients.jedis.Transaction tx = jedis.multi();
            
            tx.incr(key);
            if (cacheSeconds != 0) {
                jedis.expire(key, cacheSeconds);
            }
            tx.exec();
            
            
        } catch (Exception e) {
            logger.error("redis hdel error", e);
        } finally {
            release(jedis, false);
        }
		return 0;
	}

//	/* (non-Javadoc)
//	 * @see com.cr.cloud.cache.IBaseCache#subscribe(com.cr.cloud.cache.RedisSubscriber, java.lang.String[])
//	 */
//	@Override
//	public void subscribe(RedisSubscriber subscriber, String... channel) {
//		// TODO Auto-generated method stub
//		Jedis jedis = null;
//        try {
//            jedis = this.getJedis();
//            jedis.select(getDBIndex());
//            jedis.subscribe(subscriber, channel);
//        } catch (Exception e) {
//            logger.error("subscribe error", e);
//        } finally {
//            release(jedis, false);
//        }
//	}

    @Override
    public void addHashMap(Jedis jedis, String key, String field, String value, int cacheSeconds) {
        try {
            if (jedis != null) {
                jedis.hset(key, field, value);
                if (cacheSeconds != 0) {
                    jedis.expire(key, cacheSeconds);
                }
            }
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}