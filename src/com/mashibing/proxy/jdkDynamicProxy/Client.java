package com.mashibing.proxy.jdkDynamicProxy;

import com.mashibing.proxy.Car;
import com.mashibing.proxy.Moveable;

import java.lang.reflect.Proxy;
/**
 * 动态代理教静态代理灵活许多 ，不用对每一个方法进行实现，只需实现handle类
 * 记录日志
 *
 * 基于jdk实现的动态代理必须实现接口
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        Moveable moveable = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), new LogInvocationHandle(new Car()));
        moveable.move();
        System.out.println("------------------------");
        moveable.stop();

        System.out.println("##########两层代理############");
        Moveable moveable2 = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), moveable.getClass().getInterfaces(), new TimerInvocationHandle(moveable));
        moveable2.move();
        System.out.println("------------------------");
        moveable2.stop();

        System.out.println("##########自定义工厂生产代理对象############");
        Moveable moveable3 = (Moveable) DynamicProxyFactory.getProxy(car, LogInvocationHandle.class);
        moveable3.move();
        System.out.println("------------------------");
        Moveable moveable4 = (Moveable) DynamicProxyFactory.getProxy(moveable3, TimerInvocationHandle.class);
        moveable4.move();

    }
}
