package com.luban.dao.impl;

import com.luban.dao.Dao;
import org.springframework.stereotype.Component;

@Component
public class IndexDaoImpl implements Dao {
    public void index(){
        System.out.println("indexDao");
    }
}
