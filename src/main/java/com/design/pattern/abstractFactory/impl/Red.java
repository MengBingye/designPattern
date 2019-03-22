package com.design.pattern.abstractFactory.impl;

import com.design.pattern.abstractFactory.Color;

/**
 * @create: 2019/03/22 09:37
 */

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}
