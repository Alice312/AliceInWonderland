package com.java.class5;
import java.util.Scanner;
public class ScannerClassExample {
    // Scanner class - To get user input in program (from keyboard)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1*num2);
    }
}
