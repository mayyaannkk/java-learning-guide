package org.mayank.learningJava.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortList {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 2, 3, 6, 7);
        List<Integer> collect = arr.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
