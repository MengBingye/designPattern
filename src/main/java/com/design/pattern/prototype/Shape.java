package com.design.pattern.prototype;

/**
 * @create: 2019/03/24 19:10
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void drow();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }


    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
