package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email Id : ");
        String getEmail = sc.next();
        UC3 email = new UC3();
        email.email(getEmail);
    }
}
