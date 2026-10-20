package com.pluralsight;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String full_name = yourName(input);

        System.out.print("Enter your name: ");
        String fullName = input.nextLine().trim();

        int firstSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0, firstSpace);
        System.out.println("Your first name is: " + firstName);

        int secondSpace = fullName.indexOf(" ", firstSpace + 1);
        String middleName = "";
        String lastName;

        if (secondSpace != -1) {
            middleName = fullName.substring(firstSpace + 1, secondSpace);
            lastName = fullName.substring(secondSpace + 1);

            System.out.println("Your middle name is: " + middleName);
        } else {
            System.out.println("Middle name is : None");
            lastName = fullName.substring(firstSpace + 1);
        }
        System.out.println("Your last name is: " + lastName);
    }
}   //kaleab t. tsegaye