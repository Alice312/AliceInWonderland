package com.java.class8;

import java.util.Scanner;

public class MaximumOutOfThreeNumbers {
    public static void main(String[] args) {
       System.out.println("Write your three numbers below:");
       Scanner sc=new Scanner(System.in);
       int num1=sc.nextInt(), num2=sc.nextInt(), num3= sc.nextInt();
       if(num1>num2 && num1>num3){
           System.out.println(num1 + "is greatest!");
       }else if(num2>num3){
           System.out.println(num2);
       }else{
           System.out.println(num3);
       }
    }
}
