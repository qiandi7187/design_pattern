package com.proxy.mashibing;

public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("Tank is running!");
    }


    @Override
    public void stop() {
        System.out.println("Tank stop!");
    }

}
