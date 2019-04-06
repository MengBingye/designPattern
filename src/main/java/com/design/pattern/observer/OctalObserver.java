package com.design.pattern.observer;

/**
 * @create: 2019/04/06 11:28
 */

public class OctalObserver extends Observer {


    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
