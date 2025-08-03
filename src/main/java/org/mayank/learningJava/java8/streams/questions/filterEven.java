package org.mayank.learningJava.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> collect = list.stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
