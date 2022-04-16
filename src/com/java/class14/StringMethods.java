package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1="DevX";
        String str2= "Devx";
        String str3= "Welcome to DevX";
        // Compares the two to check if its equal
        System.out.println(str1.equals(str2));
        //Checks two and ignores the case sensitiveness
        System.out.println(str1.equalsIgnoreCase(str2));
        //Checks if one string contains another. It will be false because str 3 too long
        System.out.println(str1.contains(str3));
        // This would be true because str 3 contains DevX word just like Str1
        System.out.println(str3.contains(str1));
        // Changing the case of String
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
         // this will make both of the strings to be written in same case
        System.out.println(str3.toLowerCase().contains(str2.toLowerCase()));

         str1="";
         str2="     ";
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());

        str1="Welcome User";
        str2="DevX";
        System.out.println(str1.replace("User", str2));

    }
}
