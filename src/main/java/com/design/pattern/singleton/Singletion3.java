package com.design.pattern.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @create: 2019/03/23 18:50
 */

public class Singletion3 {

    private volatile static Singletion3 singleton;
    private Singletion3 (){}
    public static Singletion3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singletion3();
                }
            }
        }
        return singleton;
    }
}
