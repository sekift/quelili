package com.quelili.back.service;

import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueSingerInfoVO;
import com.quelili.back.vo.SessionInfo;

public interface QueSingerInfoService {

    /**
     * 新增歌手信息
     * @param queSingerInfoVO
     * @param sessionInfo
     * @return
     */
    JsonRslt insert(QueSingerInfoVO queSingerInfoVO, SessionInfo sessionInfo);
    
    /**
     * 条件分页查询歌手信息
     * @param queSingerInfoVO
     * @param sessionInfo
     * @return
     */
    JsonRslt search(QueSingerInfoVO queSingerInfoVO, SessionInfo sessionInfo);
    
    /**
     * 歌手信息单条记录查询
     * @param artistId
     * @return
     */
    JsonRslt select(Integer artistId, SessionInfo sessionInfo);

    /**
     * 歌手信息记录修改
     * @param queSingerInfoVO
     * @param sessionInfo
     * @return
     */
    JsonRslt edit(QueSingerInfoVO queSingerInfoVO, SessionInfo sessionInfo);

    /**
     * 删除歌手信息
     * @param artistId
     * @return
     */
    JsonRslt del(Integer artistId, SessionInfo sessionInfo);

    /**
     * 查询所有歌手信息
     * @return
     */
    JsonRslt searchAllList();
}
