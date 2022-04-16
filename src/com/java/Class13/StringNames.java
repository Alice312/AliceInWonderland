package com.java.Class13;

import java.util.Scanner;

public class StringNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Mango = "Fruit";
        String Papaya = "Fruit";
        String Apple = new String("Fruit");
        if (Mango == Papaya) {
            System.out.println(true);
        }if (Papaya == Apple) {
            System.out.println(true);
        }if (Mango.equals(Apple)) {
            System.out.println(true);
        } else {
            System.out.println(false);}}}
