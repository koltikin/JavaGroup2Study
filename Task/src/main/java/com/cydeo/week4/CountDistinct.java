package com.cydeo.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDistinct {
    public static void main(String[] args) {
        String inputString = "abcdabcd";

        int result = countDistinctChar(inputString);
        System.out.println(result);
    }

    private static int countDistinctChar(String inputString) {
        inputString = inputString.toLowerCase();
        // convert inputString to String[]
        String[] newInputStr = inputString.split("");
        //group them by value and collect to map
        Map<String, List<String>> groupedStr = Arrays.stream(newInputStr) // convert it to stream
                .collect(Collectors.groupingBy(s->s));
        long count = groupedStr.values().stream().filter(l->l.size()>=2).count();
        // iterate the map, check and count the char
//        int count = 0;
//         List<String> detail = new ArrayList<>();
//        for (String key : groupedStr.keySet()) {
//            int value = groupedStr.get(key).size();
//            if (value >= 2){
//                count++;
//                detail.add("'" + key + "'" + " occurred " + value + " times");
//            }
//        }
//          System.out.println(groupedStr);
//        return count + " # -> : " + detail
        return (int)(count);
    }

}


/*
Question-1 Count the number of Duplicated Chars
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once. "aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`) "indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice. "aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.

*/
