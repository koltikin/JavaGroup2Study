package com.cydeo.week4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMain {

        public static void main(String[] args) {
            String inputString = "abcdabcd";

            int result = countDistinctChar(inputString);
            System.out.println(result);
        }

        private static int countDistinctChar(String inputString) {
            inputString = inputString.toLowerCase();
            String[] newInputStr = inputString.split("");
            Map<String, List<String>> groupedStr = Arrays.stream(newInputStr) // convert it to stream
                    .collect(Collectors.groupingBy(String::valueOf));

            System.out.println("groupedStr = " + groupedStr);

            long count = groupedStr.values().stream().filter(l->l.size()>=2).count();
            return (int)(count);
        }

    }

