package com.bridgelabz.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatesExtract {

    public static void extractDate(String text){
        String regex = ("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to extract from: ");
        String text = input.nextLine();
        extractDate(text);
    }
}
