package com.java.class5;
import java.util.Scanner;
public class IfElseCondition4 {
    public static void main(String[] args) {
        System.out.println("12");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
