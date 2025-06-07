package org.mayank.learningJava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "a");

        // 1. filter
        long count = list.stream().filter(x -> x.startsWith("a")).count();
        System.out.println("filter:: " + count);

        // 2. map
        Stream<String> mapRes = list.stream().map(x -> x.toUpperCase());
        Stream<String> mapRes2 = list.stream().map(String::toUpperCase);
        System.out.println("Map Res 1:: " + mapRes);
        System.out.println("Map Res 2:: " + mapRes2);

        // 3. sorted
        Stream<String> sortingRes = list.stream().sorted();
        Stream<String> sortingRes2 = list.stream().sorted((a, b) -> a.length() - b.length());
        System.out.println("Sorting Res 1:: " + sortingRes);
        System.out.println("Sorting Res 2:: " + sortingRes2);

        // 4. distinct
        long distinctRes = list.stream().distinct().filter(x -> x.startsWith("a")).count();
        System.out.println("Distinct Res:: " + distinctRes);

        // 5. limit
        long limitRes = Stream.iterate(1, x -> x + 1).limit(100).count();
        System.out.println("Limit res:: " + limitRes);

        // 6. skip
        long skipRes = Stream.iterate(1, x -> x + 1).skip(10).limit(100).count();
        System.out.println("Skip res:: " + skipRes);
    }
}
