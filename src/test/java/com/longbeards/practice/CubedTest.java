package com.longbeards.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CubedTest {

    private static Cubed classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new Cubed();
    }

    @Test
    public void testCubed() {
//        Passed
        assertEquals(45, classUnderTest.findNb(1071225));
        assertEquals(-1, classUnderTest.findNb(24723578342962L));
        assertEquals(3568, classUnderTest.findNb(40539911473216L));
        assertEquals(2022, classUnderTest.findNb(4183059834009L));
        assertEquals(55100, classUnderTest.findNb(2304422822859502500L));
        assertEquals(4824, classUnderTest.findNb(135440716410000L));
        assertEquals(4788, classUnderTest.findNb(131443152397956L));
        assertEquals(53451, classUnderTest.findNb(2040702035069593476L));

//        Failed

        assertEquals(-1, classUnderTest.findNb(16));
        assertEquals(-1, classUnderTest.findNb(4));
        assertEquals(-1, classUnderTest.findNb(2304422822859502501L));
    }

}