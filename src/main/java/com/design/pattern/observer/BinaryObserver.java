package com.design.pattern.observer;

/**
 * @create: 2019/04/06 11:27
 */

public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }

}
