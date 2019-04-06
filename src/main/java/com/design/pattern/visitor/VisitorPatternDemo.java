package com.design.pattern.visitor;

/**
 * @create: 2019/04/06 12:16
 */

public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
