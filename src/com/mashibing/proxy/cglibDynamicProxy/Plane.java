package com.mashibing.proxy.cglibDynamicProxy;

//没有继承关系  用以测试cglib
public class Plane  {
    public void move() {
        System.out.println("Plane is fling!");
    }

    public void stop() {
        System.out.println("Plane stop!");
    }

}
