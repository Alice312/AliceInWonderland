package com.java.class11;
import java.util.Scanner;
public class Hw3PrintNumberNotDivisible3AndDivisible7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number amount to print below:");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            if(i%3!=0) {
                System.out.println(i);
            }else if(i%7==0){
                System.out.println(i);
            }i++;}}}
