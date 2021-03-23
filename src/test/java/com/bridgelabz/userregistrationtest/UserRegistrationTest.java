package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistrationgradle.UserRegistrationGradle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();

    //Starts First Name Test Cases
    @Test
    public void givenFirstName_whenValid_ReturnHappy() {
        String validationResult = userRegistrationGradle.validateFirstName("Akash");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenFirstName_whenLessThanThreeLetters_ReturnSad() {
        String validationResult = userRegistrationGradle.validateFirstName("Ak");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenFirstName_whenFirstLetterNotCaps_ReturnSad() {
        String validationResult = userRegistrationGradle.validateFirstName("akash");
        Assertions.assertEquals("SAD", validationResult);
    }

    //Starts Last Name Use Cases
    @Test
    public void givenLastName_whenValid_ReturnHappy() {
        String validationResult = userRegistrationGradle.validateLastName("Saxena");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenLastName_whenLessThanThreeLetters_ReturnSad() {
        String validationResult = userRegistrationGradle.validateLastName("Sa");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenLastName_whenFirstLetterNotCaps_ReturnSad() {
        String validationResult = userRegistrationGradle.validateLastName("saxena");
        Assertions.assertEquals("SAD", validationResult);
    }

    //Starts Email Test Cases
    @Test
    public void givenEmail_whenValid_ReturnHappy() {
        String validationResult = userRegistrationGradle.validateEmail("aakashsaxena14@gmail.com");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenEmail_whenStartsWithSpecialChar_ReturnSad() {
        String validationResult = userRegistrationGradle.validateEmail("-akash14@gmail.com");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenEmail_whenAtTheRateIsNotGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validateEmail("aakashsaxena14gmail.com");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenEmail_whenTLDIsNotGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validateEmail("aakashsaxena14@gmail");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenEmail_whenTwoSpecialCharsAreUsedConsecutively_ReturnSad() {
        String validationResult = userRegistrationGradle.validateEmail("aakash-.saxena14@gmail.com");
        Assertions.assertEquals("SAD", validationResult);
    }

    //Starts Phone Number Test Cases
    @Test
    public void givenPhoneNumber_whenValid_ReturnHappy() {
        String validationResult = userRegistrationGradle.validateMobNum("91 8947018302");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenPhoneNumber_whenSpaceAfterCountryNotGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validateMobNum("918947018302");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenPhoneNumber_whenPhoneNumberLengthIsMoreThanTen_ReturnSad() {
        String validationResult = userRegistrationGradle.validateMobNum("91 89470183022");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenPhoneNumber_whenCountryCodeIsNotGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validateMobNum(" 8947018302");
        Assertions.assertEquals("SAD", validationResult);
    }

    //Starts Password Test Cases
    @Test
    public void givenPassword_whenValid_ReturnHappy() {
        String validationResult = userRegistrationGradle.validatePassword("aK@shS@xena16");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenPassword_whenNoNumberIsGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validatePassword("aK@shS@xena");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenPassword_whenNoSpecialCharIsGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validatePassword("aKashSaxena16");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenPassword_whenNoCapitalCharIsGiven_ReturnSad() {
        String validationResult = userRegistrationGradle.validatePassword("akash@saxena16");
        Assertions.assertEquals("SAD", validationResult);
    }

    @Test
    public void givenPassword_whenLengthIsLessThanEight_ReturnSad() {
        String validationResult = userRegistrationGradle.validatePassword("aKa$h1");
        Assertions.assertEquals("SAD", validationResult);
    }

    @ParameterizedTest
    
}
