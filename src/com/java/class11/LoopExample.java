package com.java.class11;
import java.util.Scanner;
public class LoopExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            if(i%3==0){
                System.out.println("*");
            }else{
                System.out.println(i);
            } i++;
        }
    }
}
