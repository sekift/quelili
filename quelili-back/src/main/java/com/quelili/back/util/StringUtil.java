package com.quelili.back.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  字符串工具类
 */
@SuppressWarnings("all")
public final class StringUtil {
	/**
	 * 将一个整数转换为一个IPv4地址
	 * */
	public static String decode4IPv4(int ipv4) {
		StringBuilder sb = new StringBuilder(15);
		for (int i = 3; i >= 0; i--) {
			sb.append((ipv4 >> (8 * i)) & 0xff);
			if (i > 0) {
				sb.append(".");
			}
		}
		return sb.toString();
	}

	/**
	 * 将一个IPv4的地址转换为1一个整数
	 * */
	public static int encodeIPv4(String ipv4) {
		String[] pieces = ipv4.split("\\.");
		int ipi = 0;
		int i = 3;
		for (String piece : pieces) {
			ipi |= Integer.parseInt(piece) << (8 * (i--));
		}
		return ipi;
	}

	/**
	 * 判断字符串是否IPV4地址
	 * @param ipAddress
	 * @return
	 */
	public static boolean isboolIP(String ipAddress) {
		String ip = "(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";
		Pattern pattern = Pattern.compile(ip);
		Matcher matcher = pattern.matcher(ipAddress);
		return matcher.matches();
	}

	/**
	 * 判断是否是纯数字([0,9])字符串
	 * 
	 * @param str
	 *            - 待判断字符串
	 * @return - true, 数字字符串
	 */
	public static boolean isDigitStr(String str) {
		if (str == null || "".equals(str)) {
			return false;
		}
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断值和对象是否为空
	 * 
	 * @param obj
	 * @return
	 */

	public static boolean isEmpty(Collection obj) {

		if (obj == null) {
			return true;
		}

		return obj.isEmpty();
	}

	public static boolean isEmpty(List obj) {

		if (obj == null) {
			return true;
		}

		return obj.isEmpty();
	}

	public static boolean isEmpty(Map m) {

		if (null == m) {
			return true;
		}
		return m.isEmpty();
	}

	public static boolean isEmpty(Object o) {

		if (null == o) {
			return true;
		}
		if (o.getClass().isArray()) {
			return Array.getLength(o) == 0;
		}
		return false;
	}

	/**
	 * 判断字符串是否为空，null 或者 "" 或者 " "（只有空格）都算是空
	 * 
	 * @param s
	 *            - 字符串
	 * @return - 为空返回true,否则返回false
	 */
	public static boolean isEmpty(String s) {

		if (null == s || "".equals(s.trim())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断字符串是否为空，null 或者 "" 或者 " "（只有空格）都算是空
	 * 
	 * @param s
	 *            - 字符串
	 * @return - 为空返回true,否则返回false
	 */
	public static boolean isNotEmpty(String s) {

		return !isEmpty(s);
	}

	/**
	 * 编码转换,将源字符串转换成unicode字符串,和native2ascii 功能相同
	 * 
	 * @param source
	 *            - 源字符串,可以是任意字符,包括汉字
	 * @return unicode - 转换之后的unicode字符串
	 */
	public static String native2ascii(String source) {

		if (null == source) {
			return null;
		}
		StringBuilder unicode = new StringBuilder(source.length() * 5);
		for (char ch : source.toCharArray()) {
			unicode.append("\\u").append(Integer.toHexString(ch));

		}
		return unicode.toString();
	}

	/**
	 * 将属于字符串类型的对象转成Integer对象
	 * 
	 * @param o
	 *            - 字符串类型的对象
	 * @return - Integer对象
	 */
	public static Integer strToInteger(Object o) {

		if (null == o) {
			return null;
		}
		if (o instanceof Integer) {
			return (Integer) o;
		}
		return toInteger(o.toString());
	}

	/**
	 * 将属于字符串类型的对象转成Long对象
	 * 
	 * @param o
	 *            - 字符串类型的对象
	 * @return - Long对象
	 */
	public static Long strToLong(Object o) {

		if (null == o) {
			return null;
		}
		if (o instanceof Long) {
			return (Long) o;
		}
		if (o instanceof Integer) {
			Integer i = (Integer) o;
			return Long.valueOf(i.longValue());
		}
		return toLong(o.toString());
	}

	/**
	 * 半角转全角
	 * <p>
	 * 半角：Single Byte Character case,全角：Double Byte Character case
	 * <p>
	 * 全角空格为12288，半角空格为32
	 * <p>
	 * 其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	 * 
	 * @param input
	 *            - 半角字符串
	 * @return - 全角字符串
	 */
	public static String toDoubleCase(String input) {

		if (null != input) {
			char[] chars = input.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == 32) {
					chars[i] = (char) 12288;
				} else if (c >= 33 && c <= 126) {
					chars[i] = (char) ((int) c + 65248);
				}
			}
			return new String(chars);
		}
		return null;
	}

	/**
	 * 将字符串转成Integer对象
	 * 
	 * @param o
	 *            - 字符串
	 * @return - Integer对象
	 */
	public static Integer toInteger(String o) {

		if (null == o) {
			return null;
		}
		Integer t = Integer.valueOf(o);
		return t;
	}

	/**
	 * 将字符串转成Long对象
	 * 
	 * @param o
	 *            - 字符串
	 * @return - Long对象
	 */
	public static Long toLong(String o) {

		if (null == o || "".equals(o.trim())) {
			return null;
		}
		Long t = Long.valueOf(o);
		return t;
	}

	/**
	 * 全角转半角
	 * <p>
	 * 全角空格为12288，半角空格为32
	 * <p>
	 * 其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	 * 
	 * @param input
	 *            - 全角字符串
	 * @return - 半角字符串
	 */
	public static String toSingleCase(String input) {

		if (null != input) {
			char[] chars = input.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == 12288) {
					chars[i] = (char) 32;
				} else if (c >= 65281 && c <= 65374) {
					chars[i] = (char) ((int) c - 65248);
				}
			}
			return new String(chars);
		}
		return null;
	}

	/**
	 * 将其他类型转成字符串
	 * 
	 * @param obj
	 *            - 其他类型对象
	 * @return - 字符串
	 */
	public static String toString(Object obj) {

		if (null != obj) {
			return obj.toString();
		}
		return null;
	}

	/**
	 * 防止非法实例化
	 */
	private StringUtil() {
	}
	
	/**
	 * 生成32位编码
	 * 
	 * @return string
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

	
}
