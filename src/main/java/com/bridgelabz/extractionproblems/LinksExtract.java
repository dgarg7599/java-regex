package com.bridgelabz.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinksExtract {

    public static void extractLinks(String text){
        String regex = "https?://[a-zA-Z0-9._~:/?#@!$&'()*+,;=%-]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to extract from: ");
        String text = sc.nextLine();
        extractLinks(text);
    }
}
