package com.quelili.back.service.impl

import com.quelili.back.cache.IBaseCache
import com.quelili.back.cache.ILangIdCache
import com.quelili.back.cache.ITokenCache
import com.quelili.back.cache.IUserCache
import com.quelili.back.common.LocaleMessage
import com.quelili.back.dao.SysUserMapper
import com.quelili.back.model.SysUser
import com.quelili.back.util.JsonRslt
import com.quelili.back.util.SnowflakeIdWorker
import com.quelili.back.vo.SessionInfo
import com.quelili.back.vo.SysUserVO
import spock.lang.*
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import static org.mockito.Mockito.*

class SysUserServiceImplTest extends Specification {
    @Mock
    LocaleMessage localeMessage
    @Mock
    SysUserMapper sysUserMapper
    @Mock
    ITokenCache tokenCache
    @Mock
    IUserCache userCache
    @Mock
    ILangIdCache langIdCache
    @Mock
    SnowflakeIdWorker snowflakeIdWorker
    @Mock
    IBaseCache baseCache
    @InjectMocks
    SysUserServiceImpl sysUserServiceImpl

    def setup() {
        MockitoAnnotations.initMocks(this)
    }

    def "test login"() {
        given:
        when(sysUserMapper.selectByExample(any())).thenReturn([new SysUser(userid: 1l, entid: 1l, parententid: 1l)])

        when:
        JsonRslt result = sysUserServiceImpl.login("admin", "123456", 0)

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test get User"() {
        given:
        when(sysUserMapper.selectByPrimaryKey(anyLong())).thenReturn(new SysUser())

        when:
        SysUser result = sysUserServiceImpl.getUser(584326021491326976L)

        then:
        result == new SysUser()
    }

    def "test search"() {
        given:
        when(sysUserMapper.search(any())).thenReturn([new SysUser(userid: 1l, entid: 1l, page: 0, rows: 0)])

        when:
        JsonRslt result = sysUserServiceImpl.search(new SysUserVO(), new SessionInfo())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test insert"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(sysUserMapper.insertSelective(any())).thenReturn(0)
        when(sysUserMapper.selectByExample(any())).thenReturn([new SysUser(userid: 1l, unbl: (short) 0, createtime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime(), updatetime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime())])
        when(sysUserMapper.selectByPrimaryKey(anyLong())).thenReturn(new SysUser(userid: 1l, unbl: (short) 0, createtime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime(), updatetime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime()))
        when(snowflakeIdWorker.nextId()).thenReturn(0l)

        when:
        JsonRslt result = sysUserServiceImpl.insert(new SysUserVO())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test select"() {
        given:
        when(sysUserMapper.selectByPrimaryKey(anyLong())).thenReturn(new SysUser())

        when:
        JsonRslt result = sysUserServiceImpl.select(1l, new SessionInfo())

        then:
        result == new JsonRslt(success: true)
    }

    def "test edit"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(sysUserMapper.selectByExample(any())).thenReturn([new SysUser(userid: 1l, updatetime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime())])
        when(sysUserMapper.selectByPrimaryKey(anyLong())).thenReturn(new SysUser(userid: 1l, updatetime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime()))
        when(sysUserMapper.updateByPrimaryKeySelective(any())).thenReturn(0)
        when(baseCache.delete(anyString())).thenReturn(1l)

        when:
        JsonRslt result = sysUserServiceImpl.edit(new SysUserVO(), new SessionInfo())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test del"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(sysUserMapper.deleteByPrimaryKey(anyLong())).thenReturn(0)
        when(baseCache.delete(anyString())).thenReturn(1l)

        when:
        JsonRslt result = sysUserServiceImpl.del(1l, new SessionInfo())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test get User Id"() {
        given:
        when(tokenCache.getSessionInfo(anyString())).thenReturn(new SessionInfo())

        when:
        Long result = sysUserServiceImpl.getUserId("token")

        then:
        result == 1l
    }

    def "test unbl"() {
        given:
        when(sysUserMapper.updateByPrimaryKeySelective(any())).thenReturn(0)

        when:
        JsonRslt result = sysUserServiceImpl.unbl(new SysUserVO())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test edit Pass"() {
        given:
        when(sysUserMapper.selectByPrimaryKey(anyLong())).thenReturn(new SysUser(updatetime: new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 18).getTime()))
        when(sysUserMapper.updateByPrimaryKeySelective(any())).thenReturn(0)

        when:
        JsonRslt result = sysUserServiceImpl.editPass(new SysUserVO(), new SessionInfo())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme