package com.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @create: 2019/04/03 09:27
 */

public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
