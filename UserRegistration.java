package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String getFirstName = sc.next();
        UC1 first = new UC1();
        first.firstName(getFirstName);
    }
}
