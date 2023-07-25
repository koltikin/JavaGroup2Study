package com.cydeo.week4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dermatoglyphics {
    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram(""));
    }

    private static boolean isIsogram(String str) {
        String[] inputStr = str.split("");
        long numOfDistinctStr = Arrays.stream(inputStr)
        .distinct().count();
        return str.length() == numOfDistinctStr;
    }
}
