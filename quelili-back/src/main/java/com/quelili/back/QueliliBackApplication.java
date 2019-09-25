package com.quelili.back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@MapperScan("com.quelili.back.dao")
@EnableScheduling
@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement
public class QueliliBackApplication extends SpringBootServletInitializer {

    /**
     * 服务器时区设置
     * 解决服务端时差问题
     */
    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(QueliliBackApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(QueliliBackApplication.class, args);
    }

}
