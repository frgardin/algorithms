package com.algorithms.leetcode;

public class leetcode82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        while (head != null && head.next != null && head.val == head.next.val) {
            head = removeAll(head.val, head);
        }
        if (head == null)
            return head;
        head.next = deleteDuplicates(head.next);
        return head;
    }

    private static ListNode removeAll(int v, ListNode head) {
        while (head != null && head.val == v) {
            head = head.next;
        }
        return head;

    }

    static class ListNode {
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

}