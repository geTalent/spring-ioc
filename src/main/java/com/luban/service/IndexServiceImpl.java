package com.luban.service;

import com.luban.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class IndexServiceImpl{

    @Autowired
    Dao dao;

//    public void setDao(Dao dao) {
//        this.dao = dao;
//    }

    public void index(){
        System.out.println("indexService");
        dao.index();
    }
}
