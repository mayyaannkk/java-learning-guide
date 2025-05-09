package org.mayank.learningJava.customExceptions;

public class QueueEmptyException extends Throwable {
    public QueueEmptyException(String message) {
        super(message);
    }
}
