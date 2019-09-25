package com.quelili.back.util;

/**
 * 作 者：sekift
 * 
 * 日 期：2018年3月11日
 * 
 * 描 述：[A] 用户后台向前台返回的JSON对象
 * 
 *
 **/
public class JsonRslt implements java.io.Serializable {
	private boolean success = false;

	private String code = "";

	private String msg = "";

	private Object obj = null;

	public static JsonRslt putSuccess(Object obj) {
		JsonRslt rslt = new JsonRslt();
		rslt.setSuccess(true);
		rslt.setObj(obj);
		return rslt;
	}

	public static JsonRslt putError(Object obj) {
		JsonRslt rslt = new JsonRslt();
		if (obj != null && obj instanceof String) {
			rslt.setMsg((String)obj);
		} else {
			rslt.setObj(obj);
		}
		return rslt;
	}

	public static JsonRslt putErrorCode(String code, String msg) {
		JsonRslt rslt = new JsonRslt();
		rslt.code = code;
		if (msg != null) {
			rslt.msg = msg;
		}
		return rslt;
	}

	public static JsonRslt putErrorCode(String code) {
		return putErrorCode(code, null);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public JsonRslt setObj(Object obj) {
		this.obj = obj;
		return this;
	}
}
