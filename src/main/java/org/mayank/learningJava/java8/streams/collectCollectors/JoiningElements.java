package org.mayank.learningJava.java8.streams.collectCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningElements {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "twenty", "thirty");

        // joining without a delimiter
        String join = stringList.stream().collect(Collectors.joining());
        System.out.println("Joining without delimiter:: " + join);


        // joining with delimiter
        String joinWithDelimiter = stringList.stream().collect(Collectors.joining("-"));
        System.out.println("Joining with delimiter:: " + joinWithDelimiter);

        // joining with delimiter, suffix, and prefix
        String withSufAndPre = stringList.stream().collect(Collectors.joining(":", "{", "}"));
        System.out.println("Joining with prefix, suffix, and delimiter:: " + withSufAndPre);
    }
}
