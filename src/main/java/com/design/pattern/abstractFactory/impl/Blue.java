package com.design.pattern.abstractFactory.impl;

import com.design.pattern.abstractFactory.Color;

/**
 * @create: 2019/03/22 09:39
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
