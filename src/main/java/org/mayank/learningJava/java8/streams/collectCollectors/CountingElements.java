package org.mayank.learningJava.java8.streams.collectCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingElements {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "twenty", "thirty");

        Long counting = stringList.stream().collect(Collectors.counting());
        System.out.println("Counting:: " + counting);
    }
}
