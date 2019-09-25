package com.quelili.back.service;

import com.quelili.back.Conf.CommonTestConf;
import com.quelili.back.cache.impl.LangIdCache;
import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.cache.impl.BaseCache;
import com.quelili.back.cache.impl.UserCache;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.dao.SysUserMapper;
import com.quelili.back.service.impl.SysUserServiceImpl;
import com.quelili.back.util.*;
import com.quelili.back.vo.SessionInfo;
import com.quelili.back.vo.SessionInfoTest;
import com.quelili.back.vo.SysUserVO;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@Import({SysUserServiceImpl.class, SessionInfoTest.class, LocaleMessage.class, SnowflakeIdWorker.class,
		TokenCache.class, BaseCache.class, UserCache.class, LangIdCache.class})
public class SysUserServiceTest {
	/**日志工具*/
	private static Logger logger = LoggerFactory.getLogger(SysUserServiceTest.class);

	//static，测试配置，service中用注解得到的field都需要在这里用@Bean指定返回
	@TestConfiguration
	static class TestConf{
		@Bean
		public SysUserMapper sysUserMapper() {
			return MyBatisUtil.getMapper(SysUserMapper.class,"mapper/SysUserMapper.xml");
		}
	}

	@TestConfiguration
	static class SysContactUsServiceTestConf extends CommonTestConf {}

	@Autowired
	private SessionInfo sessionInfo;

	@Autowired
	private SysUserService sysUserService;

	@After
	public void tearDown() throws Exception {
		//每个测试后都回滚
		MyBatisUtil.rollback();
	}

	private static Long userId;

	@Test
	public void test01_insert() {
		SysUserVO sysUserVO = new SysUserVO();

		JsonRslt jsonRslt = sysUserService.insert(sysUserVO);
		assertTrue(jsonRslt.isSuccess());
		logger.info("增加结果：{}", JsonUtil.toJson(jsonRslt));
		userId = ((SysUserVO) jsonRslt.getObj()).getUserid();
	}

	@Test
	public void test02_search() {
	}

	@Test
	public void test03_select() {
		userId = 625732906907729920L ;
		JsonRslt jsonRslt = sysUserService.select(userId, sessionInfo);
		assertTrue(jsonRslt.isSuccess());
		logger.info("单条结果：{}", JsonUtil.toJson(jsonRslt));	}

	@Test
	public void test04_edit() {
		JsonRslt jsonRslt = sysUserService.select(userId, sessionInfo);
		assertTrue(jsonRslt.isSuccess());

		SysUserVO sysUserVO = new SysUserVO();
		try {
			CommUtils.copyProperties(sysUserVO, ((SysUserVO) jsonRslt.getObj()));
		} catch (Exception e) {
			fail();
		}
		String note = "新备注";
		sysUserVO.setNote(note);
		JsonRslt newJsonRslt = sysUserService.edit(sysUserVO, sessionInfo);
		assertTrue(newJsonRslt.isSuccess());

		assertEquals(note, ((SysUserVO) newJsonRslt.getObj()).getNote());
		logger.info("\r\n修改前：{}\r\n修改后：{}", JsonUtil.toJson(jsonRslt), JsonUtil.toJson(newJsonRslt));
	}

	@Test
	public void test05_del() {
		userId = 2L ;
		JsonRslt jsonRslt = sysUserService.del(userId, sessionInfo);
		assertTrue(jsonRslt.isSuccess());
		logger.info("删除结果：{}", JsonUtil.toJson(jsonRslt));
	}
}