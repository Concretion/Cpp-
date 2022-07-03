package com.omlucy.chapter04.aspect.aspect;

import com.omlucy.chapter04.invoke.Invocation;
import org.aspectj.lang.annotation.*;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lucy
 * @date 2021/11/8
 */
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.omlucy.chapter04.aspect.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {
    }

    /**
     * 事前方法
     *
     * @return
     */
    @Before("pointCut()")
    public boolean before() {
        System.out.println("before......");
        return true;
    }

    /**
     * 事后方法
     */
    @After("pointCut()")
    public void after() {
        System.out.println("after......");
    }

    /**
     * 取代原有事件方法
     *
     * @param invocation 回调参数，可以通过它的 proceed 方法，回调原有事件
     * @return 原有事件返回对象
     */
//    @Around("pointCut()")
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before......");
        Object obj = null;

        obj = invocation.proceed();

        System.out.println("around after......");

        return obj;
    }

    /**
     * 是否返回方法。事件没有发生异常执行
     */
    @AfterReturning("pointCut()")

    public void afterReturning() {
        System.out.println("afterReturning......");
    }

    /**
     * 事后异常方法，当事件发生异常后执行
     */
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
}
