package com.eliteams.quick4j.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spider : 爬虫类, 此类只为说明Spring 一些使用方法
 *
 * @author StarZou
 * @since 2014-10-27 22:40
 */

@Component
public class Spider implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, BeanPostProcessor {

    private String beanName;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    /**
     * 爬虫方法
     *
     * @param URI
     * @return data
     */
    public String capture(String URI) {
        String data = "";
        return data;
    }


    /**
     * 注入 对象name
     *
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("Spider.setBeanName");
    }

    /**
     * 注入 beanFactory
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("Spider.setBeanFactory");
    }

    /**
     * 注入 applicationContext
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("Spider.setApplicationContext");
    }

    /**
     * 初始化操作
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spider.afterPropertiesSet");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Spider.postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Spider.postProcessAfterInitialization");
        return bean;
    }
}
