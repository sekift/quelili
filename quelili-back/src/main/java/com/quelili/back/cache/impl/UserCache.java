package com.quelili.back.cache.impl;

import com.quelili.back.cache.IBaseCache;
import com.quelili.back.cache.ILangIdCache;
import com.quelili.back.cache.IUserCache;
import com.quelili.back.common.CacheConsts;
import com.quelili.back.model.SysUser;
import com.quelili.back.service.SysUserService;
import com.quelili.back.util.JsonUtil;
import com.quelili.back.vo.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;


@Service
public class UserCache implements IUserCache {

    @Autowired
    private IBaseCache baseCache;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private ILangIdCache langIdCache;

    @Override
    public SessionInfo get(final long userid, final String token) {
        String infoStr = baseCache.get(CacheConsts.USER + userid, new Callable<String>() {

            @Override
            public String call() throws Exception {
                SysUser user = sysUserService.getUser(userid);
                //根据UserId查询角色
                SessionInfo sessionInfo = new SessionInfo();
                sessionInfo.setUserid(user.getUserid());
                sessionInfo.setUsercode(user.getUsercode());
                sessionInfo.setUsername(user.getUsername());
                sessionInfo.setEmail(user.getEmail());
                sessionInfo.setMobile(user.getMobile());
                sessionInfo.setEntid(user.getEntid());
                sessionInfo.setParententid(user.getParententid());
                sessionInfo.setNote(user.getNote());

                // 添加语言
                sessionInfo.setLangid(langIdCache.get(token));
                return JsonUtil.toJson(sessionInfo);
            }
        });
        if (infoStr == null) {
            return null;
        }
        return JsonUtil.toBean(infoStr, SessionInfo.class);
    }

    @Override
    public void update(long userid) {
        baseCache.delete(CacheConsts.USER + userid);
    }

}
