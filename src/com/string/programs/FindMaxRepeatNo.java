package com.string.programs;

import java.util.HashMap;
import java.util.Map;

public class FindMaxRepeatNo {
    int [] arr = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
    public void setMaxRepeat(int[] arr)
    {

    }

    public static void main(String[] args) {
        Map<Integer,Integer> hm = new HashMap<>();

    for(Integer i:hm.keySet())
    {
        if (hm.containsKey(i))
        {
            hm.put(i, i.intValue() +1);
        }
        else
        {
            hm.put(i,1);
        }
    }
    int max =0;
    int maxkey =0;
    for(Map.Entry<Integer,Integer> e :hm.entrySet())
    {
        if (e.getValue()>max)
        {
            max=e.getValue();
            maxkey=e.getKey();

        }
    }
        System.out.println("max repeated no = "+ max);

    }
}
