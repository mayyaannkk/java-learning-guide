package org.mayank.learningJava.java8.functionalInterfaces.function;

import org.mayank.utils.Person;

import java.util.List;
import java.util.function.Function;

public class FunctionUsingObj {
    public static void main(String[] args) {
        List<Person> personList = new Person().generateListOfPersons();

        // Take Person type and return their first name (String)
        Function<Person, String> nameFunc = person -> person.getFirstName();

        personList.forEach(person -> System.out.println(nameFunc.apply(person)));

        // FUNCTION CHAINING
        Function<String, String> upperFunc = name -> name.toUpperCase();
        Function<String, String> concatFunc = name -> name.concat(", have a nice day!");

        System.out.println("==============Two method chaining!================");
        personList.forEach(person -> System.out.println(nameFunc.andThen(upperFunc).apply(person)));

        System.out.println("===========Three method chaining!==============");
        personList.forEach(person -> System.out.println(nameFunc.andThen(upperFunc).andThen(concatFunc).apply(person)));

        // Compose
        System.out.println("=====Compose:: Execution order is reversed as compared to andThen==============");
        personList.forEach(person -> System.out.println(upperFunc.compose(nameFunc).apply(person)));

        // Identity
        personList.forEach(person -> System.out.println(Function.identity().apply(person)));

    }
}
