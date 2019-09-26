package com.quelili.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.QueLyricMapper;
import com.quelili.back.model.QueLyric;
import com.quelili.back.service.QueLyricService;
import com.quelili.back.util.CommUtils;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.util.LogUtils;
import com.quelili.back.vo.QueLyricVO;
import com.quelili.back.vo.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueLyricServiceImpl implements QueLyricService {

    @Resource
    private LocaleMessage localeMessage;

    @Autowired
    private QueLyricMapper queLyricMapper;

    @Override
    public JsonRslt insert(QueLyricVO queLyricVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueLyric queLyric = new QueLyric();
            CommUtils.copyProperties(queLyric,queLyricVO);

            int count = queLyricMapper.insertSelective(queLyric);
            if(count>0){
                return this.select(queLyric.getMusicid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("ADD_FAIL", sessionInfo.getLangid())/*"新增失败"*/);
    }

    @Override
    public JsonRslt search(QueLyricVO queLyricVO, SessionInfo sessionInfo) {
        try{
            PageHelper.startPage(queLyricVO.getPage(),queLyricVO.getRows());
            QueLyric queLyric = new QueLyric();
            CommUtils.copyProperties(queLyric,queLyricVO);
            List<QueLyric> rstList = queLyricMapper.search(queLyric);
            return JsonRslt.putSuccess(new PageInfo(rstList));
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("FAIL", sessionInfo.getLangid())/*失败*/);
    }

    @Override
    public JsonRslt select(Integer artistid, SessionInfo sessionInfo) {
        QueLyric queLyric = queLyricMapper.selectByPrimaryKey(artistid);
        return JsonRslt.putSuccess(queLyric);
    }

    @Override
    public JsonRslt edit(QueLyricVO queLyricVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueLyric queLyric=new QueLyric();
            CommUtils.copyProperties(queLyric,queLyricVO);
            int count = queLyricMapper.updateByPrimaryKeySelective(queLyric);
            if(count>0){
                return this.select(queLyric.getMusicid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("EDT_FAIL", sessionInfo.getLangid())/*"修改失败"*/);
    }


    @Override
    public JsonRslt del(Integer artistid, SessionInfo sessionInfo) {
        try{
            int count = queLyricMapper.deleteByPrimaryKey(artistid);
            if(count>0){
                return JsonRslt.putSuccess(localeMessage.getMessage("DEL_SUCCESS", sessionInfo.getLangid())/*"删除成功"*/);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("DEL_FAIL", sessionInfo.getLangid())/*"删除失败"*/);
    }
}
