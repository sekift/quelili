package com.quelili.back.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author sekift
 * @create 2018-04-24 17:00
 * @desc
 **/
@Configuration
@ConditionalOnClass(SnowflakeIdWorker.class)
public class SnowflakeIdWorkerAutoConfigure {
    /**
     * 工作机器ID(0~31)
     */

    @Value("${snowflakeIdWorker.workerId}")
    private long workerId;

    @Value("${snowflakeIdWorker.datacenterId}")
    /** 数据中心ID(0~31) */
    private long datacenterId;

    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    SnowflakeIdWorker snowflakeIdWorker() {
        return new SnowflakeIdWorker(workerId, datacenterId);
    }
}