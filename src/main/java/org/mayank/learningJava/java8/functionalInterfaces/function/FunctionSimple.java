package org.mayank.learningJava.java8.functionalInterfaces.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionSimple {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println("=== OLD ===");
        System.out.println(increment);

        System.out.println("=== NEW ===");
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        System.out.println("=== Function Chaining ===");
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        System.out.println("=== Bi-Function ===");
        System.out.println(addAndMultiply.apply(4, 100));
    }
    private static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> addAndMultiply = (addNum, multiplyNum) -> (addNum + 1) * multiplyNum;
}
