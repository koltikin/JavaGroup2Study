package com.cydeo.week14;

import java.util.*;

public class GreaterThenRight {
    public static void main(String[] args) {
        int[] num = {0,10,4,9,6,3,5};
        System.out.println(findGraterThanRight(num));
    }
    static Stack<Integer> findGraterThanRight(int[] num) {
        Stack<Integer> mystack = new Stack<>();
        for (int current : num) {
            if (!mystack.isEmpty() && mystack.peek()<current){
                mystack.pop();
            }
            mystack.push(current);

        }
            return mystack;

        }
    static int[] findGraterThanRight1(int[] num) {
        Stack<Integer> mystack = new Stack<>();
        mystack.push(num[num.length-1]);
        for (int i = num.length - 1; i >= 0; i--) {
            if (mystack.peek()<num[i]){
                mystack.push(num[i]);
            }

        }
        int[] result = new int[mystack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = mystack.pop();
        }
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
