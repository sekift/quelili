package com.quelili.back.config;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author sekift
 * @date 2018-09-01 11:11:22
 * 拦截器，extends WebMvcConfigurationSupport或implements WebMvcConfigurer，但有些小不同
 */
@Configuration
public class MyWebMvcConfig extends WebMvcConfigurationSupport {

    //具体说明：https://blog.csdn.net/weixin_37162010/article/details/81484230
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        // 日期类型的转换 https://juejin.im/post/5be976ff51882516b9377915
        //objectMapper.enable(SerializationFeature.WRITE_NULL_MAP_VALUES);
        objectMapper.enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(format);

        //指定Long序列化为String
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        //指定long序列化为String
//        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        objectMapper.registerModule(simpleModule);

        //在返回的json中，不返回值为null的字段
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        //如果前端传入的vo有多余的属性，直接忽略
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        jackson2HttpMessageConverter.setObjectMapper(objectMapper);
        converters.add(jackson2HttpMessageConverter);
    }

    //重新映射swagger-ui.html，否则swagger无法访问
    //具体说明：https://blog.csdn.net/xtj332/article/details/80595768
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }

    /**
     * @author sekift
     *
     * 单个方法或controller跨域配置：
     *   @CrossOrigin(allowCredentials="true",maxAge = 3600)
     *
     * 全局控制跨域的配置.
     * WebMvcConfigurerAdapter已经过时，故采用这种方法
     * https://blog.csdn.net/weixin_43453386/article/details/83623242,
     * https://blog.51cto.com/12066352/2093750，https://www.cnblogs.com/mmzs/p/9167743.html
     *
     *     @Override
     *     public void addCorsMappings(CorsRegistry registry) {
     *         registry.addMapping("/api/sysemployee/**")
     *                 .allowedHeaders("*")
     *                 .allowCredentials(true)
     *                 .maxAge(3600)
     *                 .allowedMethods("POST","GET")
     *                 .allowedOrigins("*"); // 可写具体域名(例如"http://domain2.com")
     *     }
     *
     *  上面的方法有个问题，详见：https://segmentfault.com/a/1190000018018849?utm_source=tag-newest
     *  估使用下面的跨域方法
     */

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/user/**", corsConfig());
        return new CorsFilter(source);
    }

    private CorsConfiguration corsConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //请求常用的三种配置，*代表允许所有，当时你也可以自定义属性（比如header只能带什么，只能是post方式等等）
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setMaxAge(3600L);
        return corsConfiguration;
    }
}
