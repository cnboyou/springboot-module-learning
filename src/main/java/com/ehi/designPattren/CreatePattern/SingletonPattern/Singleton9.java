package com.ehi.designPattren.CreatePattern.SingletonPattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:01
 * @Description: 使用CAS锁实现（线程安全）
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 */
public class Singleton9 {

    private static final AtomicReference<Singleton9> INSTANCE = new AtomicReference<Singleton9>();

    private Singleton9() {
    }

    public static Singleton9 getInstance() {
        for (; ; ) {
            Singleton9 current = INSTANCE.get();

            if (current != null) {
                return current;
            }

            current = new Singleton9();

            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }

}
