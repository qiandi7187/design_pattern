package com.mashibing.proxy.staticProxy;

import com.mashibing.proxy.Moveable;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 静态代理的接口每增加一个方法，proxy便要跟着增加对该方法的实现
 * 记录时间
 */
public class TimerProxy implements Moveable{
    private Moveable runnable;
    private SimpleDateFormat format =  new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");

    public TimerProxy(Moveable runnable) {
        this.runnable = runnable;
    }


    @Override
    public void move() {
        System.out.println(format.format(new Date()));
        runnable.move();
    }

    @Override
    public void stop() {
        System.out.println(format.format(new Date()));
        runnable.stop();
    }


}
