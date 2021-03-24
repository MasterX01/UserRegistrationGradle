package com.bridgelabz.userregistrationgradle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationGradle {

    public String validateFirstName(String fname) {
        String firstNameExp = "^[A-Z]{1}+[a-z]{2,}";
        if(Pattern.matches(firstNameExp, fname))
            return "HAPPY";
        else
            return "SAD";
    }

    public String validateLastName(String lname) {
        String lastNameExp = "^[A-Z]{1}+[a-z]{2,}";
        if(Pattern.matches(lastNameExp, lname))
            return "HAPPY";
        else
            return "SAD";
    }

    public String validateEmail(String email) {
        String emailExp = "^([a-z0-9]+[-._+]?[a-zA-Z0-9]+)+@[a-z0-9]+.[a-z]{2,3}.[a-z]{2,3}$";
        if(Pattern.matches(emailExp, email))
            return "HAPPY";
        else
            return "SAD";
    }

    public String validateMobNum(String phone) {
        String phoneExp = "[0-9]{2}\\s[0-9]{10}";
        if(Pattern.matches(phoneExp, phone))
            return "HAPPY";
        else
            return "SAD";
    }

    public String validatePassword(String password) {
        String passwordExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=.*[@#$%^&+=])(?=.{8,}).*$";
        if(Pattern.matches(passwordExp, password))
            return "HAPPY";
        else
            return "SAD";
    }

    public void takeInput() {
        Scanner scan = new Scanner(System.in);
        // First Name
        System.out.print("Please enter you first name: ");
        String fname = scan.next();
        validateFirstName(fname);

        // Last Name
        System.out.print("Please enter you last name: ");
        String lname = scan.next();
        validateLastName(lname);

        // Email
        System.out.print("Please enter you Email: ");
        String email = scan.next();
        validateEmail(email);

        // Phone Number
        System.out.print("Please enter you Phone Number: ");
        String phone = scan.nextLine();
        validateMobNum(phone);

        // Password
        System.out.print("Please enter your Password of choice: ");
        String password = scan.nextLine();
        validatePassword(password);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        UserRegistrationGradle obj = new UserRegistrationGradle();
        //obj.takeInput();
    }

}
