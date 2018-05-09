package com.bridge.javaAndPattern;

/**
 * 人族战士
 */
public class OrcWarrior extends Warrior{

    public OrcWarrior(String name) {
        super(name);
    }

    @Override
    protected void attack(Warrior enemy) {
        System.out.println("兽族战士："+this.name);
        this.weapen.isUsedToAttack(enemy);
    }
}
