package com.design.pattern.strategy;

/**
 * @create: 2019/04/06 11:55
 */

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
