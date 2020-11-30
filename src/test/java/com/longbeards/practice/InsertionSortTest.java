package com.longbeards.practice;

import com.longbeards.practice.domain.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InsertionSortTest {
    private static InsertionSort classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new InsertionSort();
    }

    @Test
    public void testInsertionSort() {
        ListNode four = new ListNode(3);
        ListNode three = new ListNode(1, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(4, two);

        classUnderTest.insertionSortList(one);

        assertEquals(1, one.val);
        assertEquals(2, one.next.val);
        assertEquals(3, one.next.next.val);
        assertEquals(4, one.next.next.next.val);


        ListNode five = new ListNode(0);
        four = new ListNode(4, five);
        three = new ListNode(3, four);
        two = new ListNode(5, three);
        one = new ListNode(-1, two);
        classUnderTest.insertionSortList(one);
        assertEquals(-1, one.val);
        assertEquals(0, one.next.val);
        assertEquals(3, one.next.next.val);
        assertEquals(4, one.next.next.next.val);
        assertEquals(5, one.next.next.next.next.val);

        assertNull(classUnderTest.insertionSortList(null));
    }

//    @Test
//    public void testInsertionSort1() {
//        ListNode four = new ListNode(3);
//        ListNode three = new ListNode(1, four);
//        ListNode two = new ListNode(2, three);
//        ListNode one = new ListNode(4, two);
//
//        classUnderTest.insertionSortList1(one);
//
//        assertEquals(1, one.val);
//        assertEquals(2, one.next.val);
//        assertEquals(3, one.next.next.val);
//        assertEquals(4, one.next.next.next.val);
//
//
//        ListNode five = new ListNode(0);
//        four = new ListNode(4, five);
//        three = new ListNode(3, four);
//        two = new ListNode(5, three);
//        one = new ListNode(-1, two);
//        classUnderTest.insertionSortList1(one);
//        assertEquals(-1, one.val);
//        assertEquals(0, one.next.val);
//        assertEquals(3, one.next.next.val);
//        assertEquals(4, one.next.next.next.val);
//        assertEquals(5, one.next.next.next.next.val);
//
//        assertNull(classUnderTest.insertionSortList1(null));
//    }

    @Test
    public void testInsertionSortArray() {
        int[] numArray = {3, 1, 2, 4};
        int[] retArray = classUnderTest.insertSortArray(numArray);

        assertEquals(1, retArray[0]);
        assertEquals(2, retArray[1]);
        assertEquals(3, retArray[2]);
        assertEquals(4, retArray[3]);

        numArray = new int[]{-1, 5, 3, 4, 0};
        retArray = classUnderTest.insertSortArray(numArray);
        assertEquals(-1, retArray[0]);
        assertEquals(0, retArray[1]);
        assertEquals(3, retArray[2]);
        assertEquals(4, retArray[3]);
        assertEquals(5, retArray[4]);
    }

    @Test
    public void testInsertionSortFor() {
        int[] numArray = {3, 1, 2, 4};
        int[] retArray = classUnderTest.insertSortFor(numArray);

        assertEquals(1, retArray[0]);
        assertEquals(2, retArray[1]);
        assertEquals(3, retArray[2]);
        assertEquals(4, retArray[3]);

        numArray = new int[]{-1, 5, 3, 4, 0};
        retArray = classUnderTest.insertSortFor(numArray);
        assertEquals(-1, retArray[0]);
        assertEquals(0, retArray[1]);
        assertEquals(3, retArray[2]);
        assertEquals(4, retArray[3]);
        assertEquals(5, retArray[4]);
    }
}