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
    public static void main(String[] args) {
        firstName();
    }
}


