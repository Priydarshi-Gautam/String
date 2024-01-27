package com.string.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public void maxRepeatingElementUsingMap(int [] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }


        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();

        int maxCount = 0;
        int element =arr[0];
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            int count = entry.getValue();
            if(maxCount<count){
                maxCount = count;
                element = entry.getKey();
            }
        }
        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCount);
    }
    public static void main(String[] args) {
        int [] arr = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
        Test m = new Test();
        m.maxRepeatingElementUsingMap(arr);
    }
}