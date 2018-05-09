package com.factory.javaAndPattern.abstractFactory.bean;

import com.factory.javaAndPattern.abstractFactory.drinkInterfaces.FruitMilk;

public class PearMilk implements FruitMilk {

    @Override
    public void mix() {
        System.out.println("搅拌梨子牛奶");
    }

    @Override
    public void drink() {
        System.out.println("喝梨子牛奶");
    }
}
