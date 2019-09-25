package com.quelili.back.controller;

import com.alibaba.fastjson.JSONObject;
import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.util.JsonUtil;
import com.quelili.back.util.XmlParseUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ApiSysUserControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private TokenCache tokenCache;

    @Autowired
    private ApiSysUserController controller;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testLoginSuccess() throws Exception {
        Map map = new HashMap();
        map.put("usercode", "admin");
        map.put("userpass", "123456");


        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/api/user/login")
//                .header("langid", 0)
                .contentType(MediaType.APPLICATION_JSON)
                .content(JsonUtil.toJson(map)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/xml;charset=UTF-8"))
                .andReturn();

        String res = result.getResponse().getContentAsString();
        System.err.println(res);

        JSONObject jsonObject = XmlParseUtil.xml2JSON(res.getBytes("UTF-8"));

        JSONObject root = jsonObject.getJSONObject("JsonRslt");
        assertEquals("[true]", root.getString("success"));
        assertNotNull(root.getJSONArray("obj"));
    }
}