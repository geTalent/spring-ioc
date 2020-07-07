package com.luban.test;

import com.luban.service.IndexServiceImpl;
import com.luban.service.indexService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexServiceImpl indexServiceImpl = (IndexServiceImpl)beanFactory.getBean("service");
        indexServiceImpl.index();

        indexService indexService = (indexService)beanFactory.getBean("welcome");
        indexService.index();

    }
}
