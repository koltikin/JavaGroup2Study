package com.cydeo.week5;

public class FindFactorial {
    public static void main(String[] args) {

        System.out.println("factorial of 6 = " + findFactorial(6));

    }
    private static int findFactorial(int n) {
        if (n==1) {
            return 1;
        }else{
             return findFactorial(n-1)*n;
        }
    }
}



/*
Question-2 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer,
is multiplication of all positive integers smaller than or equal to n.
For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 */