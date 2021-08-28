package com.omlucy.ch03;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lucy
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(5));
        }

        RandomTest.threadLocalRandomTest();
    }

    private static void threadLocalRandomTest() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(5));
        }
    }
}
