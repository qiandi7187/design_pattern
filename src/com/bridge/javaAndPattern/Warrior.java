package com.bridge.javaAndPattern;

public abstract class Warrior {
    protected String name;

    protected Weapen weapen;


    public Warrior(String name) {
        this.name = name;
    }

    protected abstract void attack(Warrior enemy);

}
