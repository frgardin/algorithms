package com.algorithms.leetcode;

public class leetcode1769 {

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];

        int rightCellsCounter = 0;
        int pointsAt0 = 0;

        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                rightCellsCounter++;
                pointsAt0 += i;
            }
        }

        Cell actual = new Cell(boxes.charAt(0) == '1', rightCellsCounter, 0, pointsAt0);
        ans[0] = pointsAt0;

        for (int i = 1; i < n; i++) {
            boolean b2 = boxes.charAt(i) == '1';

            int p2 = actual.p + actual.l - actual.r;

            p2 = actual.b ? p2 + 1 : p2;

            int l2 = actual.b ? 1 + actual.l : actual.l;

            int r2 = b2 ? actual.r - 1 : actual.r;

            ans[i] = p2;
            actual = new Cell(b2, r2, l2, p2);
        }
        return ans;
    }

    static class Cell {
        boolean b;
        int r;
        int l;
        int p;

        Cell(boolean hasBox,
                int right,
                int left,
                int point) {

            this.b = hasBox;
            this.r = right;
            this.l = left;
            this.p = point;
        }
    }
}
