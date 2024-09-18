package com.coffee.dao.impl;

import com.coffee.dao.StuDao;
import org.springframework.stereotype.Repository;

@Repository("s2")
public class StuDaoImpl2 implements StuDao {
    @Override
    public void saveStu() {
        System.out.println("二号保存成功");
    }
}
