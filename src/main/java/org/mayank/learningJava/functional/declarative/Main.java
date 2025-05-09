package org.mayank.learningJava.functional.declarative;

import java.util.List;

import static org.mayank.learningJava.functional.declarative.Main.Gender.FEMALE;
import static org.mayank.learningJava.functional.declarative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Declarative Approach
        System.out.println("==== Declarative =====");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);                   //using internal iterator with method reference
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
