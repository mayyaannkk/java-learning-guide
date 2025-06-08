package org.mayank.learningJava.java8.streams.collectCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "twenty", "thirty");

        // Grouping based on the passed Function:: Instead of passing a lambda that returns true/false (Predicate), we can pass in a lambda that returns anything, and that anything will become our key for the map
        Map<Integer, List<String>> groupingBy = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Simple grouping by:: " + groupingBy);

        // We can also pass a downstream so that it will be executed on the resultant map
        Map<Integer, String> groupWithDownstream = stringList.stream().collect(Collectors.groupingBy(String::length, Collectors.joining("->")));
        System.out.println("Grouping with downstream, and joining the values:: " + groupWithDownstream);

        Map<Integer, Long> groupWithDownstreamAndCount = stringList.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println("Counting with downstream:: " + groupWithDownstreamAndCount);

        Map<Integer, List<String>> groupingAndMapping = stringList.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));
        System.out.println("Grouping and mapping:: " + groupingAndMapping);

    }
}
