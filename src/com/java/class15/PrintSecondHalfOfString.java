package com.java.class15;
import java.util.Scanner;
public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(word.substring(word.length()/2));
        System.out.println(word.substring(word.length()/2+1));

    }
}
