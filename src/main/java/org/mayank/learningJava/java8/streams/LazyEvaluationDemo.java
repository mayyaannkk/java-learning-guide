package org.mayank.learningJava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> streamOfNames = names.stream()
                .filter(name -> {
                    System.out.println("Filtering:: " + name);
                    return name.length() > 3;
                });

        System.out.println("Before terminal operation");
        System.out.println(streamOfNames);

        List<String> result = streamOfNames.collect(Collectors.toList());

        System.out.println("After terminal operation");
        System.out.println(result);
    }
}
