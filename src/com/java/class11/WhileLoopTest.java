package com.java.class11;
import java.util.Scanner;
public class WhileLoopTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int i=1;
        int a=10;
        while(i<=limit/2){
            System.out.println(i);
            System.out.println(a);
            i++;
            a--;
        }
    }
}
