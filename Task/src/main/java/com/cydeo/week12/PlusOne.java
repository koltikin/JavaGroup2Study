package com.cydeo.week12;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num1 = {1,3,2};
        int[] num2 = {1,3,2,9};
        int[] num3 = {9,9,9,9};

        System.out.println(Arrays.toString(plus1(num1)));
        System.out.println(Arrays.toString(plusOne(num2)));
        System.out.println(Arrays.toString(plusOne(num3)));


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

    private static int[] plusOne(int[] num) {
        String strNum = "";
        for (int i : num) {
            strNum += i;
        }
        String result = String.valueOf(Integer.parseInt(strNum)+1);
        char[] resultArr = result.toCharArray();
        int[] newNum = new int[resultArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            newNum[i] = Character.getNumericValue(resultArr[i]);
        }
            return newNum;
        }



}


