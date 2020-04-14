package com.ehi.designPattren.CreatePattern.SingletonPattern;

/**
 * ClassName: aa
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:53
 * @Description: 双检锁/双重校验锁（DCL，即 double-checked locking）    如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 *
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }

}
