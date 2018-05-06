package com.mashibing.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandle implements InvocationHandler {

    private Object target;

    public LogInvocationHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before----");
        System.out.println("Test:   target "+target.getClass()+"    proxy "+proxy.getClass());
        Object o = method.invoke(target,args);
        System.out.println("After-----");
        return o;
    }

}
