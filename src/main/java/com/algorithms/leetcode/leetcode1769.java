package com.algorithms.leetcode;

public class leetcode1769 {

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];

        // rightCount = number of balls to the right of position 0
        // rightCost = initial cost to move all balls on the right to position 0
        int rightCount = 0;
        int rightCost = 0;

        // Precompute: count balls and total cost to move them to index 0
        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                rightCount++;
                rightCost += i; // each ball needs i steps to reach index 0
            }
        }

        // Initial state at index 0
        // leftCount = number of balls already passed (to the left)
        // rightCount = balls still to the right
        // cost = current total cost for this position
        State current = new State(boxes.charAt(0) == '1', rightCount, 0, rightCost);
        ans[0] = rightCost;

        // Traverse from index 1 to n-1
        for (int i = 1; i < n; i++) {
            boolean hasBall = boxes.charAt(i) == '1';

            // Update cost:
            // + current.leftCount → balls on the left move 1 step further
            // - current.rightCount → balls on the right move 1 step closer
            int newCost = current.cost + current.leftCount - current.rightCount;

            // If the previous position had a ball, that ball is now on the left side
            if (current.hasBall) {
                newCost++;
            }

            // Update left ball count
            int newLeftCount = current.hasBall ? current.leftCount + 1 : current.leftCount;

            // Update right ball count
            int newRightCount = hasBall ? current.rightCount - 1 : current.rightCount;

            ans[i] = newCost;
            current = new State(hasBall, newRightCount, newLeftCount, newCost);
        }

        return ans;
    }

    // Represents the state at a given index
    static class State {
        boolean hasBall;
        int rightCount; // balls to the right
        int leftCount; // balls to the left
        int cost; // total cost for this index

        State(boolean hasBall, int rightCount, int leftCount, int cost) {
            this.hasBall = hasBall;
            this.rightCount = rightCount;
            this.leftCount = leftCount;
            this.cost = cost;
        }
    }
}
