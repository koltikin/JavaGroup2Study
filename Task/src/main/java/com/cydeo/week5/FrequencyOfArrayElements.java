package com.cydeo.week5;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class FrequencyOfArrayElements {
    public static void main(String[] args) {

        var strArray = new String[]{"Apple", "Banana", "apple", "Cherry", "Apple"};

        var frequencyMap = findFrequency(strArray);
        System.out.println(frequencyMap);
    }
    private static Map<String,Long> findFrequency(String[] strArray) {
        return Arrays.stream(strArray)
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
    }
}

/*

Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.

EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
*/