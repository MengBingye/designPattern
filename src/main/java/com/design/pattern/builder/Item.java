package com.design.pattern.builder;

/**
 * 创建一个表示食物条目和食物包装的接口
 * @create: 2019/03/23 23:10
 */

public interface Item {

    String name();
    Packing packing();
    float price();
}
