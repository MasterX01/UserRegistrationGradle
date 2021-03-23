package com.bridgelabz.userregistrationgradle;

import java.util.ArrayList;
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

    public static void email() {
        Scanner scan = new Scanner(System.in);
        String emailExp = "^([a-z0-9]+[-._+]*?[a-z0-9]+)+@[a-z0-9]+.[a-z]{2,4}.[a-z]{2,4}$";
        System.out.print("Please enter you Email: ");
        String email = scan.next();
        if(Pattern.matches(emailExp, email))
            System.out.println("The Email ID you Entered is Valid");
        else
            System.out.println("The Email ID you entered is Invalid");
    }

    public static void mobNum() {
        Scanner scan = new Scanner(System.in);
        String phoneExp = "[0-9]{2}\\s[0-9]{10}";
        System.out.print("Please enter you Phone Number: ");
        String phone = scan.nextLine();
        System.out.println(phone);
        if(Pattern.matches(phoneExp, phone))
            System.out.println("The Phone Number you Entered is Valid");
        else
            System.out.println("The Phone Number you entered is Invalid");
    }

    public  static void password() {
        Scanner scan = new Scanner(System.in);
        String passwordExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=[@#$%^&+=]*)(?=.{8,}).*$";
        System.out.print("Please enter your Password of choice: ");
        String password = scan.nextLine();
        System.out.println(password);
        if(Pattern.matches(passwordExp, password))
            System.out.println("The Password you Entered is Valid");
        else
            System.out.println("The Password you entered is Invalid");
    }

    public static void validateEmail(ArrayList<String> emails) {
        String emailExp = "^([a-z0-9]+[-._+]?[a-z0-9]+)@[a-z0-9-]+.[a-z]{2,4}.[a-z]{2,4}$";
        for (String mail : emails) {
            if (Pattern.matches(emailExp, mail))
                System.out.println("The Email ID: " + mail + " is Valid");
            else
                System.out.println("The Email ID: " + mail + " is Invalid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
//        firstName();
//        lastName();
//        email();
//        mobNum();
//        password();
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");
        validateEmail(emails);
    }

}
