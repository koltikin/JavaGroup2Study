package com.cydeo.week6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s = "he l87lo_7|world!3&*";
        String t = "wor87 ldhello_7|!3&*";
        System.out.println(isAnagram2(s,t));
    }
    private static boolean isAnagram(String s, String t) {
        var result_s = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        var result_t = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
        return result_s.equals(result_t);
    }

    private static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),0)+1);
//            System.out.println(s.charAt(i));
        }
        return sMap.equals(tMap);
    }

    private static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.put(c,sMap.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            if (!sMap.containsKey(c)) return false;
            sMap.put(c,sMap.get(c)-1);
            if (sMap.get(c) == 0) return false;
        }
        return sMap.isEmpty();
    }



}
