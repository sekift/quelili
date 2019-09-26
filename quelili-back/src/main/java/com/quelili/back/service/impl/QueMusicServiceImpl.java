package com.quelili.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.QueMusicMapper;
import com.quelili.back.model.QueMusic;
import com.quelili.back.service.QueMusicService;
import com.quelili.back.util.CommUtils;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.util.LogUtils;
import com.quelili.back.vo.QueMusicVO;
import com.quelili.back.vo.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueMusicServiceImpl implements QueMusicService {

    @Resource
    private LocaleMessage localeMessage;

    @Autowired
    private QueMusicMapper queMusicMapper;

    @Override
    public JsonRslt insert(QueMusicVO queMusicVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueMusic queMusic = new QueMusic();
            CommUtils.copyProperties(queMusic,queMusicVO);

            int count = queMusicMapper.insertSelective(queMusic);
            if(count>0){
                return this.select(queMusic.getMusicid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("ADD_FAIL", sessionInfo.getLangid())/*"新增失败"*/);
    }

    @Override
    public JsonRslt search(QueMusicVO queMusicVO, SessionInfo sessionInfo) {
        try{
            PageHelper.startPage(queMusicVO.getPage(),queMusicVO.getRows());
            QueMusic queMusic = new QueMusic();
            CommUtils.copyProperties(queMusic,queMusicVO);
            List<QueMusic> rstList = queMusicMapper.search(queMusic);
            return JsonRslt.putSuccess(new PageInfo(rstList));
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("FAIL", sessionInfo.getLangid())/*失败*/);
    }

    @Override
    public JsonRslt select(Integer artistid, SessionInfo sessionInfo) {
        QueMusic queMusic = queMusicMapper.selectByPrimaryKey(artistid);
        return JsonRslt.putSuccess(queMusic);
    }

    @Override
    public JsonRslt edit(QueMusicVO queMusicVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueMusic queMusic=new QueMusic();
            CommUtils.copyProperties(queMusic,queMusicVO);
            int count = queMusicMapper.updateByPrimaryKeySelective(queMusic);
            if(count>0){
                return this.select(queMusic.getMusicid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("EDT_FAIL", sessionInfo.getLangid())/*"修改失败"*/);
    }


    @Override
    public JsonRslt del(Integer artistid, SessionInfo sessionInfo) {
        try{
            int count = queMusicMapper.deleteByPrimaryKey(artistid);
            if(count>0){
                return JsonRslt.putSuccess(localeMessage.getMessage("DEL_SUCCESS", sessionInfo.getLangid())/*"删除成功"*/);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("DEL_FAIL", sessionInfo.getLangid())/*"删除失败"*/);
    }
}
