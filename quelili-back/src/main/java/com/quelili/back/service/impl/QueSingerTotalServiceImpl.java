package com.quelili.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.QueSingerTotalMapper;
import com.quelili.back.model.QueSingerTotal;
import com.quelili.back.service.QueSingerTotalService;
import com.quelili.back.util.CommUtils;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.util.LogUtils;
import com.quelili.back.vo.QueSingerTotalVO;
import com.quelili.back.vo.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueSingerTotalServiceImpl implements QueSingerTotalService {

    @Resource
    private LocaleMessage localeMessage;

    @Autowired
    private QueSingerTotalMapper queSingerTotalMapper;

    @Override
    public JsonRslt insert(QueSingerTotalVO queSingerTotalVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueSingerTotal queSingerTotal=new QueSingerTotal();
            CommUtils.copyProperties(queSingerTotal,queSingerTotalVO);

            int count = queSingerTotalMapper.insertSelective(queSingerTotal);
            if(count>0){
                return this.select(queSingerTotal.getPrefix(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("ADD_FAIL", sessionInfo.getLangid())/*"新增失败"*/);
    }

    @Override
    public JsonRslt search(QueSingerTotalVO queSingerTotalVO, SessionInfo sessionInfo) {
        try{
            PageHelper.startPage(queSingerTotalVO.getPage(),queSingerTotalVO.getRows());
            QueSingerTotal queSingerTotal = new QueSingerTotal();
            CommUtils.copyProperties(queSingerTotal, queSingerTotalVO);
            List<QueSingerTotal> rstList = queSingerTotalMapper.search(queSingerTotal);
            return JsonRslt.putSuccess(new PageInfo(rstList));
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("FAIL", sessionInfo.getLangid())/*失败*/);
    }

    @Override
    public JsonRslt select(String prefix, SessionInfo sessionInfo) {
        QueSingerTotal queSingerTotal = queSingerTotalMapper.selectByPrimaryKey(prefix);
        return JsonRslt.putSuccess(queSingerTotal);
    }

    @Override
    public JsonRslt edit(QueSingerTotalVO queSingerTotalVO, SessionInfo sessionInfo) {
        try{
            final Long entid = sessionInfo.getEntid();
            QueSingerTotal queSingerTotal=new QueSingerTotal();
            CommUtils.copyProperties(queSingerTotal,queSingerTotalVO);
            int count = queSingerTotalMapper.updateByPrimaryKeySelective(queSingerTotal);
            if(count>0){
                return this.select(queSingerTotal.getPrefix(), sessionInfo);
            }
        }catch (Exception e){
            LogUtils.logError(CommUtils.getException(e));
        }
        return JsonRslt.putError(localeMessage.getMessage("EDT_FAIL", sessionInfo.getLangid())/*"修改失败"*/);
    }


    @Override
    public JsonRslt del(String prefix, SessionInfo sessionInfo) {
        try{
            int count = queSingerTotalMapper.deleteByPrimaryKey(prefix);
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
        List<QueSingerTotal> rstList = queSingerTotalMapper.searchAllList();
        return JsonRslt.putSuccess(rstList);
    }
}
