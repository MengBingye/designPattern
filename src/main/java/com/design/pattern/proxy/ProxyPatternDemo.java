package com.design.pattern.proxy;

/**
 * @create: 2019/04/01 09:23
 */

public class ProxyPatternDemo {


    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
