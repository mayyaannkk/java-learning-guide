package org.mayank.learningJava.fileHandling.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while(sc.hasNext()) {
                String word = sc.nextLine();
                System.out.println("Word: " + word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
