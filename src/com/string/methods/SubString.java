package com.string.methods;

public class SubString {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String substring = s.substring(2,8);
        String sub = s.substring(2,s.length()-2);

        System.out.println(substring);//o/p - llo, w (return string)


        System.out.println(s.subSequence(2,7)); //o/p - llo, worl (return char)
    }

}
