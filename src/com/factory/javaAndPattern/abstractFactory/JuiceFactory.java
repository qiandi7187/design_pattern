package com.factory.javaAndPattern.abstractFactory;

public class JuiceFactory implements DrinkFactory{


    @Override
    public Drink appleDrinkCreate() {
        return new AppleJuice();
    }

    @Override
    public Drink pearDrinkCreate() {
        return new PearJuice();
    }
}
