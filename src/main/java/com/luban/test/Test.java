package com.luban.test;

import com.luban.service.IndexServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexServiceImpl indexService = (IndexServiceImpl)beanFactory.getBean("service");
        indexService.index();
    }
}
