package org.example;

import org.exception.InValidFirstNameException;
import org.exception.InvalidEmailException;
import org.exception.InvalidMobileNumberException;
import org.exception.InvalidPasswordException;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
   User user=new User();

    @Test
    public void firstNameSad() {

        assertTrue("akhil".matches(User.firstName));
    }
    @Test
    public void firstNameHappy() {
        assertTrue("Akhil".matches(User.firstName));
    }

    @Test
    public void lastNameSad() {

        assertTrue("poojary".matches(User.lastName));
    }
    @Test
    public void lastNameHappy() {
        assertTrue("Poojary".matches(User.lastName));
    }

    @Test
    public void mobileSad() {

        assertTrue("901234567898".matches(User.mobile));
    }
    @Test
    public void mobileHappy() {
        assertTrue("90 1234567898".matches(User.mobile));
    }
    @Test
    public void emailSad() {

        assertTrue("abc.cykj@gmail.com".matches(User.email));
    }
    @Test
    public void emailHappy() {
        assertTrue("abc.xyz@bl.co.in".matches(User.email));
    }
    @Test
    public void passwordHappy() {

        assertTrue("bj!#A12w".matches(User.password));
    }
    @Test
    public void passwordSad() {
        assertTrue("njdA@".matches(User.password));
    }

    @ParameterizedTest
    @ValueSource(strings={"abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc.100@abc.com.au","abc@1.com","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    public void emailVerification(String email2)
    {
        assertTrue(email2.matches(User.email));
    }

    @ParameterizedTest
    @ValueSource(strings={"akhil#@gmail.com","sunil@gmail.com12","RAKSHITH@GMAIL.COM","1rama003@gmail.com.in","abc@1.com","prajwal*-12@gmail.com.in12","akhil003@gmail.com.com","abc+100@gmail.com"})
    public void emailVerificationMultiValue(String email2)
    {
        assertTrue(email2.matches(User.email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"akhil@#poojary", "Ramesh@gamil.com"})
    public void testInvalidEmailException(String email) throws InvalidEmailException {
        assertThrows(InvalidEmailException.class,()->user.validEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"0008w38", "1313187"})
    public void testInvalidPasswordException(String password) throws InvalidPasswordException {

        assertThrows(InvalidPasswordException.class,()->user.validatePassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings={"91 6362264367","1799909897979"})
    public void testInvalidMobileNumberException(String phoneNumber)
    {
assertThrows(InvalidMobileNumberException.class,()->user.validatePhoneNumber(phoneNumber));
    }

    @ParameterizedTest
    @ValueSource(strings={"bkhila","sunilaa","bvnb"})
    public void testInvalidFirstNameException(String firstName)
    {
        assertThrows(InValidFirstNameException.class,()->user.validFirstName(firstName));
    }
}


