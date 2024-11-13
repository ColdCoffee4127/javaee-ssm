package com.coffee.dao.impl;

import com.coffee.dao.StuDao;
import org.springframework.stereotype.Repository;

@Repository("s1")
public class StuDaoImpl implements StuDao {
    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void select() {
        System.out.println("select");
    }

}
