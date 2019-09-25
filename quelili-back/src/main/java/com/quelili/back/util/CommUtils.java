package com.quelili.back.util;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 作 者：sekift
 * <p>
 * 日 期：2018-9-12
 */
@Component
public class CommUtils {

    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }
	
	/**
     * 描 述：[A] 把两个类间相同属性的值从源类复制到目的类
     *
     * @param dest   目的类
     * @param source 源类
	 * @throws Exception 
     **/
    public static void copyProperties(Object dest, Object source) throws Exception {
        try {
            PropertyUtils.copyProperties(dest, source);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public static String convertArrayToStr(long[] roleids, String splitStr) {
        if (roleids != null && roleids.length == 0) {
            return "";
        }
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < roleids.length - 1; i++) {
            str.append(roleids[i] + ",");
        }
        str.append(roleids[roleids.length - 1]);
        return str.toString();
    }
    
    public static String convertListToStr(List<Long> ids, String splitStr) {
        if (StringUtil.isEmpty(ids)) {
            return "";
        }
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < ids.size() - 1; i++) {
            str.append(ids.get(i) + splitStr);
        }
        str.append(ids.get(ids.size() - 1));
        return str.toString();
    }
    
    public static String getException(Exception e){
        StackTraceElement[] ste = e.getStackTrace();
        StringBuffer sb = new StringBuffer();
        sb.append(e.getMessage() + "\r\n");
        for (int i = 0; i < ste.length; i++) {
          sb.append("\t"+ste[i].toString() + "\r\n");
        }
        return sb.toString();
    }

    public static String convertStrListToStr(List<String> strList, String splitStr) {
        if (StringUtil.isEmpty(strList)) {
            return "";
        }
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < strList.size() - 1; i++) {
            str.append(strList.get(i) + splitStr);
        }
        str.append(strList.get(strList.size() - 1));
        return str.toString();
    }

    /**
     * 隐藏显示邮箱地址<br>
     * 将邮箱显示为：前面3个字母+*******+@+邮箱后缀
     * @param email 原有邮箱
     * @return 隐藏的邮箱
     */
    public static String hiddenEmail(String email) {
        String result = email;
        String[] arr = email != null ? email.split("@", 2) : new String[]{};

        final String hideChar = "*******";
        if(arr.length == 2){// 仅包含@的情况
            result = getLeft3Char(arr[0]);
            result += hideChar;
            result += "@" + arr[1];
        } else if (arr.length == 1) {// 处理不包含@的情况
            result = getLeft3Char(email);
            result += hideChar;
        } else {// null
            result = hideChar;
        }
        return result;
    }

    /**
     * 截取字符串左边的3个字符，不足3个时取全部
     * @param str
     * @return 最大长度为3的字符
     */
    private static String getLeft3Char(String str) {
        if(str.length() > 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    /**
     * 隐藏显示手机号码<br>
     * 将手机号码显示为：前面3个+*****+后3个
     * @param mobile 原有手机号码
     * @return 隐藏的手机号码
     */
    public static String hiddenMobile(String mobile) {
        String result = mobile;
        int len = mobile != null ? mobile.length() : 0;
        if(len > 3) {
            result = mobile.substring(0, 3);
            result += "*****";
            if(len > 8) {
                result += mobile.substring(8);
            }
        }
        return result;
    }

    /**
     * 隐藏显示用户名
     */
    public static String hiddenUserName(String userName){
        String result = userName;
        int len = userName != null ? userName.length() : 0;
        if(len > 1) {
            result = userName.substring(0, 1);
            if(len > 6) {
                result += "*****";
                result += userName.substring(6);
            }else{
                for(int i=0;i<len-1;i++){
                    result += "*";
                }
            }
        }
        return result;
    }

    /**
     * 检查value是否符合regExp这个正则表达式
     * @param value 要检查的值
     * @param regExp 正则表达式
     * @return 当且仅当value字符串匹配给定的正则表达式时，才返回 true
     */
    public static boolean isMatch(String value, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    /**
     * 检查mobileNo是否符合符合大陆的手机号码
     * @param mobileNo 手机号码
     * @return 当且仅当mobileNo字符串匹配大陆的手机号码时，才返回 true<br>
     * 匹配所用的正则表达式为^1([3,5]\\d|47|8[0,2,3,5-9])\\d{8}$
     * ^1([3,4,5,7,8])\\d{9}$ 2017-12-04	加入号码段：19
     */
    public static boolean isMobileNo(String mobileNo) {
        return isMatch(mobileNo,
                "^1([3,4,5,6,7,8,9])\\d{9}$");
    }

    /**
     * 检查email是否合法邮箱
     * @param email 邮箱
     * @return 当且仅当email字符串匹配正则表达式时，才返回 true<br>
     * 匹配所用的正则表达式为"^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+([\\w-]{2,4})$"
     */
    public static boolean isEmail(String email) {
        return isMatch(email,
                "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+([\\w-]{2,4})$");
    }

    /**
     * 检查password是否合法密码：至少6位，并且只允许如下字符：<br>
     * <ul>
     * <li>0-9</li>
     * <li>a-z</li>
     * <li>A-Z</li>
     * <li>`~!@#$%^&*()_+-=\][|}{'";:/?.>,<</li>
     * </ul>
     * @param password 密码
     * @return 当且仅当密码有效时，才返回 true
     */
    public static boolean isPassword(String password) {
        return password != null && password.length() > 5
                && isMatch(password,
                "^[\\w`~!@#$%^&*()+-=\\\\\\]\\[|\\}{'\";:/?.>,<]+$");
    }
}
