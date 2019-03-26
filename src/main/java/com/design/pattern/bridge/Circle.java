package com.design.pattern.bridge;

/**
 * @create: 2019/03/26 10:13
 */

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drowCircle(radius,x,y);
    }
}
