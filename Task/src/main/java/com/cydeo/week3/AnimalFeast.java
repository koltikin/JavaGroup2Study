package com.cydeo.week3;

import java.util.function.Predicate;

public class AnimalFeast {
    public static void main(String[] args) {

        boolean predicate = isAccepted("___  hello__", "h54hto");
        System.out.println("predicate = " + predicate);

        boolean predicate1 = isAccepted1("___  1hello__", "het98o");
        System.out.println("isAccepted1 = " + predicate1);
    }

//    Solution 1 ************************************
    public static boolean isAccepted(String animalName, String dishName) {
        String numbers = "0123456789";
        animalName = animalName.toLowerCase();
        dishName = dishName.toLowerCase();
        if (animalName.length() >= 2 && dishName.length() >= 2) {
            if (!(numbers.contains("" + animalName.charAt(0)) || numbers.contains("" + dishName.charAt(0)))) {
                if (!(numbers.contains("" + animalName.charAt(animalName.length() - 1)) || numbers.contains("" + dishName.charAt(dishName.length() - 1)))) {
                    if (dishName.charAt(0) == animalName.charAt(0) && dishName.charAt(dishName.length() - 1) == animalName.charAt(animalName.length() - 1)) {
                        return true;
                    } else return false;
                } else return false;
            } else return false;
        } else return false;
    }

    //    Solution 2 ************************************
    public static boolean isAccepted1(String animalName, String dishName) {
        animalName = animalName.toLowerCase().replace("_","").strip();
        dishName = dishName.toLowerCase().replace("_","").strip();
        if (animalName.length() >= 2 && dishName.length() >= 2) {
            animalName = animalName.charAt(0)+""+animalName.charAt(animalName.length()-1);
            dishName = dishName.charAt(0)+""+dishName.charAt(dishName.length()-1);
            Predicate<String> isStartWithNumber = c ->Character.isDigit(c.charAt(0));
            Predicate<String> isEndWithNumber = c ->Character.isDigit(c.charAt(1));
            boolean isContainNum =  (isStartWithNumber.test(animalName) && isStartWithNumber.test(dishName)
            && isEndWithNumber.test(animalName) && isEndWithNumber.test(dishName));
            return (!isContainNum && animalName.equals(dishName));

        } else return false;

    }

}
