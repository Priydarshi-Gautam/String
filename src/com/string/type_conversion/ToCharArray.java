package com.string.type_conversion;

public class ToCharArray {
    public static void main(String[] args) {
        String str= "hello";
        char[] charArray = str.toCharArray();
        System.out.println(charArray.getClass().getTypeName());
    }
}
