package com.factory.javaAndPattern.abstractFactory.bean;

import com.factory.javaAndPattern.abstractFactory.drinkInterfaces.Juice;

public class AppleJuice  implements Juice {

    @Override
    public void juice() {
        System.out.println("榨出苹果汁");
    }

    @Override
    public void drink() {
        System.out.println("喝苹果汁");
    }
}
