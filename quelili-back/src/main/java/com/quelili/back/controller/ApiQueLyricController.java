package com.quelili.back.controller;

import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.service.QueLyricService;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueLyricVO;
import com.quelili.back.vo.SessionInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lyric")
@Api(tags="歌词信息API")
public class ApiQueLyricController {

    @Autowired
    private QueLyricService queLyricService;

    @Autowired
    private TokenCache tokenCache;

    /**
     * 查询歌词信息
     * @param queLyricVO
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value="查询条件歌词信息", notes="歌词信息接口，支持musicid、musicname、artistid或artistname" ,httpMethod="POST")
    public JsonRslt search(@RequestBody QueLyricVO queLyricVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queLyricService.search(queLyricVO,sessionInfo);
    }

    /**
     * 歌词信息单条记录查询
     * @param queLyricVO
     * @return
     */
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ApiOperation(value="查询单条歌词信息", notes="歌词信息接口，只传musicid即可" ,httpMethod="POST")
    public JsonRslt select(@RequestBody QueLyricVO queLyricVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queLyricService.select(queLyricVO.getMusicid(), sessionInfo);
    }

    /**
     * 歌词信息插入
     * @param queLyricVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value="歌词信息插入", notes="歌词信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt insert(@RequestBody QueLyricVO queLyricVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queLyricService.insert(queLyricVO,sessionInfo);
    }

    /**
     * 歌词信息修改
     * @param queLyricVO
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ApiOperation(value="歌词信息修改", notes="歌词信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt edit(@RequestBody QueLyricVO queLyricVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queLyricService.edit(queLyricVO,sessionInfo);
    }

    /**
     * 歌词信息删除
     * @param queLyricVO
     * @return
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="歌词信息删除", notes="歌词信息接口，只传musicid即可" ,httpMethod="POST")
    public JsonRslt del(@RequestBody QueLyricVO queLyricVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queLyricService.del(queLyricVO.getMusicid(),sessionInfo);
    }

}