package com.state.mashibing;

public abstract class State {
    private String name;

    public State(String name) {
        this.name = name;
    }

    public void showState(){
        System.out.println("展示状态"+name);
    }

    public abstract void move();

}
