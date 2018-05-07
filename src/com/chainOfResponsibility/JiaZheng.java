package com.chainOfResponsibility;

public class JiaZheng extends Player{

    public JiaZheng() {
        super();
    }

    public JiaZheng(Player player) {
        super(player);
    }

    @Override
    public void handle() {
        System.out.println("贾政传花");
    }
}
