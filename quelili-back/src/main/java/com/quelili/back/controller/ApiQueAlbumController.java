package com.quelili.back.controller;

import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.service.QueAlbumService;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueAlbumVO;
import com.quelili.back.vo.SessionInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/album")
@Api(tags="专辑信息API")
public class ApiQueAlbumController {

    @Autowired
    private QueAlbumService queAlbumService;

    @Autowired
    private TokenCache tokenCache;

    /**
     * 查询专辑信息
     * @param queAlbumVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value="查询条件专辑信息", notes="专辑信息接口，支持albumid、albumname、artistid或artistname" ,httpMethod="POST")
    public JsonRslt search(@RequestBody QueAlbumVO queAlbumVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queAlbumService.search(queAlbumVO,sessionInfo);
    }

    /**
     * 专辑信息单条记录查询
     * @param queAlbumVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ApiOperation(value="查询单条专辑信息", notes="专辑信息接口，只传albumid即可" ,httpMethod="POST")
    public JsonRslt select(@RequestBody QueAlbumVO queAlbumVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queAlbumService.select(queAlbumVO.getAlbumid(), sessionInfo);
    }

    /**
     * 专辑信息插入
     * @param queAlbumVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value="专辑信息插入", notes="专辑信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt insert(@RequestBody QueAlbumVO queAlbumVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queAlbumService.insert(queAlbumVO,sessionInfo);
    }

    /**
     * 专辑信息修改
     * @param queAlbumVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ApiOperation(value="专辑信息修改", notes="专辑信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt edit(@RequestBody QueAlbumVO queAlbumVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queAlbumService.edit(queAlbumVO,sessionInfo);
    }

    /**
     * 专辑信息删除
     * @param queAlbumVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="专辑信息删除", notes="专辑信息接口，只传albumid即可" ,httpMethod="POST")
    public JsonRslt del(@RequestBody QueAlbumVO queAlbumVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queAlbumService.del(queAlbumVO.getAlbumid(),sessionInfo);
    }

}