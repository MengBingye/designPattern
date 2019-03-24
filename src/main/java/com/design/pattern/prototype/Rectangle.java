package com.design.pattern.prototype;

/**
 * @create: 2019/03/24 19:14
 */

public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    void drow() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
