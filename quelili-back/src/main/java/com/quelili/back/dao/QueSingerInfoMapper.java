package com.quelili.back.dao;

import com.quelili.back.model.QueSingerInfo;
import com.quelili.back.model.QueSingerInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QueSingerInfoMapper {
    int countByExample(QueSingerInfoExample example);

    int deleteByExample(QueSingerInfoExample example);

    int deleteByPrimaryKey(Integer artistid);

    int insert(QueSingerInfo record);

    int insertSelective(QueSingerInfo record);

    List<QueSingerInfo> selectByExample(QueSingerInfoExample example);

    QueSingerInfo selectByPrimaryKey(Integer artistid);

    int updateByExampleSelective(@Param("record") QueSingerInfo record, @Param("example") QueSingerInfoExample example);

    int updateByExample(@Param("record") QueSingerInfo record, @Param("example") QueSingerInfoExample example);

    int updateByPrimaryKeySelective(QueSingerInfo record);

    int updateByPrimaryKey(QueSingerInfo record);

    /**
     * 条件查询
     * @param record
     * @return
     */
    List<QueSingerInfo> search(QueSingerInfo record);

    /**
     * 查询所有
     * @return
     */
    List<Map> searchAllList();
}