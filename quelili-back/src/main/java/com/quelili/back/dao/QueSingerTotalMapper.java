package com.quelili.back.dao;

import com.quelili.back.model.QueSingerInfo;
import com.quelili.back.model.QueSingerTotal;
import com.quelili.back.model.QueSingerTotalExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QueSingerTotalMapper {
    int countByExample(QueSingerTotalExample example);

    int deleteByExample(QueSingerTotalExample example);

    int deleteByPrimaryKey(String prefix);

    int insert(QueSingerTotal record);

    int insertSelective(QueSingerTotal record);

    List<QueSingerTotal> selectByExample(QueSingerTotalExample example);

    QueSingerTotal selectByPrimaryKey(String prefix);

    int updateByExampleSelective(@Param("record") QueSingerTotal record, @Param("example") QueSingerTotalExample example);

    int updateByExample(@Param("record") QueSingerTotal record, @Param("example") QueSingerTotalExample example);

    int updateByPrimaryKeySelective(QueSingerTotal record);

    int updateByPrimaryKey(QueSingerTotal record);

    /**
     * 条件查询
     * @param record
     * @return
     */
    List<QueSingerTotal> search(QueSingerTotal record);

    /**
     * 查询所有
     * @return
     */
    List<QueSingerTotal> searchAllList();
}