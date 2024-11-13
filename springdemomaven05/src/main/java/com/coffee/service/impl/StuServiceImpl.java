package com.coffee.service.impl;

import com.coffee.dao.StuDao;
import com.coffee.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("service1")
public class StuServiceImpl implements StuService {
    @Autowired
    @Qualifier("s1")
    StuDao stuDao;
    @Override
    public void save() {
        stuDao.saveStu();
    }

    @PostConstruct
    public void init1() {
        System.out.println("正在创建");
    }
    @PostConstruct
    public void destroy() {
        System.out.println("正在销毁");
    }
}
