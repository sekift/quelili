package com.quelili.back.dao;

import com.quelili.back.model.QueMusic;
import com.quelili.back.model.QueMusicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueMusicMapper {
    int countByExample(QueMusicExample example);

    int deleteByExample(QueMusicExample example);

    int deleteByPrimaryKey(Integer musicid);

    int insert(QueMusic record);

    int insertSelective(QueMusic record);

    List<QueMusic> selectByExample(QueMusicExample example);

    QueMusic selectByPrimaryKey(Integer musicid);

    int updateByExampleSelective(@Param("record") QueMusic record, @Param("example") QueMusicExample example);

    int updateByExample(@Param("record") QueMusic record, @Param("example") QueMusicExample example);

    int updateByPrimaryKeySelective(QueMusic record);

    int updateByPrimaryKey(QueMusic record);
}