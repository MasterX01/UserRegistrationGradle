package com.bridgelabz.userregistrationgradle;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IUserRegistrationGradle {
    String compare(String regex, String input);
}

public class UserRegistrationGradle {

    IUserRegistrationGradle lambdaCompare = ((regex, input) ->
    {
        try {
            if (Pattern.matches(regex, input))
                return "HAPPY";
        } catch (Exception e) {
            try {
                throw new UserRegistrationException("Invalid Input");
            } catch (UserRegistrationException userRegistrationException) {
                userRegistrationException.printStackTrace();
            }
        }
        return "SAD";
    });

    public String validateFirstName(String fname) {
        String firstNameExp = "^[A-Z]{1}+[a-z]{2,}";
        return lambdaCompare.compare(firstNameExp, fname);
    }

    public String validateLastName(String lname) {
        String lastNameExp = "^[A-Z]{1}+[a-z]{2,}";
        return lambdaCompare.compare(lastNameExp, lname);

    }

    public String validateEmail(String email) {
        String emailExp = "^([a-z0-9]+[-._+]?[a-zA-Z0-9]+)+@[a-z0-9]+.[a-z]{2,3}.[a-z]{2,3}$";
        return lambdaCompare.compare(emailExp, email);
    }

    public String validateMobNum(String phone) {
        String phoneExp = "[0-9]{2}\\s[0-9]{10}";
        return lambdaCompare.compare(phoneExp, phone);
    }

    public String validatePassword(String password) {
        String passwordExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=.*[@#$%^&+=])(?=.{8,}).*$";
        return lambdaCompare.compare(passwordExp, password);
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

    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to User Registration Program");
        UserRegistrationGradle obj = new UserRegistrationGradle();
        //obj.takeInput();
    }

}
