package com.design.pattern.abstractFactory.impl;


import com.design.pattern.abstractFactory.Shape;

/**
 *
 * 创建一个长方形的类来实现形状的接口
 * @create: 2019/03/21 22:38
 */

public class Rectangle implements Shape {


    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
