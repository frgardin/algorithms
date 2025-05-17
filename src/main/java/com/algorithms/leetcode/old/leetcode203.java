package com.algorithms.leetcode.old;

import com.algorithms.linkedlist.ListNode;

public class leetcode203 {

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode l, r;

        l = head;
        r = head.next;

        while (r != null) {
            if (l.val == val) {
                head = l.next;
                l = head;
                r = head.next;
                continue;
            }
            if (r.val == val) {
                l.next = r.next;
                r = r.next;
                continue;
            }
            l = l.next;
            r = r.next;
        }
        return head.val == val ? null : head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        listNode1.val = 7;
        ListNode listNode2 = new ListNode();
        listNode2.val = 7;
        ListNode listNode3 = new ListNode();
        listNode3.val = 7;
        ListNode listNode4 = new ListNode();
        listNode4.val = 7;
        ListNode listNode5 = new ListNode();
        listNode5.val = 7;

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        System.out.println(removeElements(listNode1, 7));
    }
}
