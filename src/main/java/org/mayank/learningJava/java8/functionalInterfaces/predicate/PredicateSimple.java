package org.mayank.learningJava.java8.functionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateSimple {
    public static void main(String[] args) {

        String phoneNumber = "07000000000";

        System.out.println("=== Without Predicate ===");
        System.out.println(isPhoneNumberValid(phoneNumber));

        System.out.println("=== Predicate ===");
        System.out.println("Test method:: " + isPhoneNumberStartsWith.test(phoneNumber));

        System.out.println("Negate method:: " + isPhoneNumberStartsWith.test(phoneNumber));

        System.out.println("And method, true value:: " + isPhoneNumberLength.and(isPhoneNumberStartsWith).test(phoneNumber));
        System.out.println("And method, false value:: " + isPhoneNumberLength.and(isPhoneNumberStartsWith).test(phoneNumber + "8"));

        System.out.println("Or method:: " + isPhoneNumberLength.or(isPhoneNumberStartsWith).test(phoneNumber));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberStartsWith = phoneNumber -> phoneNumber.startsWith("07");

    static Predicate<String> isPhoneNumberLength = phoneNumber -> phoneNumber.length() == 11;
}
