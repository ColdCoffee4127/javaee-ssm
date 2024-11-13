package com.coffee.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
    @Around("pt()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before------");
        Object o = joinPoint.proceed();
        System.out.println("after------");
    }
    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }
    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
}
