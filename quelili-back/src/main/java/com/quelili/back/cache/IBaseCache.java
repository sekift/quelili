package com.quelili.back.cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public interface IBaseCache {


	Jedis getJedis();

	public int trans(String key, int cacheSeconds);
	/**
	 * 添加字符串缓存
	 * 
	 * @param key
	 * @param value
	 * @param cacheSeconds
	 * @return
	 */
	String addString(String key, String value, int cacheSeconds);

	long incr(String key);

	/**
	 * 批量添加字符串缓存
	 * 
	 * @param batchData
	 * @param cacheSeconds
	 */
	void addString(Map<String, String> batchData, int cacheSeconds);

	/**
	 * 添加列表缓存（先刷新缓存）
	 * 
	 * @param key
	 * @param list
	 * @param cacheSeconds
	 */
	void addList(String key, List<String> list, int cacheSeconds);

	/**
	 * 添加集合缓存（不刷新缓存）
	 * 
	 * @param key
	 * @param value
	 */
	void addToSet(String key, String[] value);

	/**
	 * 删除集合
	 * 
	 * @param key
	 * @param value
	 */
	void removeSet(String key, String value);

	/**
	 * 追加一个数据到列表缓存
	 * 
	 * @param key
	 * @param data
	 * @param cacheSeconds
	 */
	void rpush(String key, String data, int cacheSeconds);

	/**
	 * 追加一个数据到列表缓存
	 * @param key
	 * @param data
	 */
	void rpush(String key, String data);

	/**
	 * 追加多个数据到列表缓存
	 * 
	 * @param key
	 * @param batchData
	 * @param cacheSeconds
	 */
	void rpush(String key, List<String> batchData, int cacheSeconds);

	/**
	 * 删除list中的元素
	 * 
	 * @param key
	 * @param values
	 */
	void deleteDataFromList(String key, List<String> values);

	/**
	 * 添加一个entry到哈希
	 * 
	 * @param key
	 * @param field
	 * @param value
	 * @param cacheSeconds
	 */
	void addHashMap(String key, String field, String value, int cacheSeconds);

	/**
	 * 添加多个entry到哈希
	 * 
	 * @param key
	 * @param map
	 * @param cacheSeconds
	 */
	void addHashMap(String key, Map<String, String> map, int cacheSeconds);

	/**
	 * 获取字符串缓存
	 * 
	 * @param key
	 * @return
	 */
	String getString(String key);

	/**
	 * 获取多个字符串缓存
	 * 
	 * @param keys
	 * @return
	 */
	List<String> getString(String[] keys);

	/**
	 * 获取整个列表缓存
	 * 
	 * @param key
	 * @return
	 */
	List<String> getList(String key);

	/**
	 * 获取整个集合缓存
	 * 
	 * @param key
	 * @return
	 */
	Set<String> getSet(String key);

	/**
	 * 获取整个哈希缓存
	 * 
	 * @param key
	 * @return
	 */
	Map<String, String> getHashMap(String key);

	/**
	 * 获取单个哈希值缓存
	 * 
	 * @param key
	 * @param field
	 * @return
	 */
	String getHashMapValue(String key, String field);

	/**
	 * 删除KEY
	 * 
	 * @param key
	 * @return
	 */
	Long delete(String key);

	/**
	 * 刷新整个redis缓存
	 * 
	 * @param dbIndex
	 */
	void flushDB(int dbIndex);

	/**
	 * 判断KEY是否存在
	 * 
	 * @param key
	 * @return
	 */
	boolean existKey(String key);

	/**
	 * 获取字符串，不存在就查询数据库
	 * 
	 * @param key
	 * @param callable
	 * @return
	 */
	String get(String key, Callable<String> callable);

	/**
	 * 获取哈希值，不存在就查询数据库
	 * 
	 * @param key
	 * @param callable
	 * @return
	 */
	String hget(String key, String field, Callable<Map<String, String>> callable);

	Integer zCount(String key);

	Integer zCount(String key, Long min, Long max);

	void expire(String key, int cacheSeconds);

	/**
	 * 获取列表，不存在就调用回调方法
	 * 
	 * @param key
	 * @param callable
	 * @return
	 */
	List<String> getList(String key, Callable<List<String>> callable);

	/**
	 * 有序集合添加元素
	 * 
	 * @param key
	 * @param score
	 * @param value
	 */
	void zadd(String key, long score, String value);

	/**
	 * 通过分数递增返回指定区间内的成员
	 *
	 * @param key
	 * @param start 开始下标
	 * @param end 结束下标
	 * @return
	 */
	List<String> zRangeWithScore(String key, long start, long end);

	/**
	 * 通过分数区间获取集合
	 *
	 * @param key
	 * @param min
	 * @param max
	 * @return
	 */
	Set<String> zRangeByScore(String key, long min, long max);
	/**
	 * 通过分数区间降序获取集合
	 *
	 * @return
	 */
	 Set<String> zRevRangeByScore(String key, long min, long max, int offset, int count) ;


	/**
	 * 通过分数区间获取集合
	 *
	 * @param key
	 * @param min
	 * @param max
	 * @return
	 */
	Set<Tuple> zRangeByScoreWithScore(String key, long min, long max);


	/**
	 * 通过分数区间删除集合
	 *
	 * @param key
	 * @param min
	 * @param max
	 */
	void zRemoveRange(String key, long min, long max);

	/**
	 * 判断元素在有序集合中是否存在
	 *
	 * @param key
	 */
	boolean zExist(String key, String member);

	/**
	 * 获取集合元素个数
	 * 
	 * @param key
	 * @return
	 */
	long getListSize(String key);

	/**
	 * 左出栈
	 * 
	 * @param key
	 * @param length
	 * @return
	 */
	List<String> lpop(String key, int length);

	/**
	 * 获取列表中指定index的元素
	 * @param key
	 * @param index
	 * @return
	 */
	String lindex(String key, long index);

	/**
	 * 根据分数降序获取有序集合
	 * 
	 * @param key
	 * @return
	 */
	List<String> zRevRangeWithScore(String key, long start, long end);

	/**
	 * 修剪列表
	 * 
	 * @param key
	 * @param start
	 * @param end
	 */
	void trim(String key, long start, long end);

	/**
	 * 获取哈希map，不存在就访问数据库
	 * 
	 * @param key
	 * @param callable
	 * @return
	 */
	Map<String, String> getHashMap(String key, Callable<Map<String, String>> callable);

//	/**
//	 * 订阅通道
//	 */
//	void subscribe(RedisSubscriber subscriber, String... channel);

	Set<String> keys(String string);

	void hdel(final String key, final String... fields);

	void addHashMap(Jedis jedis, String key, String field, String value, int cacheSeconds);

	void release(Jedis jedis, boolean isBroken);

}
