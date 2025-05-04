package leetcode.old;

import linkedlist.ListNode;

public class leetcode2 {

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
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

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();

        if (l1 == null || l2 == null) {
            if (l1 == null && l2 == null) {
                return null;
            }
            if (l1 == null) {
                head.val = l2.val;
                head.next = addTwoNumbers2(null, l2.next);
                return head;
            }
            head.val = l1.val;
            head.next = addTwoNumbers2(l1.next, null);
            return head;
        } else {
            int acc = l1.val + l2.val;
            int add = acc % 10;
            int next = acc / 10;
            head.val += add;
            if (next > 0) {
                if (l1.next == null) {
                    l1.next = new ListNode();
                }
                l1.next.val += next;
            }
            head.next = addTwoNumbers2(l1.next, l2.next);
            return head;
        }
    }


    public static void main(String[] args) {
        ListNode l1;
        ListNode l2;

        l1 = ListNode.of(2, 4, 3);
        l2 = ListNode.of(5, 6, 4);
        System.out.println(addTwoNumbers2(l1, l2));
        //should be [7, 0, 8]

        l1 = ListNode.of(2, 4, 9);
        l2 = ListNode.of(5, 6, 4, 9);
        System.out.println(addTwoNumbers2(l1, l2));
        //should be [ 7, 0, 4, 0, 1 ]

        l1 = ListNode.of(9, 9, 9, 9, 9, 9, 9);
        l2 = ListNode.of(9, 9, 9, 9);
        System.out.println(addTwoNumbers2(l1, l2));
        //should be [ 8, 9, 9, 9, 0, 0, 0, 1 ]
    }
}
