package com.cydeo.week5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharacter {
    public static void main(String[] args) {
        
        String str = "success";
        var uniqueChar = findFirstUniqueCharacter(str);
        System.out.println("uniqueChar = " + uniqueChar);

    }

    private static char findFirstUniqueCharacter(String str) {
        Map<String, List<String>> result = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s));

//        System.out.println("result.keySet().toString() = " + result);
//        System.out.println(result.values());

        int indexOfUniqueChr = result.values().stream()
                        .filter(list->list.size()==1)
                        .map(s->str.indexOf(s.get(0)))
                        .min(Integer::compare).get();
        return str.charAt(indexOfUniqueChr);

    }
}


/*
Question-3 First Unique Character
Write a function that returns the first non-repeated character from a string. 
If all characters are repeated return a space character.
EXAMPLE: Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character
*/