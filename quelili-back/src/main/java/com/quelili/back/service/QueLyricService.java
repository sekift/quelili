package com.quelili.back.service;

import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueLyricVO;
import com.quelili.back.vo.SessionInfo;

public interface QueLyricService {

    /**
     * 新增歌词信息
     * @param queLyricVO
     * @param sessionInfo
     * @return
     */
    JsonRslt insert(QueLyricVO queLyricVO, SessionInfo sessionInfo);
    
    /**
     * 条件分页查询歌词信息
     * @param queLyricVO
     * @param sessionInfo
     * @return
     */
    JsonRslt search(QueLyricVO queLyricVO, SessionInfo sessionInfo);
    
    /**
     * 歌词信息单条记录查询
     * @param musicId
     * @return
     */
    JsonRslt select(Integer musicId, SessionInfo sessionInfo);

    /**
     * 歌词信息记录修改
     * @param queLyricVO
     * @param sessionInfo
     * @return
     */
    JsonRslt edit(QueLyricVO queLyricVO, SessionInfo sessionInfo);

    /**
     * 删除歌词信息
     * @param musicId
     * @return
     */
    JsonRslt del(Integer musicId, SessionInfo sessionInfo);

}
