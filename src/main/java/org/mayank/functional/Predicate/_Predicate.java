package org.mayank.functional.Predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("=== Without Predicate ===");
        System.out.println(isPhoneNumberValid("07000000000"));

        System.out.println("=== Predicate ===");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
