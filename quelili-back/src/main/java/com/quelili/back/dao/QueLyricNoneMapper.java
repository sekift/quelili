package com.quelili.back.dao;

import com.quelili.back.model.QueLyric;
import com.quelili.back.model.QueLyricNone;
import com.quelili.back.model.QueLyricNoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueLyricNoneMapper {
    int countByExample(QueLyricNoneExample example);

    int deleteByExample(QueLyricNoneExample example);

    int deleteByPrimaryKey(Integer musicid);

    int insert(QueLyricNone record);

    int insertSelective(QueLyricNone record);

    List<QueLyricNone> selectByExample(QueLyricNoneExample example);

    QueLyricNone selectByPrimaryKey(Integer musicid);

    int updateByExampleSelective(@Param("record") QueLyricNone record, @Param("example") QueLyricNoneExample example);

    int updateByExample(@Param("record") QueLyricNone record, @Param("example") QueLyricNoneExample example);

    int updateByPrimaryKeySelective(QueLyricNone record);

    int updateByPrimaryKey(QueLyricNone record);

    /**
     * 条件查询
     * @param record
     * @return
     */
    List<QueLyricNone> search(QueLyricNone record);
}