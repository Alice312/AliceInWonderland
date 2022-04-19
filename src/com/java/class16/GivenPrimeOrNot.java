package com.java.class16;
import java.util.Scanner;
public class GivenPrimeOrNot {
    public static void main(String[] args) {
        //write a program to check given number is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Write any number:");
        int num= sc.nextInt();
        int count=0;
    for(int i=1; i<=num; i++) {
        if (num % i == 0) {
            count++;}}
        if(count==2){
            System.out.println(num+ " is a Prime Number!");
        }else{
            System.out.println(num+" is not a Prime Number!");}}}
