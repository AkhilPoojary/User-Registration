package org.example;

public class User {
    public	static String firstName="^[A-Z][a-z]{3,}$";
    public	static String lastName="^[A-Z][a-z]{3,}$";
    public	static String email="[a-z]+\\.[a-z]+@[a-z]{2,}\\.[a-z]{2,}\\.[a-z]{2,3}$";
    public	static String mobile="[0-9]{2}\\s[0-9]{10}";
    public	static String password="^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$";

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first name");

        String firstNamen=sc.next();

        if(firstNamen.matches(firstName))
        {
            System.out.println();
        }
        else
            throw new InvalidNameException();

        System.out.println("enter the last name");

        String lastName=sc.next();

        System.out.println("enter the email");

        String email=sc.next();

        System.out.println("enter the password");

        String password=sc.next();

    }
}
