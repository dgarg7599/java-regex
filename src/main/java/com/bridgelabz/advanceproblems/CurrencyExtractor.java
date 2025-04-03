package com.bridgelabz.advanceproblems;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing currency values:");
        String s = sc.nextLine();

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        if (currencyValues.isEmpty()) {
            System.out.println("No currency values found.");
        }
        else {
            System.out.println("Extracted currency values: ");
            for(int i=0; i< currencyValues.size() ; i++){
                System.out.print(currencyValues.get(i)+" ");
            }
        }
    }
}
