package com.chainOfResponsibility.dahua;

public class JiaBaoYu extends Player{

    public JiaBaoYu() {
        super();
    }

    public JiaBaoYu(Player player) {
        super(player);
    }

    @Override
    public void handle() {
        System.out.println("贾宝玉传花");
    }
}
