package org.mayank.learningJava.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> numbers = Stream.iterate(1, x -> x + 1).limit(20000).collect(Collectors.toList());
        List<Long> factOfNums = numbers.stream().map(ParallelStreams::factorial).collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Time take with sequential stream:: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        factOfNums = numbers.parallelStream().map(ParallelStreams::factorial).collect(Collectors.toList());
        end = System.currentTimeMillis();
        System.out.println("Time take with parallel stream:: " + (end - start) + " ms");

    }

    private static long factorial(int n) {
        long result = 1;
        for(int i = 2; i <=n; i++) {
            result *= i;
        }
        return result;
    }
}
