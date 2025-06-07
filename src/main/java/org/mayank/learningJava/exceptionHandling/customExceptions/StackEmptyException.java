package org.mayank.learningJava.exceptionHandling.customExceptions;

public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
