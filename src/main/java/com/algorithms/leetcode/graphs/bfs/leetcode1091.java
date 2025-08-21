package com.algorithms.leetcode.graphs.bfs;

import java.util.*;

public class leetcode1091 {

    // This class is a placeholder for the LeetCode problem 1091.
    // The actual implementation of the solution will go here.
    
    // https://leetcode.com/problems/shortest-path-in-binary-matrix/

    public static int shortestPathMatrix(int [][] grid) {
        if (grid[0][0] == 1) return -1;
        
        int n = grid.length;

        boolean[][] visited = new boolean[n][n];
        int[][] dist = new int[n][n];

        Deque<Map.Entry<Integer, Integer>> dq = new ArrayDeque<>();

        visited[0][0]=true;
        dist[0][0]=1;

        dq.push(new AbstractMap.SimpleEntry<>(0, 0));
        
        while (!dq.isEmpty()) {
            Map.Entry<Integer, Integer> cur = dq.poll();

            if (cur.getKey() == n-1 && cur.getValue() == n-1) return dist[n-1][n-1];

            for (int i =-1;i<=1;i++) {
                for (int j=-1;j<=1;j++) {
                    int posI = cur.getKey()+i;
                    int posJ = cur.getValue()+j;

                    if (posI>=0 && posI < n && posJ >=0 && posJ < n && grid[posI][posJ] == 0) {
                        if (!visited[posI][posJ]) {
                            dist[posI][posJ]=dist[cur.getKey()][cur.getValue()]+1;
                            visited[posI][posJ]=true;
                            dq.add(new AbstractMap.SimpleEntry<>(posI, posJ));
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(shortestPathMatrix(new int[][]{{0,1},{1,0}}));
    }

}