package org.mayank.learningJava.java8.predicate;

import org.mayank.utils.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Person> personList = new Person().generateListOfPersons();

        List<Person> filteredList = new ArrayList<>();
        Predicate<Person> predicate = person -> person.getAge() > 30;

        // filtering people traditional way
        for(Person p : personList) {
//            if(p.getAge() > 30) {
//                filteredList.add(p);
//            }
            if(predicate.test(p)) {
                filteredList.add(p);
            }
        }

        System.out.println("===============");
        System.out.println(filteredList);
        System.out.println("===============");
        List<Person> filterWithStream = personList.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(filterWithStream);

        // Combining multiple predicates using:: and, or
        Predicate<Person> genderPredicate = person -> person.getGender().equals("Male");
        System.out.println("And-ing predicates:: \n" + personList.stream().filter(predicate.and(genderPredicate)).collect(Collectors.toList()));
        System.out.println("Or-ing predicates:: \n" + personList.stream().filter(predicate.or(genderPredicate)).collect(Collectors.toList()));

        // Negating a predicate using:: negate()
        System.out.println("Negating predicates:: \n" + personList.stream().filter(predicate.negate()).collect(Collectors.toList()));

    }
}
