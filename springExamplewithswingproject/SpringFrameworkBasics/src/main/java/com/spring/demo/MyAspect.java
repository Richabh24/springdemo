package com.spring.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by ttnd on 25/6/16.
 */
@Aspect
public class MyAspect {

    //@Before("execution(public void connect())")
    //@Before("execution( * get*())")
   // @Before("execution(* com.spring.demo.Database.*())")
    //@Before("execution( * com.spring.demo.*.*())")
   // @Before("execution(void *())")
   //@Before("execution(* *())")
    //@Before("execution(* *(..))")
   // @Before("within(com.spring.demo.*)")
    //@Before("bean(mysql))")
  //  @Before("args(Integer)")
   // @Before("this(com.spring.demo.Database)")
   // @Before("connectPointcut() || getStringPointcut()")
  /*  void beforeAdvice() {
        System.out.println("Before advice is running");
    }*/

    @AfterReturning(pointcut = "execution(Integer getInteger())", returning = "returnValue")
    void afterReturningAdvice(Integer returnValue) {
        System.out.println("Running AfterReturning " + returnValue);
    }

    @AfterThrowing(pointcut = "execution(void throwException())", throwing = "ex")
    void afterReturningAdvice(Exception ex) {
        System.out.println("Running AfterThrowing " + ex);
    }

    @After("execution(void connect())")
    void afterAdvice(){
        System.out.println("Running after advice");
    }


    @Around("execution(void connect())")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around before");
        proceedingJoinPoint.proceed();
        System.out.println("Around after");
    }


    @Pointcut("execution(void connect())")
    void connectPointcut(){}

    @Pointcut("execution(String checkdata(..))")
    void getStringPointcut(){}

    @Before("execution(Integer getIntdata(Integer))")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}
