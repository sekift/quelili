package com.quelili.back.util;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;

/**
 * ip工具类
 */
public class IpUtil {
    /**
     * 获取ip地址
     * @param request
     * @return 获取成功，返回ip；获取失败，返回null
     * @throws Exception 获取失败
     */
    public static String getIpAddr(HttpServletRequest request) throws Exception{
        String ipAddress = request.getHeader("x-forwarded-for");
        if (StringUtil.isEmpty(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtil.isEmpty(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtil.isEmpty(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if (ipAddress.equals("127.0.0.1")) {
                // 根据网卡取本机配置的IP
                InetAddress inet = InetAddress.getLocalHost();
                ipAddress = inet.getHostAddress();
            }
        }
        // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length() == 15
            if (ipAddress.indexOf(",") > 0) {
                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
            }
        }

        return ipAddress;
    }
}

