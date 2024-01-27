package com.string.methods;

public class Equals {
    public static void main(String[] args) {
        String str1 = "Akash";
        String str2 = "Akash";
        System.out.println(str1.equals(str2));// it will print boolean values
        // it compares contents(values)  not memory address

        String st3 = new String("Akash");
        System.out.println(st3==str2);

    }
}
