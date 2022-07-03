package com.omlucy.arrays;

import java.util.stream.LongStream;

/**
 * @author lucy
 * @date 2021/12/21
 */
public class CountUpward {
    static long[] fillCounted(int size) {
        return LongStream.iterate(0, i -> i + 1).limit(size).toArray();
    }

    public static void main(String[] args) {
        long[] l1 = fillCounted(10_000_000);
        //        Arrays.toString(l1);
    }
}
