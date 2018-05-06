package com.mashibing.proxy;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("Car is running!");
    }


    @Override
    public void stop() {
        System.out.println("Car stop!");
    }

}
