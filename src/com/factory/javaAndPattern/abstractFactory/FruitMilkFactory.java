package com.factory.javaAndPattern.abstractFactory;

public class FruitMilkFactory implements DrinkFactory{


    @Override
    public Drink appleDrinkCreate() {
        return new AppleMilk();
    }

    @Override
    public Drink pearDrinkCreate() {
        return new PearMilk();
    }
}
