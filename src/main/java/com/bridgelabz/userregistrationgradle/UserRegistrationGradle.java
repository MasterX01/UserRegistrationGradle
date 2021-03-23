package com.bridgelabz.userregistrationgradle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationGradle {

    public String validateFirstName(String fname) throws Exception {
        String firstNameExp = "^[A-Z]{1}+[a-z]{2,}";
        try {
            if (Pattern.matches(firstNameExp, fname))
                return "HAPPY";
        } catch (Exception e){
            throw new UserRegistrationException("Invalid User First Name");
        }
        return "SAD";
    }

    public String validateLastName(String lname) throws Exception{
        String lastNameExp = "^[A-Z]{1}+[a-z]{2,}";
        try {
            if (Pattern.matches(lastNameExp, lname))
                return "HAPPY";
        }catch (Exception e) {
            throw new UserRegistrationException("Invalid User Last Name");
        }
        return "SAD";
    }

    public String validateEmail(String email) throws Exception{
        String emailExp = "^([a-z0-9]+[-._+]?[a-zA-Z0-9]+)+@[a-z0-9]+.[a-z]{2,3}.[a-z]{2,3}$";
        try {
            if (Pattern.matches(emailExp, email))
                return "HAPPY";
        }catch (Exception e) {
            throw new UserRegistrationException("Invalid User Email");
        }
        return "SAD";
    }

    public String validateMobNum(String phone) throws Exception{
        String phoneExp = "[0-9]{2}\\s[0-9]{10}";
        try {
            if (Pattern.matches(phoneExp, phone))
                return "HAPPY";
        }catch (Exception e) {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
        return "SAD";
    }

    public String validatePassword(String password) throws Exception{
        String passwordExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=.*[@#$%^&+=])(?=.{8,}).*$";
        try {
            if (Pattern.matches(passwordExp, password))
                return "HAPPY";
        }catch (Exception e){
            throw new UserRegistrationException("Invalid Password");
        }
        return "SAD";
    }

    public void takeInput() throws Exception{
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
