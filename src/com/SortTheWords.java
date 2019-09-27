package com;

import java.util.*;

public class SortTheWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        String[] arr= str.split(" ");
        List<String> list= new ArrayList<>();
        list= Arrays.asList(arr);
        Collections.sort(list);
        for (String q: list) {
            System.out.println(q);
        }
    }
}
