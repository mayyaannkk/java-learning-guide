package org.mayank.learningJava.java8.streams.collectCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Partitioning {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "twenty", "thirty");

        // partition the list based on a condition. This will break the list into 2 parts, inserted into a map. Your lambda should result in a boolean value i.e, it should be a Predicate.
        Map<Boolean, List<String>> partitioningBy = stringList.stream().collect(Collectors.partitioningBy(str -> str.length() > 3));
        System.out.println("Partitioning by a condition:: " + partitioningBy);

        // We can also use the overloaded partitioningBy method to pass in a Collector (downstream), and it will perform that operation on the resultant map
        Map<Boolean, Long> partitioningByOverload = stringList.stream().collect(Collectors.partitioningBy(str -> str.length() > 3, Collectors.counting()));
        System.out.println("Partitioning by overloaded method:: " + partitioningByOverload);

    }
}
