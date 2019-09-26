package com.quelili.back.controller;

import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.service.QueMusicService;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueMusicVO;
import com.quelili.back.vo.SessionInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/music")
@Api(tags="歌曲信息API")
public class ApiQueMusicController {

    @Autowired
    private QueMusicService queMusicService;

    @Autowired
    private TokenCache tokenCache;

    /**
     * 查询歌曲信息
     * @param queMusicVO
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value="查询条件歌曲信息", notes="歌曲信息接口，支持musicid、musicname、artistid或artistname" ,httpMethod="POST")
    public JsonRslt search(@RequestBody QueMusicVO queMusicVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queMusicService.search(queMusicVO,sessionInfo);
    }

    /**
     * 歌曲信息单条记录查询
     * @param queMusicVO
     * @return
     */
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ApiOperation(value="查询单条歌曲信息", notes="歌曲信息接口，只传musicid即可" ,httpMethod="POST")
    public JsonRslt select(@RequestBody QueMusicVO queMusicVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queMusicService.select(queMusicVO.getMusicid(), sessionInfo);
    }

    /**
     * 歌曲信息插入
     * @param queMusicVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value="歌曲信息插入", notes="歌曲信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt insert(@RequestBody QueMusicVO queMusicVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queMusicService.insert(queMusicVO,sessionInfo);
    }

    /**
     * 歌曲信息修改
     * @param queMusicVO
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ApiOperation(value="歌曲信息修改", notes="歌曲信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt edit(@RequestBody QueMusicVO queMusicVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queMusicService.edit(queMusicVO,sessionInfo);
    }

    /**
     * 歌曲信息删除
     * @param queMusicVO
     * @return
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="歌曲信息删除", notes="歌曲信息接口，只传musicid即可" ,httpMethod="POST")
    public JsonRslt del(@RequestBody QueMusicVO queMusicVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queMusicService.del(queMusicVO.getMusicid(),sessionInfo);
    }

}