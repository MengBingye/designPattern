package com.design.pattern.state;

/**
 * @create: 2019/04/06 11:37
 */

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
