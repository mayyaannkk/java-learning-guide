package org.mayank.learningJava.exceptionHandling.customExceptions;

public class StackFullException extends Throwable {
    public StackFullException(String message) {
        super(message);
    }
}
