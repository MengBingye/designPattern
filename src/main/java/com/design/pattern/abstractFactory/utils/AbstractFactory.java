package com.design.pattern.abstractFactory.utils;

import com.design.pattern.abstractFactory.Color;
import com.design.pattern.abstractFactory.Shape;

/**
 * 为Color和Shape创建抽象类来获取工厂
 * @create: 2019/03/22 09:41
 */

public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
