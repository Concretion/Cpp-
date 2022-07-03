package com.omlucy.chapter04.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lucy
 * @date 2021/11/8
 */
@Aspect
@Component
public class MyAspect2 {

    @Pointcut("execution(* com.omlucy.chapter04.aspect.service.impl.UserServiceImpl.manyAspects(..))")
    public void pointCut() {
    }

    /**
     * 事前方法
     *
     * @return
     */
    @Before("pointCut()")
    public boolean before() {
        System.out.println("MyAspect2 before......");
        return true;
    }

    /**
     * 事后方法
     */
    @After("pointCut()")
    public void after() {
        System.out.println("MyAspect2 after......");
    }

    /**
     * 取代原有事件方法
     *
     * @param jp 回调参数，可以通过它的 proceed 方法，回调原有事件
     * @return 原有事件返回对象
     */
//    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("MyAspect2 around before......");
        jp.proceed();
        System.out.println("MyAspect2 around after......");
    }

    /**
     * 是否返回方法。事件没有发生异常执行
     */
    @After("pointCut()")
    public void afterReturning() {
        System.out.println("MyAspect2 afterReturning......");
    }

    /**
     * 事后异常方法，当事件发生异常后执行
     */
    @After("pointCut()")
    public void afterThrowing() {
        System.out.println("MyAspect2 afterThrowing");
    }
}
