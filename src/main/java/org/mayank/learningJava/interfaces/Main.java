package org.mayank.learningJava.interfaces;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);
    }
}
