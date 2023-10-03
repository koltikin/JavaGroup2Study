package com.cydeo.week14;

import java.util.*;

public class GreaterThenRight {
    public static void main(String[] args) {
        int[] num = {0,10,4,9,6,3,5};
        System.out.println(Arrays.toString(findGraterThanRight(num)));
    }

    private static int[] findGraterThanRight(int[] num) {
       Stack<Integer> resultStack = new Stack<Integer>();
        resultStack.push(num[0]);
        for (int i = 0; i < num.length-1; i++) {
            if (num[i+1]>num[i]){
                resultStack.push(num[i+1]);
            }
        }
        int[] newNum = new int[resultStack.size()];
        for (int i = newNum.length - 1; i >= 0; i--) {
            newNum[i] = resultStack.pop();
        }
        return newNum;
        }


    private static int[] findGraterThanRight1(int[] num) {
        int j = 1;
        for (int i = 0; i < num.length-1; i++) {
            if (num[i+1]> num[i]) {
                num[j] = num[i+1];
                j++;
            }
        }
        int[] result = new int[j];
        System.arraycopy(num, 0, result, 0, j);
        return result;
    }

}


/**

Week-14 Algo Questions
        Question-1 Find All Elements Greater Than Their Right
        Given an unsorted integer array, return all greater elements than all elements present to their right using
        Stack.
        Example:
        Input: [10, 4, 6, 3, 5]
        Output: [10, 6, 5]
        The elements that are greater than all elements to their right are 10, 6, and 5.
*/
