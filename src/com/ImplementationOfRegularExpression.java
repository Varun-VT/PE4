package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementationOfRegularExpression {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("se");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            String s= matcher.group();
            System.out.println("Found At:"+matcher.start()+ " "+matcher.end());
        }

    }
}
