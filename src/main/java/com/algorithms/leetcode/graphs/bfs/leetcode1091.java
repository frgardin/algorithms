package com.algorithms.leetcode.graphs.bfs;

import java.util.*;

public class leetcode1091 {

    // This class is a placeholder for the LeetCode problem 1091.
    // The actual implementation of the solution will go here.

    // https://leetcode.com/problems/shortest-path-in-binary-matrix/

    public static int shortestPathMatrix(int[][] grid) {
        if (grid[0][0] == 1)
            return -1;

        int n = grid.length;

        boolean[][] visited = new boolean[n][n];
        int[][] dist = new int[n][n];

        Deque<int[]> dq = new ArrayDeque<>();

        visited[0][0] = true;
        dist[0][0] = 1;

        dq.push(new int[] { 0, 0 });

        int[][] dirs = new int[][] {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();

            if (cur[0] == n - 1 && cur[1] == n - 1)
                return dist[n - 1][n - 1];

            for (int[] d : dirs) {
                int i = d[0];
                int j = d[1];
                int posI = cur[0] + i;
                int posJ = cur[1] + j;

                if (posI >= 0 &&
                        posI < n &&
                        posJ >= 0 &&
                        posJ < n &&
                        grid[posI][posJ] == 0 &&
                        !visited[posI][posJ]) {
                            
                    dist[posI][posJ] = dist[cur[0]][cur[1]] + 1;
                    visited[posI][posJ] = true;
                    dq.add(new int[] { posI, posJ });
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(shortestPathMatrix(new int[][] { { 0, 1 }, { 1, 0 } }));
    }

}