package com.cydeo.week5;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(findMax(array));

    }

    private static int findMax(int[] array) {
        return Arrays.stream(array)
                .max().getAsInt();

    }


}

//
//        Question-1 Find Max from int Array
//        Write a function that can find the maximum number from an int Array.
//        input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9