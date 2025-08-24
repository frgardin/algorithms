package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/max-area-of-island/description/
public class leetcode695 {
    

    private static final int[][] dir = {{0, 1}, {0,-1}, {1, 0}, {-1, 0}};

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(bfs(grid, i, j), maxArea);
                }
            }
        }
        return maxArea;
    }

    private int bfs(int[][] grid, int i, int j) {
        int counter=0;

        Queue<int[]> q = new ArrayDeque<>();

        q.add(new int[]{i, j});
        grid[i][j]=0;

        while(!q.isEmpty()) {
            int[] cur = q.poll();

            counter++;

            for (int[] d : dir) {
                int nx = cur[0]+d[0], ny = cur[1]+d[1];

                if (
                    nx >=0 && nx<grid.length &&
                    ny >=0 && ny<grid[0].length &&
                    grid[nx][ny] == 1
                ) {
                    grid[nx][ny]=0;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return counter;
    }
}
