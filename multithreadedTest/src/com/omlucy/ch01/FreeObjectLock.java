package com.omlucy.ch01;

/**
 * @author lucy
 */
public class FreeObjectLock {
    // 创建资源
    private static volatile Object resourceA = new Object();
    private static volatile Object resourceB = new Object();

    public static void main(String[] args) {
        // create thread
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resourceA) {
                        System.out.println("threadA get resourceA lock");
                        synchronized (resourceB) {
                            System.out.println("threadA get resourceB lock");
                            System.out.println("threadA release resourceA lock");
                            resourceA.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 休眠 1 s
                    Thread.sleep(1000);
                    // 获取 resourceA 共享资源的监视器锁
                    synchronized (resourceA) {
                        System.out.println("threadB get resourceA lock");
                        System.out.println("threadB try get resourceB lock...");
                        // 获取 resourceB 共享资源的监视器锁
                        synchronized (resourceB) {
                            System.out.println("threadB get resourceB lock");
                            System.out.println("threadB release resourceA lock");
                            resourceA.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 启动线程
        threadA.start();
        threadB.start();
        // 等待两个线程结束
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main over");
    }
}
