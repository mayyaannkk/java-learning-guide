package org.mayank.learningJava.java8.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Sum of all even numbers in a list of integers
    List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sumOfEven = numbersList.stream()
            .filter(x -> x%2 == 0)
            .mapToInt(Integer::intValue)
            .sum();
}
