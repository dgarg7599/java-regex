package com.bridgelabz.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordExtract {

    public static void extractCapitalizedWord(String sentence){
        String regex = "[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to extract from: ");
        String sentence = input.nextLine();
        extractCapitalizedWord(sentence);
    }
}
