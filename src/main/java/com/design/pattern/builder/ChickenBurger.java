package com.design.pattern.builder;

/**
 * @create: 2019/03/23 23:18
 */

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
