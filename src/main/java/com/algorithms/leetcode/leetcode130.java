package com.algorithms.leetcode;

import java.util.*;

public class leetcode130 {
    private static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        Deque<int[]> dq = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                dq.add(new int[] { i, 0 });
                visited[i][0] = true;
            }
            if (board[i][m - 1] == 'O') {
                dq.add(new int[] { i, m - 1 });
                visited[i][m - 1] = true;
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                dq.add(new int[] { 0, i });
                visited[0][i] = true;
            }
            if (board[n - 1][i] == 'O') {
                dq.add(new int[] { n - 1, i });
                visited[n - 1][i] = true;
            }
        }

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();

            for (int[] d : dir) {
                int i = cur[0] + d[0];
                int j = cur[1] + d[1];

                if (i >= 0 && i < n &&
                        j >= 0 && j < m &&
                        !visited[i][j] &&
                        board[i][j] == 'O') {
                    visited[i][j] = true;
                    dq.add(new int[] { i, j });
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
