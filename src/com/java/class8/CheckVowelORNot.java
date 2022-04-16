package com.java.class8;
import java.util.Scanner;
public class CheckVowelORNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Write any character below to check if its a vowel or not:");
        char c=sc.next().charAt(0);
        if(c=='a'|| c=='e'|| c=='o'||c=='i'||c=='u'){
        System.out.println("This character is a vowel");
    }else{
            System.out.println("This character is not a vowel");
        }}}
