package aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcuts {
    @Pointcut(value = "execution(* aop*.*(..))")
    public void inWebLayer(){}

    @Pointcut("execution(* com..aop.*.*(..))")
    public void inAop(){}
}
