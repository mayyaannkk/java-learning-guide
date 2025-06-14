package org.mayank.learningJava.java8.lambdas;

/*
    Runnable is a functional Interface which has a run() method and this runnable implementation is used to run a thread.
     If we want to use it we need to implement the run() method.
 */
public class RunnableLambdaExample {

    public static void main(String[] args) {

        /*
          Before Java 8
         */

        // Way 1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        // Way 2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 2");
            }
        }).start();


        /*
            With Java 8 lambda
            () -> {}

            My Notes::
            Since the runnable interface has only one method that needs to be implemented, so
            we can simply do it with lambda as the compiler can easily understand that what else
            will you be implementing.
            The compiler knows that it is a Runnable by looking at the data type on LHS
         */

        // Way 1
        Runnable runnableLambda = () -> {
            System.out.println("Inside runnable lambda 1");
        };
        new Thread(runnableLambda).start();


        // Way 2
        Runnable runnableLambda2 = () -> System.out.println("Inside runnable lambda 2");
        new Thread(runnableLambda2).start();


        // Way 3
        new Thread(() -> System.out.println("Inside runnable lambda 3")).start();

    }
}
