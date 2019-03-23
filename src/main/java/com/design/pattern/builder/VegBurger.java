package com.design.pattern.builder;

/**
 * @create: 2019/03/23 23:17
 */

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "ver burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
