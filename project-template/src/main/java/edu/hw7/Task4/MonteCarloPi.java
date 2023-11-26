package edu.hw7.Task4;

import java.util.Random;

public class MonteCarloPi {

    public static void main(String[] args) {
        int iterations = 100000000; // Количество итераций

        long startTime = System.currentTimeMillis();
        double pi = calculatePi(iterations);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Pi approximation: " + pi);
        System.out.println("Elapsed time: " + elapsedTime + " ms");
    }

    public static double calculatePi(int iterations) {
        Random random = new Random();
        int circleCount = 0;
        int totalCount = 0;

        for (int i = 0; i < iterations; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 1) {
                circleCount++;
            }

            totalCount++;
        }

        return 4.0 * (circleCount / (double) totalCount);
    }
}

