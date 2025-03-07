package leetcode;

import linkedlist.ListNode;

import java.util.ArrayList;

public class leetcode234 {

    //TODO: is failing in test case [1,0,0]
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        ListNode l, r;
        l = head;
        r = head.next;

        ArrayList<Integer> a = new ArrayList<>();

        a.add(l.val);

        while(r != null && r.next != null) {
            l = l.next;
            a.add(l.val);
            r = r.next.next;
        }
        l = l.next;

        for (int i = a.size() - 1; i >= 0 ; i--) {
            if (a.get(i) != l.val) return false;
            l = l.next;
        }
        return true;
    }
}
