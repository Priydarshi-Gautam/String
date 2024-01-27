package com.string.methods;

public class CompareToIgnore {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "A";
        System.out.println(str1.compareToIgnoreCase(str2));
        //  now compareTo method is ignored by default .
    }
}
