package com.quelili.back.util;

import java.util.Random;

/**
 * 邀请码生成和校验工具类
 * @author:sekift
 * @time:2018-9-4 上午11:06:22
 * @version:
 */
public final class InviteCodeUtil {

	private InviteCodeUtil(){
		
	}
	
	/**
	 * 使用数字，24个大写英文字母(去掉容易混淆I和O)
	 */
	private static final char[] DIGITS = "0123456789ABCDEFGHJKLMNPQRSTUVWXYZ"
			.toCharArray();

	private static final int DIGITS_LENGTH = DIGITS.length;

	/**
	 * 生成16位的邀请码。
	 * 其中前15位为随机码，最后一位为校验码。
	 * 校验规则是前15位char值的总和为total，对DIGITS_LENGTH取模，得到余数去定位DIGITS的字符。
	 * 作用是查询数据库前先对邀请码做简单的校验，遇到非法的校验码就直接返回错误，不需要查询数据库。
	 * DIGITS_LENGTH=34，15位随机码，一共可产生34^15=93795878551873643905024个码。
	 * 如果随机算法是有效的话，那么就算生成1亿个邀请码，那么碰撞的几率理论上是937958785518736分之一，应该足够安全了。
	 */
	private static final int CODE_LENGTH = 16;
	
	private static final Random RANDOM = new Random();

	public static String genId() {
		int checkIdx = CODE_LENGTH - 1;
		char[] arr = new char[CODE_LENGTH];
		int total = 0;
		for (int i = 0; i < checkIdx; i++) {
			char d = DIGITS[RANDOM.nextInt(DIGITS_LENGTH)];
			total += d;
			arr[i] = d;
		}
		arr[checkIdx] = DIGITS[total % DIGITS_LENGTH];
		return String.valueOf(arr);
	}

	public static boolean check(String id) {
		if (null == id || id.length() != CODE_LENGTH) {
			return false;
		}
		int total = 0;
		char[] arr = id.toCharArray();
		int checkIdx = CODE_LENGTH - 1;
		for (int i = 0; i < checkIdx; i++) {
			char d = arr[i];
			total += d;
		}
		return arr[checkIdx] == DIGITS[total % DIGITS_LENGTH];
	}

}
