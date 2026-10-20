package com.pluralsight;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String full_name = yourName(input);

        int firstSpace = full_name.indexOf(" ");

        String firstName = full_name.substring(0,firstSpace);
        System.out.println("Your first name is: " + firstName);

        int secondSpace = full_name.indexOf(".");

        String middleName = full_name.substring(firstSpace, secondSpace + 1);
        System.out.println("Your middle name is: " + middleName) ;

        String lastName = full_name.substring(secondSpace + 1);
        System.out.println("Your last name is: " + lastName );
        //kaleab t. tsegaye

    }

    public static String yourName(Scanner input){
        System.out.print("Enter your name here: ");
        String name = input.nextLine();
        return name.trim();

    }
}
