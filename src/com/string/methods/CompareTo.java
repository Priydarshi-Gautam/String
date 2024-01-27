package com.string.methods;

public class CompareTo {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "A";
        System.out.println(str1.compareTo(str2));// o/p= 32 (97-65)

        // comprareTo method used unicode to compare strings and then substract them
        // like this (97-65 = 32)


    }

}
