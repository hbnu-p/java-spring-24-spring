package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class LogTime {

    @Before("com.hbnu.aop.CommonPointcuts.inAop()")
    public void printTime(){
        System.out.println("前置通知：被增强方法运行之前执行");
    }

    @AfterReturning("execution(* com..aop.*.*(..))")
    public void afterRunning(){
        System.out.println("后置通知:方法运行之后执行");
    }

    @Around("!bean(userService)")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知：运行前执行的部分");
        proceedingJoinPoint.proceed(); //被增强方法（执行）
        System.out.println("环绕通知：运行后执行的部分");
    }

    @After("execution(* com.hbnu.aop.UserService.addUser())")
    public void after(){
        System.out.println("最终通知");
    }

    @AfterThrowing("execution(* com.hbnu.aop.UserService.addUser())")
    public void afterThrow(){
        System.out.println("发生异常。。。");
    }
}
