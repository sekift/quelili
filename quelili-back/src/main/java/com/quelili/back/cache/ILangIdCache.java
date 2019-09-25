package com.quelili.back.cache;

/**
 * 作 者：sekift
 * 作 用：根据token获取langid int，语言类型
 * 日 期：2019年06月24日 下午3:28:56
 */
public interface ILangIdCache {

    /**
	 * 描 述：[A] 获取token缓存数据
	 *
	 * @return
	 */
	Integer get(String token);

	/**
	 * 描 述：[A] 设置缓存
	 *
	 * @return
	 */
	void set(String token, Integer langid);

	/**
	 * 刷新缓存
	 * 
	 */
	void update(String token, Integer langid);

}
