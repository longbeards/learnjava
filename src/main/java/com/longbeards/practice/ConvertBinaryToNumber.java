package com.longbeards.practice;

import com.longbeards.practice.domain.ListNode;

public class ConvertBinaryToNumber {
    public int getDecimalValue(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode temp = head;
        stringBuilder.append(temp.val);
        while (temp.next != null) {
            temp = temp.next;
            stringBuilder.append(temp.val);
        }
        Integer blah = Integer.parseInt(stringBuilder.toString(), 2);
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}
