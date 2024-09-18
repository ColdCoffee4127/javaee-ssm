package com.coffee;

import com.coffee.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service = (StudentService) context.getBean("studentService");
        service.saveStu() ;
    }
}