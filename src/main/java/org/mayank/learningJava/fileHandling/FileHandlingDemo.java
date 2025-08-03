package org.mayank.learningJava.fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try (FileInputStream fr = new FileInputStream("input.txt");){
            InputStreamReader reader = new InputStreamReader(fr, StandardCharsets.UTF_8); // decode bytes
            BufferedReader br = new BufferedReader(reader); // efficient reading

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
