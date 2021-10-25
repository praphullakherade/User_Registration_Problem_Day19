package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name : ");
        String getFirstName = sc.next();
        UC2 first = new UC2();
        first.lastName(getFirstName);
    }
}
