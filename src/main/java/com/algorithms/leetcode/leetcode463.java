package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

//TODO failing
public class leetcode463 {
    class Solution {

        private static final int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        public int islandPerimeter(int[][] grid) {

            int n = grid.length;
            int m = grid[0].length;

            int[] start = getStart(grid, n, m);

            int perimeter = 0;

            Deque<int[]> dq = new ArrayDeque<>();

            dq.offer(start);

            while (!dq.isEmpty()) {
                int[] cur = dq.poll();

                for (int[] d : dir) {
                    int ni = cur[0] + d[0];
                    int nj = cur[1] + d[1];

                    if (ni >= 0 && ni < n &&
                            nj >= 0 && nj < m) {
                        if (grid[ni][nj] == 0) {
                            perimeter++;
                        } else {
                            dq.offer(new int[] { ni, nj });
                            grid[ni][nj] = 0;
                        }
                    }
                }

            }
            return perimeter;
        }

        private static int[] getStart(int[][] grid, int n, int m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] { -1, -1 };
        }
    }
}
