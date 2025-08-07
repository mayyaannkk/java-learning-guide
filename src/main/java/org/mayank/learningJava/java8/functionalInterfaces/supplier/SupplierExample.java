package org.mayank.learningJava.java8.functionalInterfaces.supplier;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println("=== OLD ===");
        System.out.println(getDBConnection());

        System.out.println("=== NEW ===");
        System.out.println(getDBConnectionSupplier.get());

        // Generating random values
        /*
        IntSupplier generateRandomInt = () -> Math.random()*10;
        In Java, narrowing primitive conversions (like double → int) can cause data loss, so the compiler:

        Allows widening (int → double)

        But disallows narrowing without an explicit cast

         */
    }

    static String getDBConnection() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:5432/users";
}
