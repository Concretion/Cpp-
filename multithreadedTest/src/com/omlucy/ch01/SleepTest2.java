package com.omlucy.ch01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lucy
 */
public class SleepTest2 {
    // 创建一个独占锁
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("child threadA is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child threadA is in awaked");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    System.out.println("child threadB is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child threadB is in awaked");
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
