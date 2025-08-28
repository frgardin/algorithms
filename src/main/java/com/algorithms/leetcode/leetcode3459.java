package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leetcode3459 {

    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        int maxDist = 0;
        List<int[]> startPoints = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    startPoints.add(new int[]{i, j});
                    dist[i][j] = 1;
                    maxDist = 1;
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int[] startPoint : startPoints) {
            Queue<Point> q = new ArrayDeque<>();
            q.offer(new Point(startPoint[0], startPoint[1], new int[]{0, 0}, 0));
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
                    //if (isChangingDir&& dirCount > 1) {
                    //    break;
                    //}
                    if (ni >= 0 && ni < m &&
                            nj >= 0 && nj < n &&
                            (!isChangingDir || (isChangingDir && dirCount <= 1)) &&
                            (
                                    (grid[ni][nj] == 2 && (lastItem == 1 || lastItem == 0)) ||
                                            (grid[ni][nj] == 0 && (lastItem == 2))
                            )
                    ) {
                        dist[ni][nj] = dist[i][j] + 1;
                        maxDist = Math.max(dist[ni][nj], maxDist);
                        q.offer(new Point(ni, nj, d, isChangingDir ? dirCount + 1 : dirCount));
                    }
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
    }
}