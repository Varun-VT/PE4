package com;

import java.util.Scanner;

public class ReplaceDwithF {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String s= scanner.nextLine();
        String s1= s.replace("d","f").replace("l","t");
        System.out.println(s1);
    }
}
