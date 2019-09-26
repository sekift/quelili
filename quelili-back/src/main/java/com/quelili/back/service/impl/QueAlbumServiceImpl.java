package com.quelili.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.QueAlbumMapper;
import com.quelili.back.model.QueAlbum;
import com.quelili.back.service.QueAlbumService;
import com.quelili.back.service.QueAlbumService;
import com.quelili.back.util.CommUtils;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.util.LogUtils;
import com.quelili.back.vo.QueAlbumVO;
import com.quelili.back.vo.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueAlbumServiceImpl implements QueAlbumService {

    @Resource
    private LocaleMessage localeMessage;

    @Autowired
    private QueAlbumMapper queAlbumMapper;

    @Override
    public JsonRslt insert(QueAlbumVO queAlbumVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueAlbum queAlbum=new QueAlbum();
            CommUtils.copyProperties(queAlbum,queAlbumVO);

            int count = queAlbumMapper.insertSelective(queAlbum);
            if(count>0){
                return this.select(queAlbum.getAlbumid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("ADD_FAIL", sessionInfo.getLangid())/*"新增失败"*/);
    }

    @Override
    public JsonRslt search(QueAlbumVO queAlbumVO, SessionInfo sessionInfo) {
        try{
            PageHelper.startPage(queAlbumVO.getPage(),queAlbumVO.getRows());
            QueAlbum queAlbum = new QueAlbum();
            CommUtils.copyProperties(queAlbum,queAlbumVO);
            List<QueAlbum> rstList = queAlbumMapper.search(queAlbum);
            return JsonRslt.putSuccess(new PageInfo(rstList));
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("FAIL", sessionInfo.getLangid())/*失败*/);
    }

    @Override
    public JsonRslt select(Integer artistid, SessionInfo sessionInfo) {
        QueAlbum queAlbum = queAlbumMapper.selectByPrimaryKey(artistid);
        return JsonRslt.putSuccess(queAlbum);
    }

    @Override
    public JsonRslt edit(QueAlbumVO queAlbumVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueAlbum queAlbum=new QueAlbum();
            CommUtils.copyProperties(queAlbum,queAlbumVO);
            int count = queAlbumMapper.updateByPrimaryKeySelective(queAlbum);
            if(count>0){
                return this.select(queAlbum.getAlbumid(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("EDT_FAIL", sessionInfo.getLangid())/*"修改失败"*/);
    }


    @Override
    public JsonRslt del(Integer artistid, SessionInfo sessionInfo) {
        try{
            int count = queAlbumMapper.deleteByPrimaryKey(artistid);
            if(count>0){
                return JsonRslt.putSuccess(localeMessage.getMessage("DEL_SUCCESS", sessionInfo.getLangid())/*"删除成功"*/);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("DEL_FAIL", sessionInfo.getLangid())/*"删除失败"*/);
    }
}
