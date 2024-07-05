package org.mayank.exceptionHandling.customExceptions;

public class QueueEmptyException extends Throwable {
    public QueueEmptyException(String message) {
        super(message);
    }
}
