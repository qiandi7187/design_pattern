package com.state.mashibing;

public class CarRunningContext {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void show(){
         state.showState();
    }

    public void move(){
         state.move();
    }
}
