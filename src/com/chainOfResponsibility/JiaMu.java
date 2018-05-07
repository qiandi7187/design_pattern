package com.chainOfResponsibility;

public class JiaMu extends Player{

    public JiaMu() {
        super();
    }

    public JiaMu(Player player) {
        super(player);
    }

    @Override
    public void handle() {
        System.out.println("贾母传花");
    }
}
