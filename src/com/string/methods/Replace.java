package com.string.methods;

public class Replace {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String place = s.replace('l','L');

        System.out.println(place); //o/p- Hello, World!
        System.out.println(s.replaceFirst("l","P"));
        System.out.println(s.replaceAll("l","Y"));

    }
}
