package com.java.class16;
//write a program to take one statement from user an find out number of words
//we have inside the statement

//Ex: Hello this is my first java string program
//output: 8

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] parts=str.split(" ");
        System.out.println(parts.length);
    }
}
