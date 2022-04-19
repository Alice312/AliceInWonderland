package com.java.class16;
//write a program to take one String from user and print
// occurrence of given char in String
//input: this is my java program!
//output-3

public class FindOccuranceofChar {
    public static void main(String[] args) {
        String str="This is my java program!";
        char c='a';
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }

        }
        System.out.println(count);
    }
}
