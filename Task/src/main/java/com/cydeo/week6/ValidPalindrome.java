package com.cydeo.week6;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        var s = "Do *geese +see God?";
        var t= "Was -it a / car or a cat -I saw?";
        var v = "A brown fox jumping over";
        System.out.println("s = "+ isValidPalindrome(s));
        System.out.println("t = "+ isValidPalindrome(t));
        System.out.println("v = "+ isValidPalindrome2(v));
    }

    private static boolean isValidPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int j = s.length();
        char[] new_s = new char[j];
        for (char c : s.toCharArray()) {
            new_s[j-1] = c;
            j--;
        }
        return Arrays.equals(new_s, s.toCharArray());
    }

    private static boolean isValidPalindrome2(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}
