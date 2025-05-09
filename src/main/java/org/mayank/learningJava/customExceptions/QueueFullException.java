package org.mayank.learningJava.customExceptions;

public class QueueFullException extends Throwable {
    public QueueFullException(String message) {
        super(message);
    }
}
