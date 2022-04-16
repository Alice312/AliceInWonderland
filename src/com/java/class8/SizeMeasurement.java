package com.java.class8;
import java.util.Scanner;
public class SizeMeasurement {
    public static void main(String[] args) {
        System.out.println("Write your T-shirt size in inches to get your American size measurement:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size>27 && size<30){
         System.out.println("This is size XS.");
        }else if(size>31 && size<34){
            System.out.println("This is size S.");
        }else if(size>35 && size<38){
            System.out.println("This is size L.");
        }else if(size>39 && size<42){
            System.out.println("This is size XL.");
        }else if(size>45 && size<50){
            System.out.println("This is size XXL.");
        }else{
            System.out.println("Please ask for measurement assistance!");
        }}}
