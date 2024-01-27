package com.string.programs;

public class Reverse {
    public static void main(String[] args) {

        // method 1 using toCharArray() method

        String st ="Akash";
        char[] c = st.toCharArray();
        for (int i =st.length()-1; i>=0; i--)
        {

            System.out.print(c[i]);

        }
        System.out.println("---------------------------------------------");

        // method 2 using CharAt() method

        String str ="Priyanshu";
        String reverse="";
        for (int i =str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);

        }
        System.out.println(reverse);


    }
}
