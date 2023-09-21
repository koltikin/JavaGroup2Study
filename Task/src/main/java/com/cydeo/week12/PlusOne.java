package com.cydeo.week12;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num1 = {1,3,2};
        int[] num2 = {1,3,2,9};
        int[] num3 = {1,9,9,9};

        System.out.println(Arrays.toString(plus1(num1)));
        System.out.println(Arrays.toString(plus1(num2)));
        System.out.println(Arrays.toString(plus1(num3)));

    }

    private static int[] plus1(int[] num) {
        StringBuilder strNum = new StringBuilder();
        for (int i : num) {
            strNum.append(i);
        }
        int result = Integer.parseInt(strNum.toString())+1;
        return String.valueOf(result).chars()
                .map(Character::getNumericValue).toArray();
    }


}


