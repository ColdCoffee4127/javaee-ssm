package com.coffee.service.impl;

import com.coffee.dao.StuDao;
import com.coffee.service.StudentService;

public class StudentServiceImpl implements StudentService {
    StuDao stuDao;
    @Override
    public void saveStu() {
        stuDao.save();
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
