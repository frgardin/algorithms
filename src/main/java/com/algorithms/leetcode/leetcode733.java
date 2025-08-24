package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/flood-fill/
public class leetcode733 {

    private static final int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        
        int m = image.length;
        int n = image[0].length;
        
        int c = image[sr][sc];
        if (c == color) return image;

        Deque<int[]> dq = new ArrayDeque<>();

        dq.add(new int[]{sr, sc});

        image[sr][sc]=color;

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();

            for (int[] d : dir) {
                int i = cur[0]+d[0];
                int j = cur[1]+d[1];

                if (
                    i>=0 && i<m &&
                    j>=0 && j<n &&
                    image[i][j] == c 
                ) {
                    image[i][j] = color;
                    dq.add(new int[]{i, j}); 
                }
            }
        }

        return image;
    }
}