package com.design.pattern.factorypattern.impl;

import com.design.pattern.factorypattern.Shape;

/**
 * 创建一个圆形的类实现形状的接口
 * @create: 2019/03/21 22:43
 */

public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
