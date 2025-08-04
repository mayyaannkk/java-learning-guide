package org.mayank.learningJava.java8.functionalInterfaces.supplier;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("=== OLD ===");
        System.out.println(getDBConnection());

        System.out.println("=== NEW ===");
        System.out.println(getDBConnectionSupplier.get());
    }

    static String getDBConnection() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:5432/users";
}
