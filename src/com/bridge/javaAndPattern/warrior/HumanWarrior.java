package com.bridge.javaAndPattern.warrior;

/**
 * 人族战士
 */
public class HumanWarrior extends Warrior{

    public HumanWarrior(String name) {
        super(name);
    }

    @Override
    public void attack(Warrior enemy) {
        System.out.println("人族战士："+this.name);
        this.weapen.isUsedToAttack(enemy);
    }
}
