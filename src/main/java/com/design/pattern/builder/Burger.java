package com.design.pattern.builder;

/**
 * @create: 2019/03/23 23:14
 */

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
