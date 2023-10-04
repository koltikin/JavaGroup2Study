package com.cydeo.week14;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class GreaterThenRightTest {
    @Test
    public void testFindGraterThanRight() {
        int[] inputArray = {0, 10, 4, 9, 6, 3, 5};
        int[] expectedOutput = {0,10, 9, 5};
        int[] actualOutput = GreaterThenRight.findGraterThanRight(inputArray);
        assertArrayEquals(expectedOutput, actualOutput);

        int[] inputArray1 = {-5, 15, 0, 10, 2, -2, 5};
        int[] expectedOutput1 = {-5,15, 10, 5};
        int[] actualOutput1 = GreaterThenRight.findGraterThanRight(inputArray1);
        assertArrayEquals(expectedOutput1, actualOutput1);
    }

    @Test
    public void testFindGraterThanRight1() {
        int[] inputArray = {0, 10, 4, 9, 6, 3, 5};
        int[] expectedOutput = {0,10, 9, 5};
        int[] actualOutput = GreaterThenRight.findGraterThanRight1(inputArray);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}