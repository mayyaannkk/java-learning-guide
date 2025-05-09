package org.mayank.learningJava.customExceptions;

public class StackFullException extends Throwable {
    public StackFullException(String message) {
        super(message);
    }
}
