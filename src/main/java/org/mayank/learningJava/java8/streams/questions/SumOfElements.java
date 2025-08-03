package org.mayank.learningJava.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        long sum = arr.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
