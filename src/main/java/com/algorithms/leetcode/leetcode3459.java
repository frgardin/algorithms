package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class leetcode3459 {

    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        int maxDist = 0;

        Queue<Point> q = new ArrayDeque<>();
        HashSet<Point> visited = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new Point(i, j, new int[]{0, 0}, 0));
                    dist[i][j] = 1;
                    maxDist = 1;
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (!q.isEmpty()) {
            int i = q.peek().x, j = q.peek().y;
            int[][] dir = q.peek().dirList;
            int[] lastDir = q.peek().dir;
            int dirCount = q.peek().dirCount;
            q.poll();
            int lastItem = grid[i][j];

            for (int[] d : dir) {
                int ni = i + d[0];
                int nj = j + d[1];
                boolean isChangingDir = isChangingDir(d, lastDir);

                if (ni >= 0 && ni < m &&
                        nj >= 0 && nj < n &&
                        (!isChangingDir || (isChangingDir && dirCount <= 1)) &&
                        (
                                (grid[ni][nj] == 2 && (lastItem == 1 || lastItem == 0)) ||
                                        (grid[ni][nj] == 0 && (lastItem == 2))
                        )
                ) {
                    Point p = new Point(ni, nj, d, isChangingDir ? dirCount + 1 : dirCount);
                    if (visited.contains(p)) {
                        continue;
                    }
                    visited.add(p);
                    dist[ni][nj] = dist[i][j] + 1;
                    maxDist = Math.max(dist[ni][nj], maxDist);
                    q.offer(p);
                }
            }

        }
        return maxDist;
    }

    private static boolean isChangingDir(int[] d, int[] lastDir) {
        return lastDir[0] != d[0] || lastDir[1] != d[1];
    }

    static class Point {
        int x;
        int y;
        int[][] dirList;
        int[] dir;
        int dirCount;

        Point(int x, int y, int[] dir, int dirCount) {
            this.x = x;
            this.y = y;
            if (dir[0] == 0 && dir[1] == 0) {
                this.dirList = new int[][]{{-1, -1}, {-1, 1}, {1, 1}, {1, -1}};
            } else if (dir[0] == -1 && dir[1] == 1) {
                this.dirList = new int[][]{{-1, 1}, {1, 1}};
            } else if (dir[0] == 1 && dir[1] == 1) {
                this.dirList = new int[][]{{1, -1}, {1, 1}};
            } else if (dir[0] == 1 && dir[1] == -1) {
                this.dirList = new int[][]{{1, -1}, {-1, -1}};
            } else if (dir[0] == -1 && dir[1] == -1) {
                this.dirList = new int[][]{{-1, 1}, {-1, -1}};
            }
            this.dir = dir;
            this.dirCount = dirCount;
        }

        public boolean equals(Object o) {
            if (o instanceof Point p) {
                return p.x == this.x && p.y == this.y && p.dir[0] == this.dir[0] && p.dir[1] == this.dir[1];
            }
            return false;
        }
    }
}