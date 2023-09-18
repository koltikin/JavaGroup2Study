package com.cydeo.week12;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num  = 64;

        System.out.println(powerOf2(num));
    }

    private static boolean powerOf2(int num) {
        int n = 1;
        while (num>=n) {
            if (num == n) return true;
            n *= 2;
        }
        return false;
    }
}
