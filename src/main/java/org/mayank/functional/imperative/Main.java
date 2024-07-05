package org.mayank.functional.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mayank.functional.imperative.Main.Gender.FEMALE;
import static org.mayank.functional.imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
                );

        //Imperative Approach to get the females that we have in our people list
        List<Person> females = new ArrayList<>();

        for(Person person: people) {                // This is called an external iterator as we define how the
            if(FEMALE.equals(person.gender)) {      // loop should work. We write how it will increment,
                females.add(person);                // it will increment and hence external, but also
            }                                       // imperative as we have to maintain everything.
        }

        for(Person female : females) {
            System.out.println(female);
        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
