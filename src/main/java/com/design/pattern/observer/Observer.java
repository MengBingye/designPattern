package com.design.pattern.observer;

/**
 * @create: 2019/04/06 11:21
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
