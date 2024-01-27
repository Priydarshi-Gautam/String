package com.string.programs;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 3, 2, 5, 6, 2, 7, 2, 8, 9, 2, 10, 2};

        int result = findMaxRepeatingNumber(numbers);

        System.out.println("The number repeating the maximum times is: " + result);
    }

    public static int findMaxRepeatingNumber(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int maxRepeatingNumber = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxRepeatingNumber = entry.getKey();
            }
        }

        return maxRepeatingNumber;
    }
}

