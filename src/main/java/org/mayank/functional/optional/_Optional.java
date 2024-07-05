package org.mayank.functional.optional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Object optional = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(optional);

        Optional.ofNullable("mayankpant.pant120@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to: " + email),
                        () -> {
                            System.out.println("Cannot send email");
                        });
    }
}
