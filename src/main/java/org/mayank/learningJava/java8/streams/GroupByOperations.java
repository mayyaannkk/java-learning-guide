package org.mayank.learningJava.java8.streams;

import org.mayank.utils.Person;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByOperations {

    public static void main(String[] args) {

        // Create a map with age as key, and value as list of employees in that age group
        List<Person> people = new Person().generateListOfPersons();

        Map<Integer, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(collect);


    }


}
