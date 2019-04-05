package com.design.pattern.mediator;

/**
 * @create: 2019/04/06 00:49
 */

public class MediatorPatternDemo {

    public static void main(String[] args) {

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
