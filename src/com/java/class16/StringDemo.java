package com.java.class16;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="Hello";
        StringBuffer sBuffer =new StringBuffer("Hello");
        sBuffer.reverse();
        //string buffer uses the buffer mechanism to protect data
        //from being access and update simultaneouly, soi ts a thread-safe

        StringBuilder sBuilder=new StringBuilder("Hello");
        sBuilder.reverse();
        //doesn't have buffer mechanism so its faster than StringBuffer


    }
}
