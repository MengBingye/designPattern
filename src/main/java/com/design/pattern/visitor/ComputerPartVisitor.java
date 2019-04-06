package com.design.pattern.visitor;

/**
 * @create: 2019/04/06 12:13
 */

public interface ComputerPartVisitor {
     void visit(Computer computer);
     void visit(Mouse mouse);
     void visit(Keyboard keyboard);
     void visit(Monitor monitor);
}
