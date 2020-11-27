package com.longbeards.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AreTheySameTest {

    private static AreTheySame classUndertest;

    @BeforeAll
    public static void setUp() {
        classUndertest = new AreTheySame();
    }

    @Test
    public void testAreTheySame_Arrays() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        assertTrue(classUndertest.areArraysSame(a, b));

        a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertFalse(classUndertest.areArraysSame(a, b));

        a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
        b = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025};
        assertTrue(classUndertest.areArraysSame(a, b));

    }

    @Test
    public void testAreTheySameB_Arrays() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        assertTrue(classUndertest.areArraysSameB(a, b));

        a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertFalse(classUndertest.areArraysSameB(a, b));

        a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
        b = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025};
        assertTrue(classUndertest.areArraysSameB(a, b));

    }
}