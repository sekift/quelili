package com.quelili.back.dao;

import com.quelili.back.model.SysUser;
import com.quelili.back.model.SysUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> search(SysUser sysUser);

    /**
     * 根据组织entid查询用户
     * @param entid
     * @return
     */
    List<SysUser> searchByEntId(@Param("entid") Long entid);
}