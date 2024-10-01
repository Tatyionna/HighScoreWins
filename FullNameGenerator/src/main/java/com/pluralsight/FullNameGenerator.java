package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner motherBoard = new Scanner(System.in);

        System.out.println("Enter Full Name");
        System.out.println("First Name: ");
        String firstName = motherBoard.next();


        System.out.println("Enter Middle Name: ");
        String middleName = motherBoard.next();

        System.out.println("Enter Last Name: ");
        String lastName = motherBoard.next();

        System.out.println("Enter Suffix: ");
        String suffixName = motherBoard.next();

        System.out.println(firstName.trim());
        System.out.println(lastName.trim());











    }
}
