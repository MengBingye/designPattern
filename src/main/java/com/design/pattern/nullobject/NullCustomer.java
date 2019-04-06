package com.design.pattern.nullobject;

/**
 * @create: 2019/04/06 11:47
 */

public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
