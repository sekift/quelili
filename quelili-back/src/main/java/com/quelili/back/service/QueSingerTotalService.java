package com.quelili.back.service;

import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueSingerTotalVO;
import com.quelili.back.vo.SessionInfo;

public interface QueSingerTotalService {

    /**
     * 新增歌手总数信息
     * @param queSingerTotalVO
     * @param sessionInfo
     * @return
     */
    JsonRslt insert(QueSingerTotalVO queSingerTotalVO, SessionInfo sessionInfo);
    
    /**
     * 条件分页查询歌手总数信息
     * @param queSingerTotalVO
     * @param sessionInfo
     * @return
     */
    JsonRslt search(QueSingerTotalVO queSingerTotalVO, SessionInfo sessionInfo);
    
    /**
     * 歌手总数信息单条记录查询
     * @param prefix
     * @return
     */
    JsonRslt select(String prefix, SessionInfo sessionInfo);

    /**
     * 歌手总数信息记录修改
     * @param queSingerTotalVO
     * @param sessionInfo
     * @return
     */
    JsonRslt edit(QueSingerTotalVO queSingerTotalVO, SessionInfo sessionInfo);

    /**
     * 删除歌手总数信息
     * @param prefix
     * @return
     */
    JsonRslt del(String prefix, SessionInfo sessionInfo);

    /**
     * 查询所有歌手总数信息
     * @return
     */
    JsonRslt searchAllList();
}
