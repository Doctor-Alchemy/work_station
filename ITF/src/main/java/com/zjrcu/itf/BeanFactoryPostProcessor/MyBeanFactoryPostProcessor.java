package com.zjrcu.itf.BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println("use self_define BeanFactoryPostProcessor");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
        System.out.println("change userName");
        beanDefinition.getPropertyValues().add("userName","Tom");

    }
}
