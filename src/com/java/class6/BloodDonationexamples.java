package com.java.class6;
import java.util.Scanner;
public class BloodDonationexamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println("Enter your weight");
        int weight= sc.nextInt();
        if(age>=18){
                System.out.println("You are eligible");
                if(weight>=50){
                System.out.println("You are eligible");
                }else if(age<=18) {
                    System.out.println("You are not eligible");
                }else if(weight<=50){
                    System.out.println("You are under weight");
                }
        }}}
