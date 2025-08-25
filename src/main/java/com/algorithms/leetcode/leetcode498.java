package com.algorithms.leetcode;

public class leetcode498 {

    private static final int[][] dir = {{-1, 1}, {1,-1}};

    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) return new int[]{};

        int n = mat.length;
        int m = mat[0].length;

        int[] ans = new int[m*n];
        int c=0;

        int i =0;
        int j =0;

        int l = 0;

        while (i < n && j < m && c < m*n) {
           ans[c]=mat[i][j];
           c++;
           int ni = i+dir[l][0];
           int mi = j+dir[l][1];

           if (ni < 0 && mi < m) {
                i=0;
                j=mi;
                l=1;
           } else if (mi >= m) {
                i=ni+2;
                j=m-1;
                l=1;
           } else if (mi < 0 && ni < n) {
                i++;
                j=0;
                l=0;
           } else if (mi < 0 && ni >=n) {
                i=n-1;
                j=1;
                l=0;
           } else if (ni >= n) {
                j++;
                i=n-1;
                l=0;
           } else {
                i=ni;
                j=mi;
           }
        }   
        
        return ans;
    }
}
