package com.design.pattern.abstractFactory.impl;


import com.design.pattern.abstractFactory.Shape;

/**
 * 创建一个正方形的类实现形状接口
 * @create: 2019/03/21 22:41
 */

public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
