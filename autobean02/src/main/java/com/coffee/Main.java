package com.coffee;

import com.coffee.service.impl.StuServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuServiceImpl stuService;
        stuService = (StuServiceImpl) context.getBean("stuService");
        stuService.saveStu();
    }
}