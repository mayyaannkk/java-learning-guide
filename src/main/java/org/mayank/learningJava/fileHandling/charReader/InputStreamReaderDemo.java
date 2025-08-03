package org.mayank.learningJava.fileHandling.charReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some characters: ");
            int val = isr.read();
            while(isr.ready()) {
                System.out.print((char) val);
                val = isr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
