package com.design.pattern.abstractFactory.utils;

/**
 * 创建一个工厂创造器/生成器,通过传递形状或颜色信息来获取工厂
 * @create: 2019/03/22 09:46
 */

public class FatoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }

    }
}
