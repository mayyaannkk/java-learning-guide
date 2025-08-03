package org.mayank.learningJava.fileHandling.scanner;

import java.util.Scanner;

public class ScannerConsoleDemo {
    public static void main(String[] args) {

        // Reading from the console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();
    }
}
