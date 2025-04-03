package com.bridgelabz.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtract {

   public static void extractEmail(String email){
       String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(email);

       while(m.find()){
           System.out.println(m.group());
       }
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to extract emails from: ");
        String email = input.nextLine();

        extractEmail(email);
    }
}
