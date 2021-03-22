package com.bridgelabz.userregistrationgradle;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationGradle {

    public static void firstName() {
        Scanner scan = new Scanner(System.in);
        String firstNameExp = "^[A-Z]{1}+[a-z]{2,}";
        System.out.print("Please enter you first name: ");
        String name = scan.next();
        if(Pattern.matches(firstNameExp, name))
            System.out.println("First Name you Entered is Valid");
        else
            System.out.println("First Name you entered is Invalid");
    }

    public static void lastName() {
        Scanner scan = new Scanner(System.in);
        String lastNameExp = "^[A-Z]{1}+[a-z]{2,}";
        System.out.print("Please enter you last name: ");
        String name = scan.next();
        if(Pattern.matches(lastNameExp, name))
            System.out.println("Last Name you Entered is Valid");
        else
            System.out.println("Last Name you entered is Invalid");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        firstName();
        lastName();
    }
}
