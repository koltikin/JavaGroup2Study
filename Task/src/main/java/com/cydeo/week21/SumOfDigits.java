package com.cydeo.week21;

public class SumOfDigits {
    public static void main(String[] args) {
        int num1 = 132189;
        int num2 = 493193;
        System.out.println(sumOfDigits(num1));
        System.out.println(sumOfDigits1(num2));


    }

    private static int sumOfDigits(int num) {
        if (num<=0) return num;
        if (num<10)return num;
        else {int sum = Integer.toString(num).chars()
                .map(Character::getNumericValue).reduce(Integer::sum).getAsInt();
            return sumOfDigits(sum);
        }
    }
    private static int sumOfDigits1(int num) {
        if (num<=0) return num;
        if (num<10)return num;
        else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sumOfDigits(sum);
        }
    }
}


/** Question-2 Sum of Digits
        Given n, take the sum of the digits of n, if that value has more than one digit, continue reducing in this way until
        a single-digit number is produced.
        Examples:
        16 -> 1 + 6 = 7
        942 -> 9 + 4 + 2 = 15 à 1 + 5 à 6
        132189 -> 1 + 3 + 2 + 1 + 8 + 9 + 24 à 2 + 4 = 6
        493193 -> 4 + 9 + 3 + 1 + 9 + 3 = 29 à 2 + 9 = 11 à 1 + 1 = 2
        Constraints: The input will be a non-negative integer.
        Please, try to test your solution via JUnit.
*/