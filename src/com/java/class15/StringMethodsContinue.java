package com.java.class15;
public class StringMethodsContinue {
    public static void main(String[] args) {
       String str1="I go to DevX School";
        String [] words= str1.split("  ");
        System.out.println(words[0]+words[1]+words[2]+words[3]+words[4]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);

        //or
        for(int i=0; i<=4; i++){
            System.out.println(words[i]);
        }
        // or
        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);

    }
       String str3="Welcom hi";
        System.out.println(str3.length());
        System.out.println(str3.substring(0,5));
        System.out.println(str3.substring(5));
      /////////////////////////////////////////////
        String str2="SOM 100 SOM 200 SOM 300";
        System.out.println(str2.replaceAll("[A-Z]", " "));
}}
