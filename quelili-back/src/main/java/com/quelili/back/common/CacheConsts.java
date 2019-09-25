package com.quelili.back.common;


import redis.clients.jedis.JedisPool;

/**
 * 缓存常量
 *
 * @author sekift
 */
public class CacheConsts {

	public static JedisPool JEDIS_POOL;

	//用户
	public static final String USER = "quelili:txuser:";
	public static final String TOKENKEY = "quelili:usertoken:";

	//组织配置表
	public static final String SYS_ENTCONFMAP = "quelili:sysentconfmap:";

	//语言
	public static final String LANGIDKEY = "quelili:langid:";

	/**
	 * 留言IP
	 */
	public static final String CONTACT_IP_KEY = "quelili:contactip";
	/**
	 * 留言IP统计的时间范围：1分钟
	 */
	public static final int CONTACT_IP_PERIOD = 1 * 60 * 1000;

}
