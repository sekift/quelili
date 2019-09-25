package com.quelili.back.common;

import com.quelili.back.util.JsonRslt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ExceptionHandle implements HandlerExceptionResolver {
	/**日志工具*/
	private static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	private final JsonRslt jsonRslt = JsonRslt.putErrorCode("MUST_LOGIN");

	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		if (e instanceof InvalidTokenException) {
			ModelAndView view = new ModelAndView(new MappingJackson2JsonView());
			view.addObject("success", jsonRslt.isSuccess());
			view.addObject("code", jsonRslt.getCode());
			view.addObject("msg", e.getMessage());
//			view.addObject("obj", jsonRslt.getObj());
			return view;
		}

		return null;
	}
}