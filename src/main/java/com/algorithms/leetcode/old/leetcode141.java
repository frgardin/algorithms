package com.algorithms.leetcode.old;

import com.algorithms.linkedlist.ListNode;

public class leetcode141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) return true;
        }
        return false;
    }
}
