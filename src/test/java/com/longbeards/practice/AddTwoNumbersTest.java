package com.longbeards.practice;

import com.longbeards.practice.domain.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AddTwoNumbersTest {
    private static AddTwoNumbers classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new AddTwoNumbers();
    }

    @Test
    public void testAddTwoNumbers() {
        ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        // 564
        ListNode l6 = new ListNode(4);
        ListNode l5 = new ListNode(6, l6);
        ListNode l4 = new ListNode(5, l5);

        ListNode expectedN3 = new ListNode(8, null);
        ListNode expectedN2 = new ListNode(0, expectedN3);
        ListNode expectedN1 = new ListNode(7, expectedN2);

        ListNode resultNode = classUnderTest.addTwoNumbers(l1, l4);
        assertNotNull(resultNode);
        assertTrue(expectedN1.val == resultNode.val);
        assertTrue(expectedN2.val == resultNode.next.val);
        assertTrue(expectedN3.val == resultNode.next.next.val);
    }

    @Test
    public void testMore() {
        int[] arr1 = {9};
        int[] arr2 = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        ListNode l1 = createListNodes(arr1);
        ListNode l2 = createListNodes(arr2);
        ListNode l3 = classUnderTest.addTwoNumbers(l1, l2);
        assertNotNull(l3);
    }

    private ListNode createListNodes(int[] arr1) {
        ListNode blahNode = new ListNode();
        ListNode temp = blahNode;
        for (int i = 0; i < arr1.length; i++) {
            temp.val = arr1[i];
            if (i != arr1.length - 1) {
                ListNode blahNode1 = new ListNode();
                temp.next = blahNode1;
                temp = blahNode1;
            }
        }
        return blahNode;
    }
}