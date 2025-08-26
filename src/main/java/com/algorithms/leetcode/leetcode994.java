package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leetcode994 {

    private static final int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;

        Queue<List<int[]>> q = new ArrayDeque<>();

        List<int[]> l = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    l.add(new int[] { i, j });
                }
                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        q.offer(l);

        int time = -1;

        while (!q.isEmpty()) {
            List<int[]> l1 = q.poll();
            time++;
            List<int[]> l2 = new ArrayList<>();

            for (int[] k : l1) {
                int i = k[0], j = k[1];

                for (int[] d : dir) {
                    int ni = i + d[0];
                    int nj = j + d[1];

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        l2.add(new int[] { ni, nj });
                        fresh--;
                    }
                }
            }
            if (!l2.isEmpty()) {
                q.offer(l2);
            }
        }

        return fresh == 0 ? time : -1;
    }

}
