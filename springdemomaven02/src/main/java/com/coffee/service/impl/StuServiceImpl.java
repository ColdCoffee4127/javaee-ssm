package com.coffee.service.Impl;

import com.coffee.dao.Impl.StuDaoImpl;
import com.coffee.dao.StuDao;
import com.coffee.service.StuService;

public class StuServiceImpl implements StuService {
    private StuDao stuDao;

    public StuServiceImpl(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    @Override
    public void addStu() {
        stuDao.save();
        System.out.println("UserService....addStu");
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}

