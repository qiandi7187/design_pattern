package com.proxy.mashibing.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {

    public static Object getProxy(Object target , Class<? extends InvocationHandler> clz){
        try {
            return Proxy.newProxyInstance(DynamicProxyFactory.class.getClassLoader(), target.getClass().getInterfaces(),
                    clz.getConstructor(Object.class).newInstance(target));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
