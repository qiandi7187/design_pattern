package com.factory.javaAndPattern.abstractFactory.factory;

import com.factory.javaAndPattern.abstractFactory.drinkInterfaces.Drink;

public interface DrinkFactory {

    Drink appleDrinkCreator();

    Drink pearDrinkCreator();
}
