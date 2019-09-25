package com.quelili.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quelili.back.cache.IBaseCache;
import com.quelili.back.cache.ILangIdCache;
import com.quelili.back.cache.ITokenCache;
import com.quelili.back.cache.IUserCache;
import com.quelili.back.common.CacheConsts;
import com.quelili.back.common.Consts;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.SysUserMapper;
import com.quelili.back.model.SysUser;
import com.quelili.back.model.SysUserExample;
import com.quelili.back.service.SysUserService;
import com.quelili.back.util.*;
import com.quelili.back.vo.SessionInfo;
import com.quelili.back.vo.SysUserVO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private LocaleMessage localeMessage;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private ITokenCache tokenCache;

    @Autowired
    private IUserCache userCache;

    @Autowired
    private ILangIdCache langIdCache;

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;

    @Autowired
    private IBaseCache baseCache;

    @Override
    public JsonRslt login(String usercode, String userpass, Integer langid) {
        Map<String,Object> rstMap=new HashMap<>();
        try {
            SysUser rstUser = null;

            SysUserExample sysUserExample=new SysUserExample();
            SysUserExample.Criteria userCriteria = sysUserExample.createCriteria();
            userCriteria.andUsercodeEqualTo(usercode);
            List<SysUser> userList = sysUserMapper.selectByExample(sysUserExample);
            if(userList!=null && userList.size()>0){
                rstUser = userList.get(0);
            }

            if(rstUser!=null){
                if(rstUser.getUserpass().toLowerCase().equals(MD5Util.md5(userpass + Consts.PASS_ENCODE_KEY, "utf-8"))){

                    String token = CommUtils.getUUID();
                    tokenCache.set(token,rstUser.getUserid());
                    rstMap.put("token",token);
                    rstMap.put("username",rstUser.getUsername());
                    rstMap.put("userid",rstUser.getUserid());
                    rstMap.put("mobile",rstUser.getMobile());
                    rstMap.put("entid",rstUser.getEntid());

                    // langid入缓存
                    langIdCache.set(token, langid);
                    rstMap.put("parententid",rstUser.getParententid());

                    return JsonRslt.putSuccess(rstMap);
                }else{
                    return JsonRslt.putError("密码错误");
                }
            }else{
                return JsonRslt.putError("用户名错误");
            }

        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError("登录失败");
    }

    @Override
    public SysUser getUser(long userid) {
        try {
            return sysUserMapper.selectByPrimaryKey(userid);
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return null;
    }

    @Override
    public JsonRslt search(SysUserVO sysUserVO, SessionInfo sessionInfo) {
        try {
            SysUser sysUser=new SysUser();
            CommUtils.copyProperties(sysUser,sysUserVO);
            sysUser.setUserid(sessionInfo.getUserid());
            sysUser.setEntid(sessionInfo.getEntid());
            PageHelper.startPage(sysUser.getPage(),sysUser.getRows());
            List<SysUser> rstList = sysUserMapper.search(sysUser);
            return JsonRslt.putSuccess(new PageInfo(rstList));
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(null);
    }

    @Override
    @Transactional
    public JsonRslt insert(SysUserVO sysUserVO) {
        try {
            SysUser sysUser=new SysUser();

            //数据校验
            JsonRslt rslt=insertValidate(sysUserVO);

            if(!rslt.isSuccess()){
                return rslt;
            }
            sysUserVO.setUserid(snowflakeIdWorker.nextId());
            CommUtils.copyProperties(sysUser,sysUserVO);

            //插入用户
            appendInsertUser(sysUser);
            return this.select(sysUser.getUserid(), null);
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("ADD_FAIL", 0)/*"新增失败"*/);
    }


    @Override
    public JsonRslt select(Long userid, SessionInfo sessionInfo) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userid);
        Map rstMap = new HashMap();
        rstMap.put("user",sysUser);
        return JsonRslt.putSuccess(rstMap);
    }

    @Override
    @Transactional
    public JsonRslt edit(SysUserVO sysUserVO, SessionInfo sessionInfo) {
        try {
            SysUser sysUser=new SysUser();
            CommUtils.copyProperties(sysUser,sysUserVO);
            JsonRslt rslt=editValidate(sysUser);

            if(!rslt.isSuccess()){
                return rslt;
            }
            //更新用户
            appendUpdateUser(sessionInfo, sysUser);

            //删除该用户对应的缓存
            Long delId = baseCache.delete(CacheConsts.USER + sysUserVO.getUserid());
            LogUtils.logDebug("redis删除》》》》》》》"+delId);
            return this.select(sysUser.getUserid(),sessionInfo);
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("EDT_FAIL", sessionInfo.getLangid())/*"修改失败"*/);
    }


    @Override
    public JsonRslt del(Long userid, SessionInfo sessionInfo) {
        try {
            //删除用户
            sysUserMapper.deleteByPrimaryKey(userid);

            //删除该用户对应的缓存
            Long delId = baseCache.delete(CacheConsts.USER + userid);
            LogUtils.logDebug("redis删除》》》》》》》"+delId);

            return JsonRslt.putSuccess("删除成功");
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("DEL_FAIL", sessionInfo.getLangid())/*"删除失败"*/);
    }

    @Override
    public Long getUserId(String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        if(sessionInfo!=null){
            return sessionInfo.getUserid();
        }
        return null;
    }

    @Override
    public JsonRslt unbl(SysUserVO sysUserVO) {
        try {
            SysUser sysUser=new SysUser();
            CommUtils.copyProperties(sysUser,sysUserVO);
            sysUserMapper.updateByPrimaryKeySelective(sysUser);
            return JsonRslt.putSuccess("启用禁用成功");
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError("启用禁用失败");
    }

    @Override
    public JsonRslt editPass(SysUserVO sysUserVO, SessionInfo sessionInfo) {
        try {
            SysUser rstUser = sysUserMapper.selectByPrimaryKey(sessionInfo.getUserid());
            if(rstUser!=null && MD5Util.md5(sysUserVO.getUserpass() + Consts.PASS_ENCODE_KEY, "utf-8")
                    .equalsIgnoreCase(rstUser.getUserpass())){
                rstUser.setUpdatetime( DateUtil.getCurrTimestamp());
                rstUser.setUserpass(MD5Util.md5(sysUserVO.getNewuserpass() + Consts.PASS_ENCODE_KEY, "utf-8"));
                int count = sysUserMapper.updateByPrimaryKeySelective(rstUser);
                if(count>0){
                    return JsonRslt.putSuccess("修改密码成功");
                }
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError("修改密码失败");
    }

    private void appendUpdateUser(SessionInfo sessionInfo, SysUser sysUser) {
        sysUser.setUpdatetime(DateUtil.getCurrTimestamp());
        if(StringUtils.isBlank(sysUser.getUserpass())){
            sysUser.setUserpass(null);
        }else{
            sysUser.setUserpass(MD5Util.md5(sysUser.getUserpass()));
        }
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }


    private void appendInsertUser(SysUser sysUser) {
        sysUser.setCreatetime(DateUtil.getCurrTimestamp());
        sysUser.setUpdatetime(DateUtil.getCurrTimestamp());
        sysUser.setUnbl(Consts.UNBL_ENABLE);
        sysUser.setUserpass(MD5Util.md5(sysUser.getUserpass() + Consts.PASS_ENCODE_KEY, "utf-8"));
        sysUserMapper.insertSelective(sysUser);
    }

    /**
     * 修改数据校验
     * @param sysUser
     * @return
     */
    private JsonRslt editValidate(SysUser sysUser) {
        if(StringUtils.isNotBlank(sysUser.getUsercode())){
            SysUserExample usercodeExample=new SysUserExample();
            SysUserExample.Criteria usercodeCriteria = usercodeExample.createCriteria();
            usercodeCriteria.andUsercodeEqualTo(sysUser.getUsercode());
            usercodeCriteria.andUseridNotEqualTo(sysUser.getUserid());
            List<SysUser> usercodeRst = sysUserMapper.selectByExample(usercodeExample);
            if(CollectionUtils.isNotEmpty(usercodeRst)){
                return JsonRslt.putError("该登录名已存在");
            }

            SysUserExample mobileExample=new SysUserExample();
            SysUserExample.Criteria mobileCriteria = mobileExample.createCriteria();
            mobileCriteria.andUsercodeEqualTo(sysUser.getUsercode());
            mobileCriteria.andUseridNotEqualTo(sysUser.getUserid());
            List<SysUser> mobileRst = sysUserMapper.selectByExample(mobileExample);
            if(CollectionUtils.isNotEmpty(mobileRst)){
                return JsonRslt.putError("该手机号码已存在");
            }
        }
        return JsonRslt.putSuccess(null);
    }


    private JsonRslt insertValidate(SysUserVO sysUserVO) {
        if(StringUtils.isBlank(sysUserVO.getUsercode())){
            return JsonRslt.putError("登录名为空");
        }
        if(StringUtils.isBlank(sysUserVO.getMobile())){
            return JsonRslt.putError("手机号为空");
        }
        SysUserExample usercodeExmaple=new SysUserExample();
        SysUserExample.Criteria userCodeCriteria = usercodeExmaple.createCriteria();
        userCodeCriteria.andUsercodeEqualTo(sysUserVO.getUsercode());
        List<SysUser> usercodeRst = sysUserMapper.selectByExample(usercodeExmaple);
        if(CollectionUtils.isNotEmpty(usercodeRst)){
            return JsonRslt.putError("登录名已存在");
        }

        SysUserExample mobileExmaple=new SysUserExample();
        SysUserExample.Criteria mobileCriteria = mobileExmaple.createCriteria();
        mobileCriteria.andUsercodeEqualTo(sysUserVO.getMobile());
        List<SysUser> mobileRst = sysUserMapper.selectByExample(mobileExmaple);
        if(CollectionUtils.isNotEmpty(mobileRst)){
            return JsonRslt.putError("手机号已存在");
        }
        return JsonRslt.putSuccess(null);
    }

}
