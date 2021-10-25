package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone Number : ");
        String getUserInput = sc.next();
        UC4 phoneNumber = new UC4();
        phoneNumber.validate(getUserInput);
    }
}
