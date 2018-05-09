package com.bridge.javaAndPattern.warrior;


import com.bridge.javaAndPattern.weapen.Weapen;

public abstract class Warrior {
    public String name;

    public Weapen weapen;


    public Warrior(String name) {
        this.name = name;
    }

    public abstract void attack(Warrior enemy);

}
