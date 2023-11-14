package com.cydeo.week15;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class AlterCase {
    public static void main(String[] args) throws IOException {

        String inputPath = "Task/src/main/java/com/cydeo/week15/test.txt";
        String outputPath = "Task/src/main/java/com/cydeo/week15/result.txt";
        changeCase(inputPath,outputPath);

    }

    private static void changeCase(String inputPath, String outputPath) throws IOException {

        FileReader fileReader = new FileReader(inputPath);
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fileWriter= new FileWriter(outputPath);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        int i; // 0 for lower 1 for upper
        String line;
        while ((line = reader.readLine())!=null){
            String[] chars = line.split("");
            i = 1;// 1 for upper, 0 for lower
            for (String s : chars) {
                if (s.toLowerCase().equals(s.toUpperCase())){
                    writer.write(s);
                    continue;
                }
                if (i == 1) {
                    writer.write(s.toUpperCase());
                    i = 0;
                }else {
                    writer.write(s.toLowerCase());
                    i = 1;
                }
            }
            writer.newLine();
        }

        // close reader and writer
        reader.close();
        fileReader.close();
        writer.close();
        fileWriter.close();

    }

}


/**
 Question-2 Alter Case
 Given a path of input file which includes sentence(s), write a program that reads alternates the case of every
 alphabetic character, starting with uppercase. Spaces and non-alphabetical characters should be added to the
 final output as is, i.e. they should not be taken into account when alternating between upper/lowercase.
 Input: Your program should read lines from file as a standard input. Each line contains a sentence. Assume all
 characters are ASCII.
 Output: For each sentence from standard input, return a string which contains a sentence in each line such that
 the first character is uppercase, the next character is lowercase and so on.
 Test 1
 Test Input: We are the world
 Expected Output: We ArE tHe WoRlD
 Test 2
 Test Input: this is some code
 Expected Output: ThIs Is SoMe CoDe
 Please, try to test your solution via JUnit.
 */