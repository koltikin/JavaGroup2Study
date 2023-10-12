package com.cydeo.week14;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Roman {
    public static void main(String[] args) {

        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        String s4 = "MCDLXXVI";
//        System.out.println(romanToInt(s1));
//        System.out.println(romanToInt(s2));
//        System.out.println(romanToInt(s3));
        System.out.println(romanToInt1(s4));

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
    public static int romanToInt1(String s) {

        HashMap<Character, Integer> myMap = new HashMap<>();
        myMap.put('I',1);
        myMap.put('V',5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += myMap.get(arr[i]);
            if (i>0){
                if (myMap.get(arr[i])>myMap.get(arr[i-1])){
                    sum -= 2*myMap.get(arr[i-1]);
                }
            }
        }
        return sum;
    }


}
