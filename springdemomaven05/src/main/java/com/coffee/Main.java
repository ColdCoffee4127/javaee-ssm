package com.coffee;

import com.coffee.service.StuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        //调用service
        ClassPathXmlApplicationContext  applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService  service = (StuService) applicationContext.getBean("service1");
        StuService  service2 = (StuService) applicationContext.getBean("service1");
        service.save();
        System.out.println(service);
        System.out.println(service2);
        applicationContext.close();
    }
}