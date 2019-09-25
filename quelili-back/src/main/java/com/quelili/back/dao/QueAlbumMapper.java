package com.quelili.back.dao;

import com.quelili.back.model.QueAlbum;
import com.quelili.back.model.QueAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueAlbumMapper {
    int countByExample(QueAlbumExample example);

    int deleteByExample(QueAlbumExample example);

    int deleteByPrimaryKey(Integer albumid);

    int insert(QueAlbum record);

    int insertSelective(QueAlbum record);

    List<QueAlbum> selectByExample(QueAlbumExample example);

    QueAlbum selectByPrimaryKey(Integer albumid);

    int updateByExampleSelective(@Param("record") QueAlbum record, @Param("example") QueAlbumExample example);

    int updateByExample(@Param("record") QueAlbum record, @Param("example") QueAlbumExample example);

    int updateByPrimaryKeySelective(QueAlbum record);

    int updateByPrimaryKey(QueAlbum record);
}