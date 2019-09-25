package com.quelili.back.cache.impl;

import com.quelili.back.cache.IBaseCache;
import com.quelili.back.cache.ILangIdCache;
import com.quelili.back.cache.ITokenCache;
import com.quelili.back.cache.IUserCache;
import com.quelili.back.common.CacheConsts;
import com.quelili.back.common.InvalidTokenException;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.vo.SessionInfo;
import com.quelili.back.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenCache implements ITokenCache {

	@Autowired
	private IBaseCache baseCache;

	@Autowired
	private IUserCache userCache;

	@Autowired
	private ILangIdCache langIdCache;

	@Autowired
	private LocaleMessage localeMessage;

	@Override
	public Long get(String token) {
		if (StringUtil.isEmpty(token)) {
			return null;
		}
		String userid = baseCache.getString(CacheConsts.TOKENKEY + token);
		if (userid != null) {
			baseCache.expire(CacheConsts.TOKENKEY + token, 86400);
		}
		if (userid == null) {
			return null;
		}
		return Long.parseLong(userid);
	}

	@Override
	public void set(String token, Long userid) {
		baseCache.addString(CacheConsts.TOKENKEY + token, userid + "", 86400);
	}

	@Override
	public void update(String token) {
		baseCache.delete(CacheConsts.TOKENKEY + token);
	}

	@Override
	public SessionInfo getSessionInfo(String token) {
		Long userid = get(token);
		Integer langId = langIdCache.get(token);
		if(userid!=null){
			// 这里的语言需要改成当前token的langid返回
			SessionInfo info = userCache.get(userid, token);
			info.setLangid(langId);
			return info;
		}
		throw new InvalidTokenException(localeMessage.getMessage("MUST_LOGIN", langId == null ? 0 : langId)/*"登录已失效"*/);
	}

	@Override
	public SessionInfo getSessionByUserid(long userid, String token) {
		return userCache.get(userid, token);
	}

}
