package org.mayank.learningJava.java8.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {

        // Given a list of strings, find those strings which have length > 3
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        List<String> namesGreaterThan3 = names.stream().filter(name -> name.length() > 3).collect(Collectors.toList());
        System.out.println(namesGreaterThan3);

        // Given a list of numbers, square and sort them
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        List<Integer> squaredAndSorted = numbers.stream().map(num -> num * num).sorted().collect(Collectors.toList());
        System.out.println(squaredAndSorted);

        // Summing values
        List<Integer> numValues = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numValues.stream().reduce(Integer::sum);
        System.out.println(sum.get());

        // Counting occurrence of a character
        String str = "Hello World!";
        long count = str.chars().filter(ch -> ch == 'l').count();
        System.out.println(count);
    }
}
