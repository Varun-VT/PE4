package com;

import java.util.Scanner;

public class FrequencyOfGivenCharater {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String s= scanner.nextLine();
        System.out.println("Enter the character");
        String q= scanner.nextLine();
        String s1= s.replace(q, "");
        System.out.println(s.length()- s1.length());
    }
}
