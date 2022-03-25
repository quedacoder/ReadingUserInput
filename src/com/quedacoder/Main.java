package com.quedacoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        // validate user entered an int value
        boolean isInteger = scanner.hasNextInt();

        if (isInteger) {

            int yearOfBirth = scanner.nextInt();

            // after reading an integer from console next line needs to be called
            // to handle next line character
            scanner.nextLine();
            int ageOfUser =  2022 - yearOfBirth;

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            // validate year is in a valid range
            if (ageOfUser >= 1 && ageOfUser <= 100) {
                System.out.println("Your name is " + name + ", and you are " + ageOfUser + " years old!!");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}
