package com.mashibing.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerInvocationHandle implements InvocationHandler {

    private Object target;

    public TimerInvocationHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SimpleDateFormat format =  new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");
        System.out.println(format.format(new Date()));
        Object o = method.invoke(target,args);
        return o;
    }
}
