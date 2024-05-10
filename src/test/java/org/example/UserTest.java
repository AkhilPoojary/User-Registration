package org.example;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
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
    public void emailVarification(String email2)
    {
        assertTrue(email2.matches(User.email));
    }

    @ParameterizedTest
    @ValueSource(strings={"akhil#@gmail.com","sunil@gmail.com12","RAKSHITH@GMAIL.COM","1rama003@gmail.com.in","abc@1.com","prajwal*-12@gmail.com.in12","akhil003@gmail.com.com","abc+100@gmail.com"})
    public void emailVarificationMultiVlaue(String email2)
    {
        assertTrue(email2.matches(User.email));
    }
}