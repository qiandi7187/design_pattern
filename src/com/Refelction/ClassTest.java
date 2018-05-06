package com.Refelction;

import com.mashibing.proxy.Car;
import com.mashibing.proxy.Moveable;
import com.mashibing.proxy.jdkDynamicProxy.LogInvocationHandle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {

    public static void main(String[] args) throws Exception {

        Class<? extends Moveable>  clz = Car.class;
        Constructor constructor = clz.getConstructor();
        Car  car = (Car)constructor.newInstance();
        car.move();
        car.stop();

        System.out.println("------对象获取class-------");
        Car  car2 =  new Car();
        Class<? extends Moveable>  clz2 = car2.getClass();
        Constructor constructor2 = clz.getConstructor();
        Car  car3 = (Car)constructor.newInstance();
        car3.move();
        car3.stop();

    }
}
