package org.mayank.learningJava.java8.streams.collectCollectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

public class Summarizing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // To generate a summarizingInt, we first need to box it to wrapper class Integer type
        // Same goes for Double, Long
        IntSummaryStatistics summarizingInt = Arrays.stream(arr).boxed().collect(Collectors.summarizingInt(x -> x*2));
        System.out.println("SummarizingInt obj:: " + summarizingInt);
        System.out.println("Summarizing Max:: " + summarizingInt.getMax());
        System.out.println("Summarizing Min:: " + summarizingInt.getMin());
        System.out.println("Summarizing Count:: " + summarizingInt.getCount());

        // MinBy
        Optional<Integer> minBy = Arrays.stream(arr).boxed().collect(Collectors.minBy(Comparator.comparingInt(x -> x)));
        System.out.println("Min By:: " + minBy.get());

        // Max by
        Optional<Integer> maxBy = Arrays.stream(arr).boxed().collect(Collectors.maxBy(Comparator.comparingInt(x -> x)));
        System.out.println("Max By:: " + maxBy.get());

        // Summing int
        Integer summingInt = Arrays.stream(arr).boxed().collect(Collectors.summingInt(x -> x));
        System.out.println("Summint Int:: " + summingInt);

        // Averaging Int
        Double averagingInt = Arrays.stream(arr).boxed().collect(Collectors.averagingInt(x -> x));
        System.out.println("Averaging Int:: " + averagingInt);

    }
}
