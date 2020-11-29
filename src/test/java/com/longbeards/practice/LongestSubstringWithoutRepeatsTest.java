package com.longbeards.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatsTest {

    private static LongestSubstringWithoutRepeats classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new LongestSubstringWithoutRepeats();
    }

    @Test
    public void testLongestSubstring() {
        assertEquals(3, classUnderTest.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, classUnderTest.lengthOfLongestSubstring("bbbb"));
        assertEquals(3, classUnderTest.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, classUnderTest.lengthOfLongestSubstring(""));
        assertEquals(14, classUnderTest.lengthOfLongestSubstring("mitpxltadcsyzdszbpwnfojodbqnhduvnplmagpdljcknwmqokdtaohfpzsyemwsbjecpthcdjpsibkwnqpneyswxl"));
        assertEquals(13, classUnderTest.lengthOfLongestSubstring("jwdqpsnedjrchdndmudtpqtaqlmczxkitpakjoonzfpjkemwyqpqilsywecxbohwdignywczetioyvlyncqvnjvmpaj"));
        assertEquals(12, classUnderTest.lengthOfLongestSubstring("fertoeqnmcovigfbfesviallcaelwbrcfkxvoojbsxyaffbkluftuteztkmslfwqqtmgjxhbwhecphmaduuapazillaw"));
    }

}