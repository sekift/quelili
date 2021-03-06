package com.quelili.back.controller;

import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.common.Consts;
import com.quelili.back.service.SysUserService;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.SessionInfo;
import com.quelili.back.vo.SysUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Api(tags="用户信息API")
public class ApiSysUserController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private TokenCache tokenCache;

    /**
     * 用户登录
     * @param sysUserVO
     * @param langid
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value="用户登录", notes="用户操作" ,httpMethod="POST")
    public JsonRslt login(@RequestBody SysUserVO sysUserVO, @RequestParam(name = "langid", defaultValue = "0", required = false) Integer langid) {
        if (StringUtils.isNotEmpty(sysUserVO.getUsercode()) && StringUtils.isNotEmpty(sysUserVO.getUserpass())) {
            if(null == langid) {
                langid = Consts.LANG_ID_ZH_CN;
            }
            return sysUserService.login(sysUserVO.getUsercode(), sysUserVO.getUserpass(), langid);
        }
        return JsonRslt.putError("登录失败");
    }

    /**
     * 按条件查询用户
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value="按条件查询用户", notes="用户操作" ,httpMethod="POST")
    public JsonRslt search(@RequestBody SysUserVO sysUserVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo=tokenCache.getSessionInfo(token);
        return sysUserService.search(sysUserVO,sessionInfo);
    }


    /**
     * 插入用户数据
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value="插入用户数据", notes="用户操作" ,httpMethod="POST")
    public JsonRslt insert(@RequestBody SysUserVO sysUserVO) {
        return sysUserService.insert(sysUserVO);
    }

    /**
     * 单条记录查询
     */
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ApiOperation(value="查询单条用户数据", notes="用户操作，只传userid即可" ,httpMethod="POST")
    public JsonRslt select(@RequestBody SysUserVO sysUserVO,@RequestHeader("token") String token) {
        SessionInfo sessionInfo=tokenCache.getSessionInfo(token);
        return sysUserService.select(sysUserVO.getUserid(), sessionInfo);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ApiOperation(value="修改用户数据", notes="用户操作" ,httpMethod="POST")
    public JsonRslt edit(@RequestBody SysUserVO sysUserVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return sysUserService.edit(sysUserVO,sessionInfo);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="删除用户数据", notes="用户操作" ,httpMethod="POST")
    public JsonRslt del(@RequestBody SysUserVO sysUserVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return sysUserService.del(sysUserVO.getUserid(), sessionInfo);
    }


    /**
     * 用户启用禁用
     */
    @RequestMapping(value = "/unbl", method = RequestMethod.POST)
    @ApiOperation(value="用户启用禁用", notes="用户操作" ,httpMethod="POST")
    public JsonRslt unbl(@RequestBody SysUserVO sysUserVO) {
        return sysUserService.unbl(sysUserVO);
    }

    /**
     * 修改密码
     */
    @RequestMapping(value = "/editPass", method = RequestMethod.POST)
    @ApiOperation(value="修改密码", notes="用户操作" ,httpMethod="POST")
    public JsonRslt editPass(@RequestBody SysUserVO sysUserVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return sysUserService.editPass(sysUserVO,sessionInfo);
    }

}
