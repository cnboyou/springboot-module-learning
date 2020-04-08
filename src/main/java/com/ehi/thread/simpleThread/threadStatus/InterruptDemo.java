package com.ehi.thread.simpleThread.threadStatus;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:08
 * @Description: 中断该线程对象:如果该线程被调用了Object wait/Object wait(long)，
 * 或者被调用sleep(long)，join()/join(long)方法时会抛出interruptedException并且中断标志位将会被清除
 */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        //sleepThread睡眠1000ms
        final Thread sleepThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        //busyThread一直执行死循环
        Thread busyThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    ;
                }
            }
        };
        sleepThread.start();
        busyThread.start();
        //中断该线程对象
        sleepThread.interrupt();
        busyThread.interrupt();
        //测试该线程对象是否被中断
        while (sleepThread.isInterrupted()) {
            ;
        }
        System.out.println("sleepThread isInterrupted: " + sleepThread.isInterrupted());
        System.out.println("busyThread isInterrupted: " + busyThread.isInterrupted());
    }
}
