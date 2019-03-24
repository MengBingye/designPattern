package com.design.pattern.prototype;

/**
 * @create: 2019/03/24 19:17
 */

public class Circle extends Shape {
    @Override
    void drow() {
        System.out.println("Inside Circle::draw() method.");
    }

    public Circle() {
        super.type = "Circle";
    }
}
