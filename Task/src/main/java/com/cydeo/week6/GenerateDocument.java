package com.cydeo.week6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateDocument {
    public static void main(String[] args) {
        String charList = "world hello am I ziya";
        String document = "hello world I am ziya";
        System.out.println(checkMakeDoc(document, charList));
        System.out.println(checkMakeDoc2(document, charList));
    }

    public static boolean checkMakeDoc(String document, String charList) {
        Map<String, Long> charMap = Arrays.stream(charList.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//                System.out.println("charMap = " + charMap);

        Map<String, Long> docMap = Arrays.stream(document.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//              System.out.println("docMap = " + docMap);

        for (String s : docMap.keySet()) {
            System.out.println(s);
            if (!charMap.containsKey(s) || !(charMap.get(s)>=docMap.get(s))) {
//                System.out.println(charMap.get(s));
                return false;
            }
        }
        return true;
    }

    public static boolean checkMakeDoc2(String document, String charList) {
        HashMap<Character,Integer> charMap = new HashMap<>();

        for (int i = 0; i < charList.length(); i++) {
            char charChar = charList.charAt(i);
            charMap.put(charChar,charMap.getOrDefault(charChar,0)+1);
        }
        for (int j = 0; j < document.length() ; j++) {
            char docChar = document.charAt(j);
            if (!charMap.containsKey(docChar)||charMap.get(docChar)==0) return false;
            charMap.put(docChar,charMap.get(docChar)-1);
        }
        return true;
    }
}
