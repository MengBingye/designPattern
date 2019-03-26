package com.design.pattern.bridge;

/**
 * @create: 2019/03/26 10:10
 */

public class RedCircle implements DrawAPI {
    @Override
    public void drowCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
