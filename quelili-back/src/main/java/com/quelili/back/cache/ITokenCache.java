package com.quelili.back.cache;

import com.quelili.back.vo.SessionInfo;

public interface ITokenCache {

	/**
	 *
	 * 描 述：[A] 获取token缓存数据
	 *
	 * @return
	 **/
	Long get(String token);

	/**
	 *
	 * 描 述：[A] 获取token缓存数据
	 *
	 * @return
	 **/
	SessionInfo getSessionInfo(String token);

	/**
	 *
	 * 描 述：[A] 设置缓存
	 *
	 * @return
	 **/
	void set(String token, Long userid);

	/**
	 * 刷新缓存
	 * 
	 */
	void update(String token);

    SessionInfo getSessionByUserid(long userid, String token);
}
