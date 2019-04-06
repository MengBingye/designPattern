package com.design.pattern.state;

/**
 * @create: 2019/04/06 11:38
 */

public class StatePatternDemo {


    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
