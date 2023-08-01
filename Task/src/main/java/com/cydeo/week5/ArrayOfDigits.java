package com.cydeo.week5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayOfDigits {
    public static void main(String[] args) {
        var input = 4901;
        System.out.println(Arrays.toString(getIntArray(input)));
    }
    private static int[] getIntArray(int input) {
        return Arrays.stream(Integer.toString(input).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

//        Question-5 Array of Digits
//        How to convert a positive int to an array of digits.
//        Input: 490 Output: [4, 9, 0] (as int Array)