package org.mayank.functional.callback;

import java.util.function.Consumer;

public class _Callback {
    public static void main(String[] args) {
        sayHello("John", null, value -> {
            System.out.println("No lastName provided for: " + value);
        });
    }

    public static void sayHello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);

        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
