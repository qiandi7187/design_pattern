package com.chainOfResponsibility.dahua;

public class JiaShe extends Player{


    public JiaShe(Player player) {
        super(player);
    }

    @Override
    public void handle() {
        System.out.println("贾赦传花");
    }
}
