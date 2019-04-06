package com.design.pattern.visitor;

/**
 * @create: 2019/04/06 12:12
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
