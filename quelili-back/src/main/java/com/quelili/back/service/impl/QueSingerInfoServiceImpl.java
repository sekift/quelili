package com.quelili.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.QueSingerInfoMapper;
import com.quelili.back.model.QueSingerInfo;
import com.quelili.back.service.QueSingerInfoService;
import com.quelili.back.util.*;
import com.quelili.back.vo.QueSingerInfoVO;
import com.quelili.back.vo.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class QueSingerInfoServiceImpl implements QueSingerInfoService {

    @Resource
    private LocaleMessage localeMessage;

    @Autowired
    private QueSingerInfoMapper queSingerInfoMapper;

    @Override
    public JsonRslt insert(QueSingerInfoVO queSingerInfoVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueSingerInfo queSingerInfo=new QueSingerInfo();
            CommUtils.copyProperties(queSingerInfo,queSingerInfoVO);

            int count = queSingerInfoMapper.insertSelective(queSingerInfo);
            if(count>0){
                return this.select(queSingerInfo.getArtistid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("ADD_FAIL", sessionInfo.getLangid())/*"新增失败"*/);
    }

    @Override
    public JsonRslt search(QueSingerInfoVO queSingerInfoVO, SessionInfo sessionInfo) {
        try{
            PageHelper.startPage(queSingerInfoVO.getPage(),queSingerInfoVO.getRows());
            QueSingerInfo queSingerInfo = new QueSingerInfo();
            CommUtils.copyProperties(queSingerInfo,queSingerInfoVO);
            List<QueSingerInfo> rstList = queSingerInfoMapper.search(queSingerInfo);
            return JsonRslt.putSuccess(new PageInfo(rstList));
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("FAIL", sessionInfo.getLangid())/*失败*/);
    }

    @Override
    public JsonRslt select(Integer artistid, SessionInfo sessionInfo) {
        QueSingerInfo queSingerInfo = queSingerInfoMapper.selectByPrimaryKey(artistid);
        return JsonRslt.putSuccess(queSingerInfo);
    }

    @Override
    public JsonRslt edit(QueSingerInfoVO queSingerInfoVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueSingerInfo queSingerInfo=new QueSingerInfo();
            CommUtils.copyProperties(queSingerInfo,queSingerInfoVO);
            int count = queSingerInfoMapper.updateByPrimaryKeySelective(queSingerInfo);
            if(count>0){
                return this.select(queSingerInfo.getArtistid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("EDT_FAIL", sessionInfo.getLangid())/*"修改失败"*/);
    }


    @Override
    public JsonRslt del(Integer artistid, SessionInfo sessionInfo) {
        try{
            int count = queSingerInfoMapper.deleteByPrimaryKey(artistid);
            if(count>0){
                return JsonRslt.putSuccess(localeMessage.getMessage("DEL_SUCCESS", sessionInfo.getLangid())/*"删除成功"*/);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("DEL_FAIL", sessionInfo.getLangid())/*"删除失败"*/);
    }

    @Override
    public JsonRslt searchAllList() {
        List<Map> rstList=queSingerInfoMapper.searchAllList();
        return JsonRslt.putSuccess(rstList);
    }
}
