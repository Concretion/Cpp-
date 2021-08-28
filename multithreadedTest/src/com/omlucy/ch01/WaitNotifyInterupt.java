package com.omlucy.ch01;

/**
 * @author lucy
 */
public class WaitNotifyInterupt {
    static Object obj = new Object();

    public static void main(String[] args) {
        // 创建线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("--begin--");
                    // 阻塞当前线程
                    synchronized (obj) {
                        obj.wait(500);
                    }
                    System.out.println("--end--");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---begin interrupt threadA---");
        System.out.println(threadA);
        threadA.interrupt();
        System.out.println("---end interrupt threadA---");
    }
}
