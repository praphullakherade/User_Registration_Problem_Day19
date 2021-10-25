package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name : ");
        String getLastName = sc.next();
        UC2 last = new UC2();
        last.lastName(getLastName);
    }
}
