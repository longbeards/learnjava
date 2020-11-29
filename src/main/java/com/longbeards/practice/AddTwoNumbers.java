package com.longbeards.practice;

import com.longbeards.practice.domain.ListNode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public void printNodeValues(ListNode node) {
        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.println(tempNode.val);
            tempNode = tempNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        printNodeValues(l1);
        printNodeValues(l2);

        StringBuilder str1 = new StringBuilder();
        ListNode temp = l1;
        str1.append(temp.val);
        while (temp.next != null) {
            str1.append(temp.next.val);
            temp = temp.next;
        }
        String string1 = str1.reverse().toString();
        StringBuilder str2 = new StringBuilder();
        temp = l2;
        str2.append(temp.val);
        while (temp.next != null) {
            str2.append(temp.next.val);
            temp = temp.next;
        }
        String string2 = str2.reverse().toString();

        BigInteger sum = new BigInteger(string1).add(new BigInteger(string2));
        String sumStr = String.valueOf(sum);

        String[] strings = sumStr.split("");
        ListNode finalNode = new ListNode();
        ListNode tempNode = finalNode;
        for (int i = strings.length - 1; i >= 0; i--) {
            tempNode.val = Integer.parseInt(strings[i]);
            if (i != 0) {
                ListNode newNode = new ListNode();
                newNode.next = null;
                tempNode.next = newNode;
                tempNode = newNode;
            }
        }

        return finalNode;
    }
}
