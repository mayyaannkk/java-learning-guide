package org.mayank.learningJava.java8.streams.collectCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class ToSomething {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "twenty", "thirty");

        // to list
        List<String> toList = stringList.stream().filter(str -> str.length() > 3).collect(Collectors.toList());
        System.out.println("To List:: " + toList);

        // to set
        Set<String> toSet = stringList.stream().filter(str -> str.length() > 3).collect(Collectors.toSet());
        System.out.println("To Set:: " + toSet);

        // to map
        Map<String, Integer> toMap = stringList.stream().filter(str -> str.length() > 3).collect(Collectors.toMap(String::toUpperCase, String::length));
        System.out.println("To Map:: " + toMap);

        // what if there are key collisions when creating a map? Then use the overloaded toMap method, and pass in a BinaryOperator to resolve collision
        Map<Integer, String> toMapWithCollision = stringList.stream().collect(Collectors.toMap(String::length, str -> str, (oldVal, newVal) -> oldVal + " -- " + newVal));
        System.out.println("Map with key collisions:: " +toMapWithCollision);

        // A generic method, to convert stream to any collection
        TreeSet<String> toCollection = stringList.stream().filter(str -> str.length() > 3).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("To collection:: " + toCollection);


    }
}
