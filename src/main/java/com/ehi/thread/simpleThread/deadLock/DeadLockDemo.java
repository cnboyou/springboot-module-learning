package com.ehi.thread.simpleThread.deadLock;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:04
 * @Description: 死锁:开启了两个线程threadA， threadB，其中threadA占用了resource_a，
 *  并等待被threadB占用的resource _b。threadB占用了resource _b正在等待被threadA占用的resource _a。
 *  因此threadA，threadB出现线程安全的问题，形成死锁
 *
 *  避免死锁的情况：
 *
 * 避免一个线程同时获得多个锁；
 * 避免一个线程在锁内部占有多个资源，尽量保证每个锁只占用一个资源；
 * 尝试使用定时锁，使用lock.tryLock(timeOut)，当超时等待时当前线程不会阻塞；
 * 对于数据库锁，加锁和解锁必须在一个数据库连接里，否则会出现解锁失败的情况。
 */
public class DeadLockDemo {
    private static String resource_a = "A";
    private static String resource_b = "B";

    public static void main(String[] args) {
        deadLock();
    }

    public static void deadLock() {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource_a) {
                    System.out.println("a get resource a");
                    try {
                        Thread.sleep(3000);
                        synchronized (resource_b) {
                            System.out.println("a get resource b");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource_b) {
                    System.out.println("b get resource b");
                    synchronized (resource_a) {
                        System.out.println("b get resource a");
                    }
                }
            }
        });
        threadA.start();
        threadB.start();

    }
}
