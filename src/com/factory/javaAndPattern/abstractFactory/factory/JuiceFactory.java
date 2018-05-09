package com.factory.javaAndPattern.abstractFactory.factory;

import com.factory.javaAndPattern.abstractFactory.bean.AppleJuice;
import com.factory.javaAndPattern.abstractFactory.drinkInterfaces.Drink;
import com.factory.javaAndPattern.abstractFactory.bean.PearJuice;

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
