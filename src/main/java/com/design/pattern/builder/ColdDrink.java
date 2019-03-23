package com.design.pattern.builder;

/**
 * @create: 2019/03/23 23:16
 */

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
