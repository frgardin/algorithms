package leetcode.old;

import linkedlist.ListNode;

public class leetcode2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int next = 0;
        ListNode head = new ListNode();
        ListNode l3 = head;
        while (l1 != null && l2 != null) {
            int aux = l2.val + l1.val + next;
            int add = aux % 10;
            next = aux / 10;
            l3.val = add;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null && l2 != null) {
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }
        if (l1 != null) {
            l3.next = new ListNode();
            l3 = l3.next;
        }
        while (l1 != null) {
            int aux = l1.val + next;
            int add = aux % 10;
            next = aux / 10;
            l3.val = add;
            l1 = l1.next;
            if (l1 != null) {
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }
        if (l2 != null) {
            l3.next = new ListNode();
            l3 = l3.next;
        }
        while (l2 != null) {
            int aux = l2.val + next;
            int add = aux % 10;
            next = aux / 10;
            l3.val = add;
            l2 = l2.next;
            if (l2 != null) {
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }
        if (next != 0) {
            l3.next = new ListNode();
            l3.next.val = next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1;
        ListNode l2;

        l1 = ListNode.of(2, 4, 9);
        l2 = ListNode.of(5, 6, 4, 9);
        System.out.println(addTwoNumbers(l1, l2));


        l1 = ListNode.of(9,9,9,9,9,9,9);
        l2 = ListNode.of(9, 9, 9, 9);
        System.out.println(addTwoNumbers(l1, l2));
    }
}
