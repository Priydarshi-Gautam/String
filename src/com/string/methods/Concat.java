package com.string.methods;

 public class Concat {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str+10+20); // o/p- Java1020
        System.out.println(10+20+str); // o/p- 30Java
        System.out.println(10+str+20); // o/p- 10Java20
        System.out.println(str+20/5); // o/p-  Java4 using (BODMAS Rule)
        System.out.println(str+20*5); // o/p-  Java100 using (BODMAS Rule)
       // System.out.println(str+20-5); // o/p-  error

    }
}
