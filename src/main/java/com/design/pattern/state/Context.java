package com.design.pattern.state;

/**
 * @create: 2019/04/06 11:35
 */

public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
