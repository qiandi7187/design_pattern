package com.factory.javaAndPattern.abstractFactory;

public class JuiceFactory implements DrinkFactory{


    @Override
    public Drink appleDrinkCreator() {
        return new AppleJuice();
    }

    @Override
    public Drink pearDrinkCreator() {
        return new PearJuice();
    }
}
