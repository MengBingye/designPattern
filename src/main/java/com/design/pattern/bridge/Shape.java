package com.design.pattern.bridge;

/**
 * @create: 2019/03/26 10:11
 */

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
