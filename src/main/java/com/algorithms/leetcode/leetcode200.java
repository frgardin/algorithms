package com.algorithms.leetcode;

public class leetcode200 {
    private static final int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int counter = 0;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    dfs(grid, i, j, row, col);
                }
            }
        }
        return counter;
    }

    private static void dfs(char[][] grid, int x, int y, int row, int col) {
        if (x<0 || x>=row || y<0 || y>=col || grid[x][y] != '1') return;
        grid[x][y] = '0'; 
        for (int[] d : dir) {
            dfs(grid, x+d[0], y+d[1], row, col);
        }
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{'1'},{'1'}}));
    }
}
