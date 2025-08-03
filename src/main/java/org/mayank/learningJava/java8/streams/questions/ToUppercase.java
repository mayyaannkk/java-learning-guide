package org.mayank.learningJava.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "charlie");
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

    }
}
