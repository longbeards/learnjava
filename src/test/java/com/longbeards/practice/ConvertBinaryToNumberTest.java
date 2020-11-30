package com.longbeards.practice;

import com.longbeards.practice.domain.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertBinaryToNumberTest {

    private static ConvertBinaryToNumber classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new ConvertBinaryToNumber();
    }

    @Test
    public void testGetDecimalValue() {
        ListNode twoAfterHead = new ListNode(1, null);
        ListNode oneAfterHead = new ListNode(0, twoAfterHead);
        ListNode head = new ListNode(1, oneAfterHead);

        assertEquals(5, classUnderTest.getDecimalValue(head));
    }

}