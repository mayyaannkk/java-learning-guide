package org.mayank.learningJava.java8.functionalInterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("Hello");
    }
}
