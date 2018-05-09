package com.bridge.javaAndPattern.warrior;

/**
 * 人族战士
 */
public class OrcWarrior extends Warrior{

    public OrcWarrior(String name) {
        super(name);
    }

    @Override
    public void attack(Warrior enemy) {
        System.out.println("兽族战士："+this.name);
        this.weapen.isUsedToAttack(enemy);
    }
}
