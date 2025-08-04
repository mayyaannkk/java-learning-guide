package org.mayank.learningJava.java8.functionalInterfaces.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;

        System.out.println(biPredicate.test(4, 5));
        System.out.println(biPredicate.test(6, 5));

        BiPredicate<String, String> stringBiPredicate = (a, b) -> a.contains(b);

        System.out.println(stringBiPredicate.test("Hello World!", "orld"));
    }
}
