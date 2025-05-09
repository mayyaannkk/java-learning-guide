package org.mayank.learningJava.multithreading.threadLocal;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Thread thread1 = new Thread(() -> {
            threadLocal.set("Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Before removing:: " + threadLocal.get());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Before removing:: " + threadLocal.get());

            threadLocal.remove();
            System.out.println("After removing:: " + threadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadLocal.get());
        });

        thread1.start();
        thread2.start();
    }
}
