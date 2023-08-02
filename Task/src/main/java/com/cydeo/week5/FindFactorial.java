package com.cydeo.week5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFactorial {
    public static void main(String[] args) {

        System.out.println("factorial of 6 = " + findFactorial(6));
        System.out.println("factorial of 6 = " + findFac(6));
        System.out.println("factorial of 6 = " + factorial(6));

    }
    private static int findFactorial(int n) {
        if (n==1) {
            return 1;
        }else{
             return findFactorial(n-1)*n;
        }
    }

    public static int findFac(int n){
        return Stream.iterate(1, i->i+1).limit(n)
                .reduce(1, (x, y) -> x * y);
    }

    public static int findFac2(int n){
        return Stream.iterate(1, i->i<=n, i->i+1)
                .reduce(1, (x, y) -> x * y);
    }

    public static int factorial(int num){
        return IntStream.rangeClosed(1,num)
                .reduce( (a,b) -> a*b ).getAsInt();
    }
}



/*
Question-2 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer,
is multiplication of all positive integers smaller than or equal to n.
For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 */