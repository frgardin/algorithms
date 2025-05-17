package ds;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(4);
        q.add(2);
        q.add(1);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
