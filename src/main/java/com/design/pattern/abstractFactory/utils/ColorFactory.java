package com.design.pattern.abstractFactory.utils;

import com.design.pattern.abstractFactory.Color;
import com.design.pattern.abstractFactory.Shape;
import com.design.pattern.abstractFactory.impl.Blue;
import com.design.pattern.abstractFactory.impl.Green;
import com.design.pattern.abstractFactory.impl.Red;

/**
 * @create: 2019/03/22 09:45
 */

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
