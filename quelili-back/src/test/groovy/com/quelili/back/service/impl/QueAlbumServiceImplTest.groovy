package com.quelili.back.service.impl

import com.quelili.back.common.LocaleMessage
import com.quelili.back.dao.QueAlbumMapper
import com.quelili.back.model.QueAlbum
import com.quelili.back.util.JsonRslt
import com.quelili.back.vo.QueAlbumVO
import com.quelili.back.vo.SessionInfo
import spock.lang.*
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import static org.mockito.Mockito.*

class QueAlbumServiceImplTest extends Specification {
    @Mock
    LocaleMessage localeMessage
    @Mock
    QueAlbumMapper queAlbumMapper
    @InjectMocks
    QueAlbumServiceImpl queAlbumServiceImpl

    SessionInfo info = new SessionInfo();

    def setup() {
        MockitoAnnotations.initMocks(this)
        info.setLangid(0);
    }

    def "test insert"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(queAlbumMapper.insertSelective(any())).thenReturn(0)
        when(queAlbumMapper.selectByPrimaryKey(anyInt())).thenReturn(new QueAlbum(albumid: 0))

        when:
        JsonRslt result = queAlbumServiceImpl.insert(new QueAlbumVO(), info)

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test search"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(queAlbumMapper.search(any())).thenReturn([new QueAlbum()])

        when:
        JsonRslt result = queAlbumServiceImpl.search(new QueAlbumVO(), new SessionInfo())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test select"() {
        given:
        when(queAlbumMapper.selectByPrimaryKey(anyInt())).thenReturn(new QueAlbum())

        when:
        JsonRslt result = queAlbumServiceImpl.select(100, new SessionInfo())
        println(((QueAlbum)result.getObj()).getAlbumid())

        then:
        result == new JsonRslt(success: true)
    }

    def "test edit"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(queAlbumMapper.selectByPrimaryKey(anyInt())).thenReturn(new QueAlbum(albumid: 0))
        when(queAlbumMapper.updateByPrimaryKeySelective(any())).thenReturn(0)

        when:
        JsonRslt result = queAlbumServiceImpl.edit(new QueAlbumVO(), new SessionInfo())

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }

    def "test del"() {
        given:
        when(localeMessage.getMessage(anyString(), anyInt())).thenReturn("getMessageResponse")
        when(queAlbumMapper.deleteByPrimaryKey(anyInt())).thenReturn(0)

        when:
        JsonRslt result = queAlbumServiceImpl.del(0, info)

        then:
        result == new JsonRslt(success: true, msg: "msg")
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme