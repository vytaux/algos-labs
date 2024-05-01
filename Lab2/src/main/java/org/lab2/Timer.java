package org.lab2;

public class Timer {

    private static long start;

    public static void start() {
        start = System.nanoTime();
    }

    public static long stop() {
        if (start == 0) {
            throw new IllegalStateException("Timer not started");
        }

        long end = System.nanoTime();

        return end - start;
    }
}
