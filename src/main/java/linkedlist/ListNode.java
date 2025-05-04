package linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        ListNode actual = this;
        while (actual != null) {
            sb.append(actual.val);
            sb.append(", ");
            actual = actual.next;
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(" ]");
        return sb.toString();
    }

    public static ListNode of(int... arr) {
        ListNode head = new ListNode();
        ListNode l = head;
        for (int i = 0; i < arr.length; i++) {
            l.val = arr[i];
            if (i != arr.length - 1) {
                l.next = new ListNode();
                l = l.next;
            }
        }
        l = null;
        return head;
    }
}
