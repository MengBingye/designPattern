package com.design.pattern.abstractFactory.utils;


import com.design.pattern.abstractFactory.Color;
import com.design.pattern.abstractFactory.Shape;
import com.design.pattern.abstractFactory.impl.Circle;
import com.design.pattern.abstractFactory.impl.Rectangle;
import com.design.pattern.abstractFactory.impl.Square;

/**
 * 创建形状的工厂类
 * @create: 2019/03/21 22:45
 */

public class ShapeFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 使用getShape方法获取形状的对象
     * @param shape
     * @return
     */
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}
