package com.quelili.back.dao;

import com.quelili.back.model.QueAlbum;
import com.quelili.back.model.QueLyric;
import com.quelili.back.model.QueLyricExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueLyricMapper {
    int countByExample(QueLyricExample example);

    int deleteByExample(QueLyricExample example);

    int deleteByPrimaryKey(Integer musicid);

    int insert(QueLyric record);

    int insertSelective(QueLyric record);

    List<QueLyric> selectByExample(QueLyricExample example);

    QueLyric selectByPrimaryKey(Integer musicid);

    int updateByExampleSelective(@Param("record") QueLyric record, @Param("example") QueLyricExample example);

    int updateByExample(@Param("record") QueLyric record, @Param("example") QueLyricExample example);

    int updateByPrimaryKeySelective(QueLyric record);

    int updateByPrimaryKey(QueLyric record);

    /**
     * 条件查询
     * @param record
     * @return
     */
    List<QueLyric> search(QueLyric record);
}