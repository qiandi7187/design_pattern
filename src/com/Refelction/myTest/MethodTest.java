package com.Refelction.myTest;

import com.proxy.mashibing.Car;
import com.proxy.mashibing.Moveable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Moveable.class.getMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        System.out.println("######包含全部方法#######");
        methods = Car.class.getMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        System.out.println("#######只包含声明方法#########");
        methods = Car.class.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        System.out.println("#######通过反射调用方法#########");
        Moveable moveable = new Car();
        for(Method method:methods){
            method.invoke(moveable,null);
        }

    }
}
