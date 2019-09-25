package com.quelili.back.Conf;

import com.quelili.back.cache.IBaseCache;
import com.quelili.back.cache.impl.BaseCache;
import com.quelili.back.cache.impl.TokenCache;
import com.quelili.back.common.LocaleMessage;
import com.quelili.back.util.MyBatisUtil;
import com.quelili.back.util.RedisUtil;
import com.quelili.back.util.SnowflakeIdWorker;
import org.apache.ibatis.io.Resources;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.io.File;
import java.io.IOException;


/**
 * 提供service通用的依赖
 */
public class CommonTestConf implements ApplicationContextAware {

    protected ApplicationContext applicationContext;
    private static final String PKG_OF_MAPPER = "com.quelili.back.dao";
    private static final String PKG_OF_SERVICE = "com.quelili.back.service";

    //注入localMessage引用的MessageSource
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setDefaultEncoding("UTF-8");
        resourceBundleMessageSource.setBasenames("messages");
        return resourceBundleMessageSource;
    }

    @Bean
    public LocaleMessage localeMessage(){
        return new LocaleMessage();
    }

    @Bean
    public SnowflakeIdWorker snowflakeIdWorker(){
        return new SnowflakeIdWorker();
    }

    @Bean
    public TokenCache tokenCache(){
        return new TokenCache();
    }

    @Bean
    public IBaseCache baseCache(){
        RedisUtil.init();
        return new BaseCache();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

        try {
            initMapperClasses();
        } catch (Exception e) {
            System.err.println("尝试实例化mapper失败！" + e.getMessage());
            e.getStackTrace();
        }
        System.out.println("所有mapper实例化成功！");

//        try {
//            initAllServices();
//        } catch (Exception e) {
//            System.err.println("尝试实例化service失败！" + e.getMessage());
//        }
//        System.out.println("所有service实例化成功！");
    }

    /**
     * 初始化所有mapper
     * @throws IOException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    private void initMapperClasses() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        String dirPath = Resources.getResourceURL("com/quelili/back/dao").getPath();
        if(dirPath.contains("/test-classes/")){
            dirPath = dirPath.replace("/test-classes/", "/classes/");
        }
        File dir = new File(dirPath);

        if(dir.isDirectory()){
            String[] mapperNameArr = dir.list();
            for(String mapperName : mapperNameArr){
                int dotIdx = mapperName.indexOf('.');
                dynamicInjectBean(PKG_OF_MAPPER, mapperName.substring(0, dotIdx));
            }
        }
    }

    /**
     * 初始化所有service
     * TODO 还有问题（实例化出来的service，里面的依赖都是null），暂时不用
     * @throws IOException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    private void initAllServices() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        String dirPath = Resources.getResourceURL("com/quelili/back/service").getPath();
            if(dirPath.contains("/test-classes/")){
            dirPath = dirPath.replace("/test-classes/", "/classes/");
        }
        File dir = new File(dirPath);
        if(dir.isDirectory()){
            String[] mapperNameArr = dir.list();
            for(String mapperName : mapperNameArr){
                if(mapperName.equals("impl")){
                    continue;
                }
                int dotIdx = mapperName.indexOf('.');
                dynamicInjectBean(PKG_OF_SERVICE, mapperName.substring(0, dotIdx));
            }
        }
    }

    /**
     * 动态加载bean
     * @param pkg
     * @param clsName
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private void dynamicInjectBean(String pkg, String clsName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getParentBeanFactory();
        if(beanFactory == null){
            beanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
        }

//        System.out.println("实例化" + clsName + "开始");

        //实例化mapper
        if(PKG_OF_MAPPER.equals(pkg)) {
            BeanDefinition beanDefinition = new GenericBeanDefinition();
            Object obj = getMapperInstance(pkg, clsName);
            beanDefinition.setBeanClassName(obj.getClass().getName());
            beanFactory.registerBeanDefinition(obj.getClass().getName(), beanDefinition);

            applicationContext.getAutowireCapableBeanFactory().applyBeanPostProcessorsAfterInitialization(obj, obj.getClass().getName());
            beanFactory.registerSingleton(obj.getClass().getName(), obj);
        } else if(PKG_OF_SERVICE.equals(pkg)){
            BeanDefinition beanDefinition = new GenericBeanDefinition();
            Object obj = getServiceImpl(pkg, clsName);
            if(obj == null){
                return;
            }
            String clsNameForBeanFactory = getClassName(pkg, clsName);
//            clsNameForBeanFactory = clsName;
            String beanName = clsName.substring(0, 1).toLowerCase() + clsName.substring(1);

            beanDefinition.setBeanClassName(clsNameForBeanFactory);
            beanFactory.registerBeanDefinition(beanName, beanDefinition);

            applicationContext.getAutowireCapableBeanFactory().applyBeanPostProcessorsAfterInitialization(obj, beanName);
            beanFactory.registerSingleton(beanName, obj);
        }
//        System.out.println("实例化" + clsName + "结束");
    }

    private String getClassName(String pkg, String clsName){
        return pkg + "." + clsName;
    }

    private Object getMapperInstance(String pkg, String mapperClsName) throws ClassNotFoundException {
        Class mapperClass = Class.forName(getClassName(pkg, mapperClsName));
        return MyBatisUtil.getMapper(mapperClass, "mapper/*.xml");
    }


    private Object getServiceImpl(String pkg, String serviceClsName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println("实例化" + serviceClsName + "开始");
        String serviceImplPkg = pkg + ".impl";
        String serviceImplClsName = serviceClsName + "Impl";
        String clsNameWithPkg = getClassName(serviceImplPkg + "", serviceImplClsName);
        try {
            Class serviceImpl = Class.forName(clsNameWithPkg);
            System.out.println("实例化" + serviceImplClsName + "结束");
            return serviceImpl.newInstance();
        } catch (Exception e){}

        System.err.println("实例化" + serviceImplClsName + "失败");
        return null;
    }
}
