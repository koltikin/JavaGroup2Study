package com.cydeo.week4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDoubledChar {
        public static void main(String[] args) {
            String inputString = "Indivisibilities";
            int result = countDistinctChar(inputString);
            System.out.println(result);
        }
        private static int countDistinctChar(String inputString) {
            inputString = inputString.toLowerCase();
            String[] newInputStr = inputString.split("");
            Map<String, List<String>> groupedStr = Arrays.stream(newInputStr)
                    .collect(Collectors.groupingBy(String::valueOf));

            int count = 0;
            for (String key : groupedStr.keySet()) {
                int value = groupedStr.get(key).size();
                if (value >= 2){
                    count++;
                }
            }
            return count;
        }

    }
