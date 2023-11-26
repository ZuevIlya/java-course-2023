package edu.hw7.Task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MonteCarloPiMultithreaded {

    private static final int THREAD_COUNT = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        int iterations = 100000000; // Количество итераций

        long startTime = System.currentTimeMillis();
        double pi = calculatePi(iterations);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Pi approximation: " + pi);
        System.out.println("Elapsed time: " + elapsedTime + " ms");
        System.out.println("Threads used: " + THREAD_COUNT);
    }

    public static double calculatePi(int iterations) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        int[] circleCounts = new int[THREAD_COUNT];
        int[] totalCounts = new int[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            int finalI = i;
            executor.execute(() -> {
                for (int j = 0; j < iterations / THREAD_COUNT; j++) {
                    double x = Math.random();
                    double y = Math.random();

                    double distance = Math.sqrt(x * x + y * y);

                    if (distance <= 1) {
                        circleCounts[finalI]++;
                    }

                    totalCounts[finalI]++;
                }
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalCircleCount = 0;
        int totalCount = 0;

        for (int i = 0; i < THREAD_COUNT; i++) {
            totalCircleCount += circleCounts[i];
            totalCount += totalCounts[i];
        }

        return 4.0 * (totalCircleCount / (double) totalCount);
    }
}

