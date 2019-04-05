package com.design.pattern.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @create: 2019/04/06 00:57
 */

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();


    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
