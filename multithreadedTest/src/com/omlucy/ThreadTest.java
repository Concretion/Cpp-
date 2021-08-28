package com.omlucy;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author lucy
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 继承 Thread
        // 创建线程
        MyThread thread = new MyThread();
        // 启动线程
        thread.start();

        // 应用 Runnable
        RunnableTask task = new RunnableTask();
        new Thread(task).start();
        new Thread(task).start();

        // FutureTask
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        new Thread(futureTask).start();
        try {
            // 等待任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class MyThread extends Thread {
        // 继承 Thread 类并重写 run 方法
        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static class RunnableTask implements Runnable {
        @Override
        public void run() {
            try{
                System.out.println("thread start sleeping");
                Thread.sleep(1000);
                System.out.println("thread end sleep");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class CallerTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "hello";
        }
    }
}
