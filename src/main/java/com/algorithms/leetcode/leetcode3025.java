package com.algorithms.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

//TODO: is failing, need to improve [[1,5],[2,0],[5,5]]
public class leetcode3025 {
    public int numberOfPairs(int[][] points) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                if (i1[0] == i2[0] || i1[1] == i2[1]) {
                    return 0;
                }
                if (i1[0] < i2[0] && i1[1] > i2[1]) {
                    return -1;
                }
                return 1;
            }
        });

        for (int[] i : points) {
            pq.offer(i);
        }
        Stack<int[]> lastStack = new Stack<>();
        lastStack.push(pq.poll());
        int counter = 0;

        while (!pq.isEmpty()) {

            int[] cur = pq.poll();
            Stack<int[]> nextStack = new Stack<>();
            while (!lastStack.isEmpty()) {
                int[] last = lastStack.pop();
                int c = compare(last, cur);

                System.out.println("last: " + last[0] + ", " + last[1]);
                System.out.println("cur: " + cur[0] + ", " + cur[1]);
                System.out.println("compare: " + c);
                if (c <= 0) {
                    counter++;
                } else {
                    nextStack.push(last);
                }
            }

            lastStack = nextStack;
            lastStack.push(cur);
        }

        return counter;
    }

    private static int compare(int[] i1, int[] i2) {
        if (i1[0] == i2[0] || i1[1] == i2[1]) {
            return 0;
        }
        if (i1[0] < i2[0] && i1[1] > i2[1]) {
            return -1;
        }
        return 1;
    }
}
