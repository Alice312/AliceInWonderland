package com.java.class8;
import java.util.Scanner;
public class Divisibilityby5Or3 {
    public static void main(String[] args) {
        System.out.println("Enter any number to check if its divisible below:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number that is divisible by 5");
        int num1=sc.nextInt();
        System.out.println("Enter any number that is divisible by 3");
        int num2= sc.nextInt();
        if(num1%5==0){
            System.out.println("This number is divisible!");
        }if(num2%3==0){
            System.out.println("This number is divisible!");
        }else{
            System.out.println("This is not a divisible number!");}}}
