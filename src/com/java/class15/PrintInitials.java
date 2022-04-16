package com.java.class15;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write your full name");
        String fullName=sc.nextLine();
        String [] parts=fullName.split(" ");
        String firstName=parts[0];
        String middleName=parts[1];
        String lastName=parts[2];
        System.out.println(firstName.charAt(0) + "." + middleName.charAt(0)+"." + lastName.charAt(0));



    }
}
