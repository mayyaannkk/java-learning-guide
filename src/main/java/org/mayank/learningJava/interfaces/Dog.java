package org.mayank.learningJava.interfaces;

public class Dog implements Animal{
//    We need to override the methods for the implementing Interface

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }


}
