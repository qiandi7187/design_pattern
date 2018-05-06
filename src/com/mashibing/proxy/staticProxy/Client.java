package com.mashibing.proxy.staticProxy;

import com.mashibing.proxy.Car;
import com.mashibing.proxy.Moveable;
import com.mashibing.proxy.Tank;
/**
 * 静态代理的接口每增加一个方法，proxy便要跟着增加对该方法的实现
 * 记录日志
 */
public class Client {

    public static void main(String[] args) {
        Moveable moveable = new LogProxy(new TimerProxy(new Car()));
        moveable.move();
        System.out.println("-----------------");
        moveable.stop();

        System.out.println("########################");
        moveable = new TimerProxy(new LogProxy(new Tank()));
        moveable.move();
        System.out.println("-----------------");
        moveable.stop();


        System.out.println(System.getProperty("user.dir"));
    }
}
