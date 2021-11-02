package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        String getUserInput = sc.next();
        UC5 uc5 = new UC5();
        uc5.validate(getUserInput);
    }
}
