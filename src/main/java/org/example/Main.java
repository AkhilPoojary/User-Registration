package org.example;

import org.exception.InvalidEmailException;

public class Main {
    public static void main(String[] args) throws InvalidEmailException {
        System.out.println("Hello world!");

        User user=new User();

        user.validEmail("ZAkhil@gmail.com");
        user.validEmail("abc@yahoo.com");
//        user.validFirstName("akhil");
    }


}