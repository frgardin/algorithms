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
}
