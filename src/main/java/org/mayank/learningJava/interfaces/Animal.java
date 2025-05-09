package org.mayank.learningJava.interfaces;

public interface Animal {

    // public and abstract keywords are redundant here
    public abstract void eat();

    void sleep();

    // cannot make object for interfaces
    // Hence no constructors too

    // Variables are automatically public final static
    int MAX_AGE = 20;
}
