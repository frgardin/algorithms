package com.algorithms.leetcode;

public class leetcode83 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode actual = head;

        while (actual != null && actual.next != null) {
            if (actual.val == actual.next.val) {
                actual.next = actual.next.next;
            } else {
                actual = actual.next;
            }
        }
        return head;
    }

}
