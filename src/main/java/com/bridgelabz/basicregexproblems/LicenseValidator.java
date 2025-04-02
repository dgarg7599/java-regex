package com.bridgelabz.basicregexproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LicenseValidator {

    public static boolean isValid(String licensePlateNumber) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, licensePlateNumber);
    }

    public static void main(String[] args) {
        System.out.println("Enter your license plate number: ");
        Scanner sc = new Scanner(System.in);
        String licensePlateNumber = sc.nextLine();

        if(isValid(licensePlateNumber)) {
            System.out.println("Valid !");
        }else{
            System.out.println("Invalid !");
        }

    }
}
