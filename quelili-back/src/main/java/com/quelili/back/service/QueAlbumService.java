package com.quelili.back.service;

import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueAlbumVO;
import com.quelili.back.vo.SessionInfo;

public interface QueAlbumService {

    /**
     * 新增专辑信息
     * @param queAlbumVO
     * @param sessionInfo
     * @return
     */
    JsonRslt insert(QueAlbumVO queAlbumVO, SessionInfo sessionInfo);
    
    /**
     * 条件分页查询专辑信息
     * @param queAlbumVO
     * @param sessionInfo
     * @return
     */
    JsonRslt search(QueAlbumVO queAlbumVO, SessionInfo sessionInfo);
    
    /**
     * 专辑信息单条记录查询
     * @param albumId
     * @return
     */
    JsonRslt select(Integer albumId, SessionInfo sessionInfo);

    /**
     * 专辑信息记录修改
     * @param queAlbumVO
     * @param sessionInfo
     * @return
     */
    JsonRslt edit(QueAlbumVO queAlbumVO, SessionInfo sessionInfo);

    /**
     * 删除专辑信息
     * @param albumId
     * @return
     */
    JsonRslt del(Integer albumId, SessionInfo sessionInfo);

}
