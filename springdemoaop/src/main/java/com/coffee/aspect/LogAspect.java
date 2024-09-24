package com.coffee.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(void com.coffee.dao.StuDao.*(..))")
    public void pt() {

    }
    @Before("pt()")
    public void before() {
        System.out.println("before");
    }
    @After("pt()")
    public void after() {
        System.out.println("after");
    }
}
