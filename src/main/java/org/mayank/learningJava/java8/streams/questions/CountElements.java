package org.mayank.learningJava.java8.streams.questions;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 2, 3, 6, 7);
        long count = arr.stream().filter(ele -> ele > 5).count();
        System.out.println(count);

    }
}
