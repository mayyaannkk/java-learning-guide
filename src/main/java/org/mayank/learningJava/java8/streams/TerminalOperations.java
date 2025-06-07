package org.mayank.learningJava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        // in new java versions we can directly pass toList
        // list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(System.out::print);

        // 3. reduce:: Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        System.out.println(optionalInteger.get());

        // 4. count

        // Below this are short-circuit operations: meaning, as soon as they find a match they will stop executing other elements

        // 5. anyMatch, allMatch, noneMatch
        boolean anyMatchRes = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("anyMatch:: " + anyMatchRes);

        boolean allMatchRes = list.stream().allMatch(x -> x > 0);
        System.out.println("allMatch:: " + allMatchRes);

        boolean noneMatchRes = list.stream().noneMatch(x -> x < 0);
        System.out.println("noneMatch:: " + noneMatchRes);

        // 6. findFirst, findAny
        Optional<Integer> findFirstRes = list.stream().findFirst();
        System.out.println("findFirst:: " + findFirstRes.get());

        Optional<Integer> findAnyRes = list.stream().findAny();
        System.out.println("findAny:: " + findAnyRes.get());

    }
}
