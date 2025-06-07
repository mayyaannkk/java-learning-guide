package org.mayank.learningJava.java8.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Creating Stream
        // 1. From collection::
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6);
        Stream<Integer> str1 = list.stream();

        // 2. From arrays::
        String[] arr = {"a", "b", "c"};
        Stream<String> str2 = Arrays.stream(arr);

        // 3. Using stream.of::
        Stream<String> str3 = Stream.of("a", "b");

        // 4. Infinite streams::
        Stream<Integer> str4 = Stream.generate(() -> 1);
        Stream<Integer> str5 = Stream.iterate(1, x -> x + 1);


        // QUESTIONS

        // 1. Sum of all even numbers in a list of integers
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEven = numbersList.stream()
                .filter(x -> x%2 == 0)
                // since we are summing, which can only be done on primitive type, so we need to convert from Integer wrapper class to int
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Q1:: " + sumOfEven);


//    2. Find and print the count of strings that have length greater than 5
        List<String> stringList = Arrays.asList("apples", "grapes", "banana", "watermelon", "kiwi");
        long count = stringList.stream()
                .filter(str -> str.length() > 5)
                .count();

        System.out.println("O2:: " + count);
    }
}
