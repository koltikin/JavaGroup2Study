package com.cydeo.week4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HighLow {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5")); // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5")); // return "9 -5"
    }

    private static String highAndLow(String s) {
        String[] numbers = s.split(" ");
        int maxNum = Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt).max().getAsInt();
        int minNum = Arrays.stream(numbers)
                .mapToInt(Integer::parseInt).min().getAsInt();
        return maxNum + " " + minNum;
    }

}
