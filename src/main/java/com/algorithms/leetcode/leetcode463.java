package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode463 {

    private static final int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int perimeter = 0;

        Deque<int[]> dq = new ArrayDeque<>();

        int[] start = getSomeIslandValue(grid, n, m);

        dq.offer(start);

        grid[start[0]][start[1]] = 2;

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();

            for (int[] d : dir) {
                int i = cur[0] + d[0];
                int j = cur[1] + d[1];

                if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) {
                    perimeter++;
                } else if (grid[i][j] == 1) {
                    dq.offer(new int[] { i, j });
                    grid[i][j] = 2;
                }
            }
        }
        return perimeter;
    }

    private static int[] getSomeIslandValue(int[][] grid, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
