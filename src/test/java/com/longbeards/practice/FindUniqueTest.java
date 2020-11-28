package com.longbeards.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueTest {

    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUnique.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUnique.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(3.0, FindUnique.findUniq(new double[]{4.0, 4.0, 4.0, 3.0, 4.0, 4.0, 4.0, 4.0}), precision);
        assertEquals(0.55, FindUnique.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }), precision);
    }

    @Test
    public void testFindUniqArr() {
        assertEquals(1.0, FindUnique.findUniqArr(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUnique.findUniqArr(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(3.0, FindUnique.findUniqArr(new double[]{4.0, 4.0, 4.0, 3.0, 4.0, 4.0, 4.0, 4.0}), precision);
        assertEquals(0.55, FindUnique.findUniqArr(new double[]{ 0, 0, 0.55, 0, 0 }), precision);
    }

}