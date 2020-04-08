package com.ehi.thread.createThread;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:22
 * @Description: TODO
 */
public class TheadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName() + " main()方法执行结束");
    }

}

