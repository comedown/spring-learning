package com.young.springframework.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面类
 */
@Aspect
public class MyAspect {

    /**
     * 切点：
     *
     */
    @Pointcut("execution(* com.young.springframework.aop.*Service.*(..))")
    public void inServiceLayer() {
    }

    @Before("inServiceLayer()")
    public void beforeService(JoinPoint joinPoint) {
        System.out.println("before aop service.");
        Object obj = joinPoint.getThis();
        System.out.println(obj instanceof MyService);
    }

}
