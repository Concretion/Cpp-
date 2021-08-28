package com.omlucy.ch02;

/**
 * @author lucy
 */
public class ThreadNotSafeInteger {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}

class ThreadNotSafeIntegerSynchronized {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}

class ThreadNotSafeIntegerVolatile {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}