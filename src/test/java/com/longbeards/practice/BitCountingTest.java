package com.longbeards.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitCountingTest {

    private static BitCounting classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new BitCounting();
    }

    @Test
    public void testBitCounting() {
        int returnText = classUnderTest.bitCounting(1024);
        assertEquals(1, returnText);
        assertEquals(5, classUnderTest.bitCounting(1234));
    }

    @Test
    public void testBitCount() {
        assertEquals(1, classUnderTest.bitCount(1024));
        assertEquals(5, classUnderTest.bitCounting(1234));
    }

}