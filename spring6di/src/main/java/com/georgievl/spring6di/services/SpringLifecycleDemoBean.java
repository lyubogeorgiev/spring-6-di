package com.georgievl.spring6di.services;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.w3c.dom.ls.LSOutput;

@Component
public class SpringLifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {
    public SpringLifecycleDemoBean() {
        System.out.println("## I'm in SpringLifecycleDemoBean Constructor ##");
    }

    private String javaVer;

    @Value("${java.specification.version}")
    private void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("## 1 properties Set. Java ver: " + this.javaVer);
    }



    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 BeanNameAware my bean name is: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 BeanFactoryAware my bean factory is: " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContext is: " + applicationContext);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 5 The post construct application method has been called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 The afterPropertiesSet application method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The preDestroy application method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 DisposableBean.destroy The destroy method has been called");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" postProcessBeforeInitialization bean: " + bean);

        if (bean instanceof SpringLifecycleDemoBean) {
            SpringLifecycleDemoBean demoBean = (SpringLifecycleDemoBean) bean;
            System.out.println("Calling Before Init");
            demoBean.beforeInit();
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    public void beforeInit() {
        System.out.println("Before Init - called by Bean Post Processor");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## The postProcessAfterInitialization bean: " + bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }






}
