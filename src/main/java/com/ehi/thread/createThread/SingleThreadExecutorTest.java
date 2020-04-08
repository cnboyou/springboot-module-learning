package com.ehi.thread.createThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: sss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:26
 * @Description: TODO
 */
public class SingleThreadExecutorTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        MyRunnable runnableTest = new MyRunnable();
        for (int i = 0; i < 5; i++) {
            executorService.execute(runnableTest);
        }

        System.out.println("线程任务开始执行");
        executorService.shutdown();
    }

}
