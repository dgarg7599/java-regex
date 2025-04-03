package com.bridgelabz.advanceproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidator {

    public static boolean isValid(String cardNumber) {
        String visaPattern = "^4\\d{15}$";
        String masterCardPattern = "^5\\d{15}$";

        return Pattern.matches(visaPattern, cardNumber) || Pattern.matches(masterCardPattern, cardNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String cardNumber = sc.nextLine();

        if(isValid(cardNumber)) {
            System.out.println("Valid Visa or MasterCard number.");
        }else{
            System.out.println("Invalid Visa or MasterCard number.");
        }
    }
}
