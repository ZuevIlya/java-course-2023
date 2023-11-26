package edu.hw7;

import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    private static AtomicInteger counter = new AtomicInteger();

    public static int getCounter(int numThreads) {
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                counter.incrementAndGet();
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return counter.get();
    }
}
