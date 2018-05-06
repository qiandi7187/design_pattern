package com.mashibing.proxy.staticProxy;

import com.mashibing.proxy.Moveable;



public class LogProxy implements Moveable{
    private Moveable runnable;

    public LogProxy(Moveable runnable) {
        this.runnable = runnable;
    }


    @Override
    public void move() {
        System.out.println("Before----");
        runnable.move();
        System.out.println("After-----");
    }

    @Override
    public void stop() {
        System.out.println("Before----");
        runnable.stop();
        System.out.println("After-----");
    }


}
