package com.coffee.dao.impl;

import com.coffee.dao.StuDao;
import org.springframework.stereotype.Repository;

@Repository("s1")
public class StuDaoImpl implements StuDao {
    @Override
    public void insert() {
        System.out.println("insert");
    }
}
