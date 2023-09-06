package com.cydeo.week10;

import java.util.Arrays;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "ABC";
        System.out.println(titleToNumber1(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int numberValue = c - 64; // 'A" = 65, 'B' = 66 ............ 'Z' = 90
            result = result * 26 + numberValue;// 1=> 0*26+1 = 1, 2=> 1*26+2 = 28, 3=> 28*26+3 = 731;
        }
        return result;
    }

    public static int titleToNumber1(String columnTitle) {
        char[] charArray =columnTitle.toCharArray();
        int[] arr  = new int[columnTitle.length()];

        for (int i = 0; i < columnTitle.length(); i++) {
            arr[i] = charArray[i]-64;
        }
        int result = Arrays.stream(arr).reduce(0,(a,b)->26*a+b);

        return result;
    }

}



/**
 Question-2 Excel Sheet Column Number
 Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 For example:
 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26 AA -> 27 AB -> 28 ...
 Example 1:
 Input: columnTitle = "A"
 Example 2:
 Input: columnTitle = "AB"
 Example 3:
 Input: columnTitle = "ZY"
 Constraints:
 Output: 1 Output: 28 Output: 701
 1 <= columnTitle.length <= 7
 columnTitle consists only of uppercase English letters. columnTitle is in the range ["A", "FXSHRXW"].
 */