package com.quelili.back.cache;

import com.quelili.back.vo.SessionInfo;

public interface IUserCache {

	/**
	 *
	 * 描 述：[A] 获取缓存数据
	 *
	 * @return
	 **/
	SessionInfo get(long userid, String token);

	/**
	 * 刷新缓存
	 * 
	 * @param userid
	 */
	void update(long userid);

}
