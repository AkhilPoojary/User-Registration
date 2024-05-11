package org.example;


import org.exception.InValidFirstNameException;
import org.exception.InvalidEmailException;
import org.exception.InvalidMobileNumberException;
import org.exception.InvalidPasswordException;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class User {
    public static String firstName = "^[A-Z][a-z]{3,}$";
    public static String lastName = "^[A-Z][a-z]{3,}$";
    public static String email = "^[a-z]+[+\\.-]*[0-9]*@[a-z]*[0-9]*\\.[a-z]*[0-9]*[@]*[a-z]*[\\.]*[a-z]*$";
    public static String mobile = "[0-9]{2}\\s[0-9]{10}";
    public static String password = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$";

    public void validFirstName(String firstNamen) throws InValidFirstNameException {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the first name");
//
//        String firstNamen = sc.next();

        if (firstNamen.matches(firstName)) {
            System.out.println("valid data");
        } else
            throw new InValidFirstNameException();
    }

    public void validLastName() throws InvalidNameException {
        System.out.println("enter the last name");

        Scanner sc = new Scanner(System.in);

        String lastNamen = sc.next();

        if (lastNamen.matches(lastName)) {
            System.out.println("valid data");
        } else
            throw new InvalidNameException();
    }

    public void validEmail(String emailn) throws InvalidEmailException {
//        System.out.println("enter the email");
//
//        Scanner sc=new Scanner(System.in);
//
//        String emailn=sc.next();

        System.out.println(emailn);

        if (emailn.matches(email)) {
            System.out.println("valid data");
        } else
            throw new InvalidEmailException("invalid email");
    }


    public void validatePassword(String password) throws InvalidPasswordException {
//        System.out.println("enter the password");
//
//        Scanner sc = new Scanner(System.in);/
//
//        String passwordn = sc.next();
        System.out.println(password);
        if (password.matches(User.password)) {
            System.out.println("valid data");
        } else
            throw new InvalidPasswordException("invalid password");
    }

    public void validatePhoneNumber(String mobileNumn) throws InvalidMobileNumberException {
//        System.out.println("enter the mobile number");
//
//        Scanner sc=new Scanner(System.in);

//         mobileNumn=sc.next();

        if (mobileNumn.matches(mobile)) {
            System.out.println("valid number");
        } else
            throw new InvalidMobileNumberException("invalid mobile number");
    }


}



