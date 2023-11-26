package edu.hw7;

import java.util.stream.LongStream;

public class Task2 {

    public static long factorial(long number) {
        return LongStream.rangeClosed(1, number)
            .parallel()
            .reduce(1, (long x, long y) -> x * y);
    }
}
