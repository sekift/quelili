package com.quelili.back.common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class LocaleMessage {
	//langid （0 中文 1繁体 2英文）
	private static final Locale[] locales = new Locale[]{new Locale("zh", "CN"), new Locale("zh", "HK"), new Locale("en", "US")};

	@Autowired
	private MessageSource messageSource;

	private String getMessage(String code, Locale locale) {
		return messageSource.getMessage(code, null, null, locale);
	}

	private Locale getLocale(int langId) {
		switch (langId) {
			case 1:
			case 2:
				return locales[langId];
			default:
				return locales[0];
		}
	}

	public String getMessage(String code, int langId) {
		return getMessage(code, getLocale(langId));
	}
}