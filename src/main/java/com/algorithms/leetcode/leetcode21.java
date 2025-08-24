package com.algorithms.leetcode;

public class leetcode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode actual = head;
        ListNode before = head;
        if (list1 == null && list2 == null)
            return null;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                actual.val = list2.val;
                actual.next = new ListNode();
                before = actual;
                actual = actual.next;
                list2 = list2.next;
            } else {
                actual.val = list1.val;
                actual.next = new ListNode();
                before = actual;
                actual = actual.next;
                list1 = list1.next;
            }
        }
        while (list1 != null) {
            actual.val = list1.val;
            actual.next = new ListNode();
            before = actual;
            actual = actual.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            actual.val = list2.val;
            actual.next = new ListNode();
            before = actual;
            actual = actual.next;
            list2 = list2.next;
        }

        before.next = null;
        actual = null;
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
