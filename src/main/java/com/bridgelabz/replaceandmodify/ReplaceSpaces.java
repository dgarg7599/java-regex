package com.bridgelabz.replaceandmodify;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text with multiple spaces: ");
        String inputString = sc.nextLine();

        String outputString = replaceMultipleSpaces(inputString);
        System.out.println("Text with single spaces: " + outputString);
    }


    // method to find and replace one or more whitespace characters
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
