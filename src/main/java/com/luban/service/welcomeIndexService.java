package com.luban.service;

import org.springframework.stereotype.Service;

@Service("welcome")
public class welcomeIndexService implements indexService {
    public void index() {
        System.out.println("welcomeIndexService");
    }
}
