package com.quelili.back.cache.impl;

import com.quelili.back.cache.IBaseCache;
import com.quelili.back.cache.ILangIdCache;
import com.quelili.back.common.CacheConsts;
import com.quelili.back.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LangIdCache implements ILangIdCache {

    @Autowired
    private IBaseCache baseCache;

    @Override
    public Integer get(String token) {
        if (StringUtil.isEmpty(token)) {
            return null;
        }
        String langid = baseCache.getString(CacheConsts.LANGIDKEY + token);
        if (langid != null) {
            baseCache.expire(CacheConsts.LANGIDKEY + token, 86400);
        }
        if (langid == null) {
            return null;
        }
        return Integer.valueOf(langid);
    }

    @Override
    public void set(String token, Integer langid) {
        baseCache.addString(CacheConsts.LANGIDKEY + token, langid + "", 86400);
    }

    @Override
    public void update(String token, Integer langid) {
        Long flag = baseCache.delete(CacheConsts.LANGIDKEY + token);
        if(1 == flag){
            set(token, langid);
        }
    }
}
