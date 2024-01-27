package com.string.buffer;

public class Replace {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello, world!");
        StringBuffer ok = buffer.replace(1, 4, "ok");
        System.out.println(ok);
        String str ="hhhhlol";
        String[] as = str.split("a", 2);
        System.out.println(as);
    }
}
