package com.design.pattern.builder;

/**
 * @create: 2019/03/23 23:19
 */

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
