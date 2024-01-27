package com.string.programs;

import java.util.HashMap;
import java.util.Map;

public class FindMaxRepeatChar {

    public static void main(String[] args) {
        String st = "Akasssh";
        char[] c = st.toCharArray();
        Map<Character,Integer> hm = new HashMap<>();
        for (char ch : c)
        {
            if (hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }

        }
        int maxcount = 0;
        char maxchar =' ';
        for (Map.Entry<Character,Integer> e : hm.entrySet())
        {
            if(e.getValue()>maxcount)
            {
               maxcount= e.getValue();
               maxchar=e.getKey();
            }

        }
        System.out.println("Max repeated characters = " +maxchar +" -> "+ maxcount + " times repeated");
    }
}
