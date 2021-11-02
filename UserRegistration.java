package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        String getUserInput = sc.next();
        UC6 uc6 = new UC6();
        uc6.validate(getUserInput);
    }
}
