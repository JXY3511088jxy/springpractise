package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect  //注解表示这是一个切面
@Component  //表示这是一个bean,由Spring进行管理
public class LoggerAspect {
    @Around(value = "execution(* com.how2java.service.ProductService.*(..))")//表示对com.how2java.service.ProductService 这个类中的所有方法进行切面操作
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:"+joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:"+joinPoint.getSignature().getName());
        return object;
    }
}
