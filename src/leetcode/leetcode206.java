package leetcode;

import linkedlist.ListNode;

import java.util.Stack;

public class leetcode206 {

    public static ListNode reverseList(ListNode actual) {
        if (actual == null) return null;
        Stack<Integer> stack = new Stack<>();
        while (actual.next != null) {
            stack.push(actual.val);
            actual = actual.next;
        }
        stack.push(actual.val);
        ListNode newHead = new ListNode(stack.pop());
        actual = newHead;
        while (!stack.isEmpty()) {
            Integer val = stack.pop();
            if (val == null) continue;
            ListNode listNode = new ListNode(val);
            actual.next = listNode;
            actual = listNode;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        listNode1.val = 1;
        ListNode listNode2 = new ListNode();
        listNode2.val = 2;
        ListNode listNode3 = new ListNode();
        listNode3.val = 3;
        ListNode listNode4 = new ListNode();
        listNode4.val = 4;
        ListNode listNode5 = new ListNode();
        listNode5.val = 5;

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        reverseList(listNode1);
    }
}
