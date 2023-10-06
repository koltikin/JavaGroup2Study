package com.cydeo.week14;

import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {

        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        String s4 = "MCDLXXVI";
//        System.out.println(romanToInt(s1));
//        System.out.println(romanToInt(s2));
//        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));

        char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    }
    public static int romanToInt(String s) {

        HashMap<Character, Integer> rMap = new HashMap<>();
        rMap.put('I',1);
        rMap.put('V',5);
        rMap.put('X',10);
        rMap.put('L',50);
        rMap.put('C',100);
        rMap.put('D',500);
        rMap.put('M',1000);
        char[] arr = s.toCharArray();
        int sum = 0;
        int prevValue = 0;
        for (int i = arr.length - 1; i >=0; i--) {
            if (rMap.get(arr[i])<prevValue){
                sum -= rMap.get(arr[i]);
            }else {
                sum += rMap.get(arr[i]);
            }
            prevValue = rMap.get(arr[i]);
        }
        return sum;

    }

}
