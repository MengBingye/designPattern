package com.design.pattern.abstractFactory.impl;

import com.design.pattern.abstractFactory.Color;

/**
 * @create: 2019/03/22 09:38
 */

public class Green implements Color {


    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
