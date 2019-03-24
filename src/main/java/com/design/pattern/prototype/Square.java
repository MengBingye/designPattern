package com.design.pattern.prototype;

/**
 * @create: 2019/03/24 19:16
 */

public class Square extends Shape {
    @Override
    void drow() {
        System.out.println("Inside Square::draw() method.");
    }

    public Square() {
        super.type = "Square";
    }
}
