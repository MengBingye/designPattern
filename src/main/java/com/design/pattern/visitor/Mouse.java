package com.design.pattern.visitor;

/**
 * @create: 2019/04/06 12:14
 */

public class Mouse implements ComputerPart {


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
