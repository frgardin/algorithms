package com.algorithms.leetcode;

public class leetcode3208 {

    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int[] colorsCopy = new int[colors.length + k - 1];
        for (int i = 0; i < colors.length + k - 1; i++) {
            colorsCopy[i] = colors[i % colors.length];
        }

        int i = 0;
        int j = 1;
        int c = 0;

        while(j < colorsCopy.length) {
            if (colorsCopy[j] != colorsCopy[j - 1]) {
                j++;
                continue;
            }
            int diff = j - i;
            if (diff >= k - 1) {
                c +=  diff - k + 1;
            }
            i = j;
            j = i + 1;
        }
        int diff = j - i;
        if (diff >= k - 1) {
            c +=  diff - k + 1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,1}, 3));
    }
}
