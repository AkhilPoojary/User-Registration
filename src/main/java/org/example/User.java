package org.example;


import org.exception.InvalidEmailException;
import org.exception.InvalidMobileNumberException;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class User {
    public	static String firstName="^[A-Z][a-z]{3,}$";
    public	static String lastName="^[A-Z][a-z]{3,}$";
    public	static String email="^[a-z]+[+\\.-]*[0-9]*@[a-z]*[0-9]*\\.[a-z]*[0-9]*[@]*[a-z]*[\\.]*[a-z]*$";
    public	static String mobile="[0-9]{2}\\s[0-9]{10}";
    public	static String password="^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$";

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first name");

        String firstNamen=sc.next();

        if(firstNamen.matches(firstName))
        {
            System.out.println("valid data");
        }
        else
            throw new InvalidNameException();

        System.out.println("enter the last name");

        String lastNamen=sc.next();

        if(lastNamen.matches(lastName))
        {
            System.out.println("valid data");
        }
        else
            throw new InvalidNameException();

        System.out.println("enter the email");

        String emailn=sc.next();

        if(emailn.matches(email))
        {
            System.out.println("valid data");
        }
        else
            throw new InvalidEmailException("invalid email");

        System.out.println("enter the password");

        String passwordn=sc.next();

        if(passwordn.matches(password))
        {
            System.out.println("valid data");
        }
        else
            throw new InvalidEmailException("invalid password");

        System.out.println("enter the mobile number");

        String mobileNumn=sc.next();

        if(mobileNumn.matches(mobile))
        {
            System.out.println("valid number");
        }
        else
            throw new InvalidMobileNumberException("invalid mobile number");

    }
}
