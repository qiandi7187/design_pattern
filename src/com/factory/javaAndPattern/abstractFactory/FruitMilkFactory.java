package com.factory.javaAndPattern.abstractFactory;

public class FruitMilkFactory implements DrinkFactory{


    @Override
    public Drink appleDrinkCreator() {
        return new AppleMilk();
    }

    @Override
    public Drink pearDrinkCreator() {
        return new PearMilk();
    }
}
