package com.ehi.thread.simpleThread.createThread;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:22
 * @Description: TODO
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run()方法正在执行...");
    }

}
