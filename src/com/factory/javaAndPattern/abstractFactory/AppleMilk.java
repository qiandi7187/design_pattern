package com.factory.javaAndPattern.abstractFactory;

public class AppleMilk implements FruitMilk{

    @Override
    public void mix() {
        System.out.println("搅拌苹果牛奶");
    }

    @Override
    public void drink() {
        System.out.println("喝苹果牛奶");
    }
}
