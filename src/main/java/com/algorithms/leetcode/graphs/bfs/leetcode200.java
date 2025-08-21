package com.algorithms.leetcode.graphs.bfs;

public class leetcode200 {

    // https://leetcode.com/problems/number-of-islands/


    private static final int[][] dir = new int[][]{{-1 ,0}, {1, 0}, {0, -1}, {0, 1}};
    private static int col;
    private static int row;

    public static int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;

        boolean[][] visited = new boolean[row][col];
        
        int counter = 0;

        for (int i =0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    counter++;
                    dfs(grid, visited, new int[]{i, j});
                }
            }
        }
        return counter;
    }

    private static void dfs(char[][] grid, boolean[][] visited, int[] pos) {
        int x=pos[0], y=pos[1];
        visited[x][y]=true;

        for (int[] d : dir) {
            int i=d[0], j=d[1];
            
            int nx = x+i;
            int ny = y+j;

            if (nx>=0&& nx<row &&
                ny>=0&& ny<col &&
                grid[nx][ny] == '1' && 
                !visited[nx][ny]
            )
            dfs(grid, visited, new int[]{nx, ny});
        }
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{'1'},{'1'}}));
    }
}
