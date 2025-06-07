package org.mayank.utils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Person {

    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    private LocalDate dateOfBirth;
    private String maritalStatus;
    private String occupation;
    private boolean isEmployed;

    public Person() {
    }

    public Person(UUID id, String firstName, String lastName, int age, String gender, LocalDate dateOfBirth, String maritalStatus, String occupation, boolean isEmployed) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.occupation = occupation;
        this.isEmployed = isEmployed;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", occupation='" + occupation + '\'' +
                ", isEmployed=" + isEmployed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isEmployed == person.isEmployed && Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(maritalStatus, person.maritalStatus) && Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, gender, dateOfBirth, maritalStatus, occupation, isEmployed);
    }

    public List<Person> generateListOfPersons() {
        return Arrays.asList(
                new Person(UUID.randomUUID(), "Alice", "Johnson", 30, "Female", LocalDate.of(1994, 5, 12), "Single", "Software Engineer", true),
                new Person(UUID.randomUUID(), "Bob", "Smith", 45, "Male", LocalDate.of(1979, 3, 8), "Married", "Manager", true),
                new Person(UUID.randomUUID(), "Carol", "Lee", 28, "Female", LocalDate.of(1996, 7, 20), "Single", "Designer", false),
                new Person(UUID.randomUUID(), "David", "Brown", 38, "Male", LocalDate.of(1986, 1, 2), "Divorced", "Consultant", true),
                new Person(UUID.randomUUID(), "Eve", "Wilson", 35, "Female", LocalDate.of(1989, 9, 17), "Married", "Teacher", true),
                new Person(UUID.randomUUID(), "Frank", "Wright", 22, "Male", LocalDate.of(2002, 4, 30), "Single", "Intern", false)
        );
    }
}
