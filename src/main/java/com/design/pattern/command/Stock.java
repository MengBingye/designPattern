package com.design.pattern.command;

/**
 * @create: 2019/04/03 09:25
 */

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", "+
               " Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+"," +
               " Quantity: " + quantity +" ] sold");
    }
}
