package org.mayank.learningJava.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 5, 6, 3, 4);
        Optional<Integer> max = arr.stream().max(Integer::compare);
        System.out.println(max.get());
    }
}
