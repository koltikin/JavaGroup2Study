package com.cydeo.week14;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class GreaterThenRightTest {
    @Test
    public void testFindGraterThanRight() {
        int[] inputArray = {0, 10, 4, 9, 6, 3, 5};
        Stack<Integer> expectedOutput = new Stack<>();
        expectedOutput.push(10);
        expectedOutput.push(9);
        expectedOutput.push(6);
        expectedOutput.push(5);
        Stack<Integer> actualOutput = GreaterThenRight.findGraterThanRight(inputArray);
        assertEquals(expectedOutput,actualOutput);

    }

    @Test
    public void testFindGraterThanRight1() {
        int[] inputArray = {0, 10, 4, 9, 6, 3, 5};
        int[] expectedOutput = {10, 9, 6,5};
        int[] actualOutput = GreaterThenRight.findGraterThanRight1(inputArray);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}