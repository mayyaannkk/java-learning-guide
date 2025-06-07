package org.mayank.learningJava.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*
        Before Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of the comparator is: " + comparator.compare(3, 2));


        /*
        With Lambda
         */
        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> o1.compareTo(o2);
        System.out.println("Result of the lambda comparator is: " + comparatorLambda.compare(3, 2));

        /*
        Lambda is intelligent enough to type-cast the input to Integer, so you don't need to specify it
         */
        Comparator<Integer> comparatorLambda1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Result of the lambda-1 comparator is: " + comparatorLambda1.compare(3, 2));

    }
}
