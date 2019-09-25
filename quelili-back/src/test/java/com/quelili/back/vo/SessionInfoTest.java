package com.quelili.back.vo;

import com.quelili.back.common.Consts;
import org.springframework.stereotype.Component;


@Component
public class SessionInfoTest extends SessionInfo {
	public SessionInfoTest() {
		this.setUserid(1L);
		this.setUsercode("superadmin");
		this.setUsername("超级管理员");
		this.setEntid(0L);
		this.setLangid(Consts.LANG_ID_ZH_HK);
	}
}