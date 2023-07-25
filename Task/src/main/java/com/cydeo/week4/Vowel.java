package com.cydeo.week4;

public class Vowel {
    public static void main(String[] args) {
        String inputStr = "hello world";
        int result = findNoneRepeatingVowel(inputStr);
        System.out.println(result);
    }
    private static int findNoneRepeatingVowel(String inputStr) {
        if (inputStr != null && !inputStr.isEmpty()) {
            int[] vowelCount = new int[5];
            for (int i = 0; i < inputStr.length(); i++) {
                if (inputStr.charAt(i) == 'a') {
                    vowelCount[0] += 1;
                } else if (inputStr.charAt(i) == 'e') {
                    vowelCount[1] += 1;
                } else if (inputStr.charAt(i) == 'i') {
                    vowelCount[2] += 1;
                } else if (inputStr.charAt(i) == 'o') {
                    vowelCount[3] += 1;
                }else if (inputStr.charAt(i) == 'u') {
                    vowelCount[4] += 1;
                }
            }
            for (int i = 0; i < inputStr.length(); i++){
                if (inputStr.charAt(i) == 'a' && vowelCount[0] ==1) {
                    return i;
                }else if(inputStr.charAt(i) == 'e' && vowelCount[1] ==1){
                    return i;
                }else if(inputStr.charAt(i) == 'i' && vowelCount[2] ==1){
                    return i;
                }else if(inputStr.charAt(i) == 'o' && vowelCount[3] ==1){
                    return i;
                }else if(inputStr.charAt(i) == 'u' && vowelCount[4] ==1){
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
}
