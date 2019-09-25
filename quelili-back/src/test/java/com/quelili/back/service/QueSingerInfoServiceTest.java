package com.quelili.back.service;

import com.quelili.back.vo.SessionInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueSingerInfoServiceTest {

    @Autowired
    private QueSingerInfoService queSingerInfoService;

    @MockBean
    private SessionInfo sessionInfo;

    @Before
    public void setup(){
        Mockito.when(sessionInfo.getUserid()).thenReturn(1L);
        Mockito.when(sessionInfo.getUsername()).thenReturn("管理员");
        Mockito.when(sessionInfo.getEntid()).thenReturn(0L);
        Mockito.when(sessionInfo.getLangid()).thenReturn(1);
    }

    @Test
    public void testSelect(){
        System.out.println(queSingerInfoService.select(1, sessionInfo));
    }


}
