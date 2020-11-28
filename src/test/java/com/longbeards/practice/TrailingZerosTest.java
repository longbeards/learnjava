package com.longbeards.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrailingZerosTest {
    @Test
    public void testZeros() throws Exception {
        assertEquals(TrailingZeros.zeros(0), 0);
        assertEquals(TrailingZeros.zeros(6), 1);
        assertEquals(TrailingZeros.zeros(14), 2);

        assertEquals(TrailingZeros.zeros(14), 2);
        assertEquals(TrailingZeros.zeros(30), 7);
        assertEquals(TrailingZeros.zeros(100), 24);
    }
}