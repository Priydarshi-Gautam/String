package com.string.buffer;

public class Append {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Akash");
        sb.setCharAt(2,'b');

        System.out.println(sb);
        System.out.println(sb.length());
    }
}
