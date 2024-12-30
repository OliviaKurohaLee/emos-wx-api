package com.lx.emos.wx.aop;


import com.lx.emos.wx.common.util.R;
import com.lx.emos.wx.config.shiro.ThreadLocalToken;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//aop
//first
@Aspect
@Component
public class TokenAspect {

    @Autowired
    private ThreadLocalToken threadLocalToken;


    @Pointcut("execution(public * com.lx.emos.wx.controller.*.*(..)))")
    public void aspect(){

    }

    @Around("aspect()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        R r = (R) proceedingJoinPoint.proceed();
        String token = threadLocalToken.getToken();
        if(token!=null){
            r.put("token",token);
            threadLocalToken.clear();
        }

        return r;
    }
}
