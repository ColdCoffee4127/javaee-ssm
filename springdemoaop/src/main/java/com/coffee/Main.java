package com.coffee;

import com.coffee.dao.StuDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuDao stuDao = (StuDao) context.getBean("stuDao");
        stuDao.insert();
        stuDao.delete();
        stuDao.update();
        stuDao.select();
    }
}