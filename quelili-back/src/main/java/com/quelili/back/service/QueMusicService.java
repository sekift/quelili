package com.quelili.back.service;

import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueMusicVO;
import com.quelili.back.vo.SessionInfo;

public interface QueMusicService {

    /**
     * 新增歌曲信息
     * @param queMusicVO
     * @param sessionInfo
     * @return
     */
    JsonRslt insert(QueMusicVO queMusicVO, SessionInfo sessionInfo);
    
    /**
     * 条件分页查询歌曲信息
     * @param queMusicVO
     * @param sessionInfo
     * @return
     */
    JsonRslt search(QueMusicVO queMusicVO, SessionInfo sessionInfo);
    
    /**
     * 歌曲信息单条记录查询
     * @param musicId
     * @return
     */
    JsonRslt select(Integer musicId, SessionInfo sessionInfo);

    /**
     * 歌曲信息记录修改
     * @param queMusicVO
     * @param sessionInfo
     * @return
     */
    JsonRslt edit(QueMusicVO queMusicVO, SessionInfo sessionInfo);

    /**
     * 删除歌曲信息
     * @param musicId
     * @return
     */
    JsonRslt del(Integer musicId, SessionInfo sessionInfo);

}
