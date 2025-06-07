package org.mayank.learningJava.java8.consumer;

import java.util.function.BiConsumer;

public class Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "9999");
        // Old code
        greetCustomer(maria);

        // New Consumer code
        greetCustomerConsumer.accept(maria);

        // Bi-Consumer code
        greetCustomerBiConsumer.accept(maria, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static java.util.function.Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
            customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
            (showPhoneNumber ? customer.customerPhoneNumber : "******"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
