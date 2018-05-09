package com.factory.javaAndPattern.abstractFactory.factory;

import com.factory.javaAndPattern.abstractFactory.bean.AppleMilk;
import com.factory.javaAndPattern.abstractFactory.drinkInterfaces.Drink;
import com.factory.javaAndPattern.abstractFactory.bean.PearMilk;

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
