package com.quelili.back.controller;

import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.service.QueSingerTotalService;
import com.quelili.back.util.JsonRslt;
import com.quelili.back.vo.QueSingerTotalVO;
import com.quelili.back.vo.SessionInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/singertotal")
@Api(tags="歌手总数信息API")
public class ApiQueSingerTotalController {

    @Autowired
    private QueSingerTotalService queSingerTotalService;

    @Autowired
    private TokenCache tokenCache;

    /**
     * 查询歌手总数信息
     * @param queSingerTotalVO
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value="查询条件歌手总数信息", notes="歌手总数信息接口，支持prefix，例如A、B、C等或#" ,httpMethod="POST")
    public JsonRslt search(@RequestBody QueSingerTotalVO queSingerTotalVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerTotalService.search(queSingerTotalVO,sessionInfo);
    }

    /**
     * 歌手总数信息单条记录查询
     * @param queSingerTotalVO
     * @return
     */
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ApiOperation(value="查询单条歌手总数信息", notes="歌手总数信息接口，只传artistid即可" ,httpMethod="POST")
    public JsonRslt select(@RequestBody QueSingerTotalVO queSingerTotalVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerTotalService.select(queSingerTotalVO.getPrefix(), sessionInfo);
    }

    /**
     * 歌手总数信息插入
     * @param queSingerTotalVO
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value="歌手总数信息插入", notes="歌手总数信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt insert(@RequestBody QueSingerTotalVO queSingerTotalVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerTotalService.insert(queSingerTotalVO,sessionInfo);
    }

    /**
     * 歌手总数信息修改
     * @param queSingerTotalVO
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ApiOperation(value="歌手总数信息修改", notes="歌手总数信息接口，除了后台生成和readonly之外有什么传什么" ,httpMethod="POST")
    public JsonRslt edit(@RequestBody QueSingerTotalVO queSingerTotalVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerTotalService.edit(queSingerTotalVO,sessionInfo);
    }

    /**
     * 歌手总数信息删除
     * @param queSingerTotalVO
     * @return
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="歌手总数信息删除", notes="歌手总数信息接口，只传artistid即可" ,httpMethod="POST")
    public JsonRslt del(@RequestBody QueSingerTotalVO queSingerTotalVO, @RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerTotalService.del(queSingerTotalVO.getPrefix(),sessionInfo);
    }

    /**
     * 查询所有歌手总数信息
     * @return
     */
    @RequestMapping(value = "/searchAllList", method = RequestMethod.POST)
    @ApiOperation(value="查询所有歌手总数信息", notes="歌手总数信息接口" ,httpMethod="POST")
    public JsonRslt searchAllList(@RequestHeader("token") String token) {
        SessionInfo sessionInfo = tokenCache.getSessionInfo(token);
        return queSingerTotalService.searchAllList();
    }

}