package com.bridgelabz.basicregexproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorCodeValidator {

    public static boolean isVaid(String code){
        String regex = "^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex, code);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hex color code: ");
        String code = sc.nextLine();
        if(isVaid(code)){
            System.out.println("Vaid !");
        }else{
            System.out.println("Invalid !");
        }
    }
}
