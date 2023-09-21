package com.cydeo.week8;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 8,3,0,0 ,12,0,8,0};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }

    private static int[] moveZeros(int[] nums) {

        var noZeroNums = Arrays.stream(nums).filter(i->i!=0).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (i<noZeroNums.length) {
                nums[i] = noZeroNums[i];
            } else nums[i]= 0;
        }
        return nums;
        }
    }





//Question-1 Move Zeroes
//        Week-08 Algo Questions
//        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non- zero elements.
//        Note that you must do this in-place without making a copy of the array.
//        Example 1:
//        Input: nums = [0, 1, 0, 3, 12]
//        Example 2: Input: nums = [0]
//        Constraints:
//        • 1 <= nums.length <= 104
//        • -231 <= nums[i] <= 231 - 1
//        Output: [1, 3, 12, 0, 0] Output: [0]
//        Follow up: Could you minimize the total number of operations done?