package com.algorithms.leetcode;

public class leetcode3000 {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int l = 0;
        int w = 0;

        for (int[] i : dimensions) {
            double d = Math.sqrt(Math.pow(i[0], 2) + Math.pow(i[1], 2));
            if (d > max || (d >= max && i[0] * i[1] > l * w)) {
                l = i[0];
                w = i[1];
                max = d;
            }
        }
        return l * w;
    }
}
