package com.quelili.back.controller;

import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.service.QueSingerInfoService;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueSingerInfoVO;
import com.quelili.back.vo.SessionInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/singerinfo")
@Api(tags="歌手信息API")
public class ApiQueSingerInfoController {

    @Autowired
    private QueSingerInfoService queSingerInfoService;

    @Autowired
    private TokenCache tokenCache;

    /**
     * 查询歌手信息
     * @param queSingerInfoVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value="查询条件歌手信息", notes="歌手信息接口，支持artistid、aartist或artistname" ,httpMethod="POST")
    public JsonRslt search(@RequestBody QueSingerInfoVO queSingerInfoVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerInfoService.search(queSingerInfoVO,sessionInfo);
    }

    /**
     * 歌手信息单条记录查询
     * @param queSingerInfoVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ApiOperation(value="查询单条歌手信息", notes="歌手信息接口，只传artistid即可" ,httpMethod="POST")
    public JsonRslt select(@RequestBody QueSingerInfoVO queSingerInfoVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerInfoService.select(queSingerInfoVO.getArtistid(), sessionInfo);
    }

    /**
     * 歌手信息插入
     * @param queSingerInfoVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value="歌手信息插入", notes="歌手信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt insert(@RequestBody QueSingerInfoVO queSingerInfoVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerInfoService.insert(queSingerInfoVO,sessionInfo);
    }

    /**
     * 歌手信息修改
     * @param queSingerInfoVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ApiOperation(value="歌手信息修改", notes="歌手信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt edit(@RequestBody QueSingerInfoVO queSingerInfoVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerInfoService.edit(queSingerInfoVO,sessionInfo);
    }

    /**
     * 歌手信息删除
     * @param queSingerInfoVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="歌手信息删除", notes="歌手信息接口，只传artistid即可" ,httpMethod="POST")
    public JsonRslt del(@RequestBody QueSingerInfoVO queSingerInfoVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerInfoService.del(queSingerInfoVO.getArtistid(),sessionInfo);
    }

    /**
     * 查询所有歌手信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/searchAllList", method = RequestMethod.POST)
    @ApiOperation(value="查询所有歌手信息", notes="货架接口" ,httpMethod="POST")
    public JsonRslt searchAllList(@RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerInfoService.searchAllList();
    }

}