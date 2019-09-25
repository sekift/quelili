package com.quelili.back.service;

import com.quelili.back.model.SysUser;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.SessionInfo;
import com.quelili.back.vo.SysUserVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public interface SysUserService {

    /**
     * 用户登录
     * @param username
     * @param userpass
     * @return
     */
    JsonRslt login(String username, String userpass, Integer langid);

    /**
     * 根据userId查询用户
     * @param userid
     * @return
     */
    SysUser getUser(long userid);

    /**
     * 根据登录用户以及部门查询其可查看用户
     * @param sysUserVO
     * @param sessionInfo
     * @return
     */
    JsonRslt search(SysUserVO sysUserVO, SessionInfo sessionInfo);

    /**
     * 插入用户数据
     * @param sysUserVO
     * @return
     */
    JsonRslt insert(SysUserVO sysUserVO);

    /**
     * 单条用户记录查询
     * @param userid
     * @return
     */
    JsonRslt select(Long userid, SessionInfo sessionInfo);

    /**
     * 用户信息修改
     * @param sysUserVO
     * @param sessionInfo
     * @return
     */
    JsonRslt edit(SysUserVO sysUserVO, SessionInfo sessionInfo);

    /**
     * 删除用户信息
     * @param userid
     * @return
     */
    JsonRslt del(Long userid, SessionInfo sessionInfo);

    @RequestMapping(value = "/getUserId", method = RequestMethod.POST)
    Long getUserId(@RequestParam("token") String token);

    /**
     * 用户启用禁用
     * @param sysUserVO
     * @return
     */
    JsonRslt unbl(SysUserVO sysUserVO);

    /**
     * 修改密码
     * @param sysUserVO
     * @param sessionInfo
     * @return
     */
    JsonRslt editPass(SysUserVO sysUserVO, SessionInfo sessionInfo);
}
