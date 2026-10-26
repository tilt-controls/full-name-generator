package com.pluralsight;
import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        boolean hasMiddleName = false;

        System.out.println("Hi, please enter your name!");

        // Ask first name
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();
        fullName = firstName;

        // Ask middle name
        System.out.println("Middle name: ");
        String middleName = scanner.nextLine();
        if (middleName.length() > 0){
        middleName = middleName.trim();
        fullName = firstName + middleName;
        hasMiddleName = true;}
        else {
            hasMiddleName = false;
        }

        // Ask last name
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();
        fullName = firstName + middleName + lastName;

        // Ask suffix, if there is suffix then add comma
        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();
        if (suffix.length() > 0 && hasMiddleName == true) {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix; }
        else if (hasMiddleName == false && suffix.length() > 0) {
            fullName = firstName + " " + lastName + " " + suffix;
        } else if (hasMiddleName == true) {
            fullName = firstName + " " + middleName + " " + lastName;
        } else {
            fullName = fullName = firstName + " " + lastName;
        }

        System.out.println("Full name: " + fullName);
    }
}
