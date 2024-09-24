package com.coffee.service.impl;

import com.coffee.dao.StuDao;
import com.coffee.dao.impl.StuDaoImpl;
import com.coffee.service.StuService;

public class StuServiceImpl implements StuService {
    StuDao stuDao;
    @Override
    public void saveStu() {
        stuDao.saveStu();
    }
    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
