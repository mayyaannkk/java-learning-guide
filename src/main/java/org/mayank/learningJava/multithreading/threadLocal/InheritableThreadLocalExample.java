package org.mayank.learningJava.multithreading.threadLocal;

public class InheritableThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread t1 = new Thread(() -> {
            System.out.println("====Parent Thread=====");
            threadLocal.set("Parent ThreadLocal");
            inheritableThreadLocal.set("Parent Inheritable ThreadLocal");

            Thread childThread = new Thread(() -> {
                System.out.println("From child:: " + threadLocal.get());
                System.out.println("From child inheritable:: " + inheritableThreadLocal.get());
            });
            childThread.start();
        });
        t1.start();
    }
}
