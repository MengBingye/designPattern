package com.design.pattern.factorypattern.utils;

import com.design.pattern.factorypattern.Shape;
import com.design.pattern.factorypattern.impl.Circle;
import com.design.pattern.factorypattern.impl.Rectangle;
import com.design.pattern.factorypattern.impl.Square;

/**
 * 创建形状的工厂类
 * @create: 2019/03/21 22:45
 */

public class ShapeFactory {


    /**
     * 使用getShape方法获取形状的对象
     * @param shape
     * @return
     */
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
        }
        return null;
    }
}
