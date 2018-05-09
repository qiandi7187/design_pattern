package com.factory.javaAndPattern.abstractFactory.bean;


import com.factory.javaAndPattern.abstractFactory.drinkInterfaces.Juice;

public class PearJuice implements Juice {

    @Override
    public void juice() {
        System.out.println("榨出梨子汁");
    }

    @Override
    public void drink() {
        System.out.println("喝梨子汁");
    }
}
