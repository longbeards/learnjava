package com.longbeards.practice;

import com.longbeards.practice.domain.ListNode;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public ListNode insertionSortList(ListNode head) {
        List<Integer> integers = new ArrayList<>();
        ListNode temp = head;
        if (temp == null ) {
            return null;
        }

        do {
            integers.add(temp.val);
            temp = temp.next;
        } while (temp != null);

        int[] arrInts = insertSortArray(integers.stream().mapToInt(i -> i).toArray());
        temp = head;
        for (int arrInt : arrInts) {
            temp.val = arrInt;
            temp = temp.next;
        }
        return head;
    }

    public int[] insertSortArray(int[] numArray) {
        for (int i = 1; i < numArray.length; i++) {
            int j = i;
            while (j > 0 && (numArray[j - 1] > numArray[j])) {
                int swap = numArray[j];
                numArray[j] = numArray[j - 1];
                numArray[j - 1] = swap;
                j--;
            }
        }
        return numArray;
    }

    public int[] insertSortFor(int[] numArray) {
        for (int i = 1; i < numArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numArray[j - 1] > numArray[j]) {
                    int swap = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = swap;
                }
            }
        }
        return numArray;
    }

//    public ListNode insertionSortList1(ListNode head) {
//        ListNode dummy = new ListNode();
//        ListNode curr = head;
//
//        while (curr != null) {
//            // At each iteration, we insert an element into the resulting list.
//            ListNode prev = dummy;
//
//            // find the position to insert the current node
//            while (prev.next != null && prev.next.val < curr.val) {
//                prev = prev.next;
//            }
//
//            ListNode next = curr.next;
//            // insert the current node to the new list
//            curr.next = prev.next;
//            prev.next = curr;
//
//            // moving on to the next iteration
//            curr = next;
//        }
//
//        return dummy.next;
//    }
}
