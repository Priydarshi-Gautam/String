package com.string.programs;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {

        //Scanner original= new Scanner(System.in);
        //System.out.println("Enter a string");
        //String original = sc.nextLine();


        String original = "mam";
       String reverse = "";
       for (int i=original.length()-1;i>=0;i--)
       {
           reverse=reverse+original.charAt(i);
       }
       if (original.equals(reverse))
       {
           System.out.println(original+" is a polindrome");
       }
       else
       {
           System.out.println("not a polindrome");
       }
    }
}
