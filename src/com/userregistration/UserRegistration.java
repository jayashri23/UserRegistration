package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);
    public  static void firstName(){

        System.out.println("Enter the First name:");
        String firstName =scanner.nextLine();
        if (Pattern.matches("[A-Z]{1}[a-z]{2}",firstName) == true){
            System.out.println("Valid First Name");
        }else {
            System.out.println("Not Valid First Name");
        }
    }
    public static void emailId(){
        System.out.println("Enter the Email Id :");
        String emailId = scanner.nextLine();
        //[a-z]{1,}[.]?[a-z]{1,}?[@][a-z]{1,}[\\.][a-z]{1,}.?[a-z]?$
        if(Pattern.matches("^[a-z+.]+@(.+)$",emailId)){
            System.out.println("Valid Email");
        }else {
            System.out.println("Not Valid Email");
        }
    }
    public static void mobileFormat(){
        System.out.println("Enter the Mobile number :");
        String mobilef = scanner.nextLine();
        //[a-z]{1,}[.]?[a-z]{1,}?[@][a-z]{1,}[\\.][a-z]{1,}.?[a-z]?$
        if(Pattern.matches("^[91]{2}\\s[0-9]{10}$",mobilef)){
            System.out.println("Valid Mobile Number ");
        }else {
            System.out.println("Not Valid Mobile Number");
        }
    }
    public static void passWord() {
        System.out.println("Enter the Password :");
        String passWord = scanner.nextLine();
        //[a-z]{1,}[.]?[a-z]{1,}?[@][a-z]{1,}[\\.][a-z]{1,}.?[a-z]?$
        if (Pattern.matches("^[A-Za-z0-9]{8,}$", passWord)) {
            System.out.println("Valid  Password ");
        } else {
            System.out.println("Not Valid Password ");
        }
    }
    public static void clearAllEmailSample() {
        System.out.println("Enter the  valid email :");
        String emailId = scanner.nextLine();
        //[a-z]{1,}[.]?[a-z]{1,}?[@][a-z]{1,}[\\.][a-z]{1,}.?[a-z]?$
        if (Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", emailId)) {
            System.out.println("Valid  Password ");
        } else {
            System.out.println("Not Valid Password ");
        }
    }

    public static void main(String[] args) {
        firstName();
        emailId();
        mobileFormat();
        passWord();
        clearAllEmailSample();
    }
}


