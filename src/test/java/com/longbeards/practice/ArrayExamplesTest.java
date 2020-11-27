package com.longbeards.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayExamplesTest {

    private static ArrayExamples classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new ArrayExamples();
    }

    @Test
    public void test_NumberAppearingOddTimes() {
        int[] intArray = {4, 3, 4, 5, 6, 5, 4, 6, 3};
        int returnNumber = classUnderTest.findNumberAppearingOddTimesInArray(intArray);
        assertEquals(5, classUnderTest.findNumberAppearingOddTimesInArray(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(-1, classUnderTest.findNumberAppearingOddTimesInArray(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, classUnderTest.findNumberAppearingOddTimesInArray(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, classUnderTest.findNumberAppearingOddTimesInArray(new int[]{10}));
        assertEquals(1, classUnderTest.findNumberAppearingOddTimesInArray(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
        assertEquals(10, classUnderTest.findNumberAppearingOddTimesInArray(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(4, returnNumber);
    }

    @Test
    public void test_findIt() {
        int[] intArray = {4, 3, 4, 5, 6, 5, 4, 6, 3};
        int returnNumber = classUnderTest.findIt(intArray);
        assertEquals(5, classUnderTest.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(-1, classUnderTest.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, classUnderTest.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, classUnderTest.findIt(new int[]{10}));
        assertEquals(1, classUnderTest.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
        assertEquals(10, classUnderTest.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(4, returnNumber);
    }

}