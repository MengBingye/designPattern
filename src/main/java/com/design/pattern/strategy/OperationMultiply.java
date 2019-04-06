package com.design.pattern.strategy;

/**
 * @create: 2019/04/06 11:56
 */

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
