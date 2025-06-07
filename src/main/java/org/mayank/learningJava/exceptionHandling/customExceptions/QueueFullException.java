package org.mayank.learningJava.exceptionHandling.customExceptions;

public class QueueFullException extends Throwable {
    public QueueFullException(String message) {
        super(message);
    }
}
