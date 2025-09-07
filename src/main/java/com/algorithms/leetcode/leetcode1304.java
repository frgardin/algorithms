package com.algorithms.leetcode;

public class leetcode1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        boolean isEven = n%2==0;
        
        if (isEven) {
            for (int i=0;i<n/2;i++) {
                ans[i] = (-n/2)+i;
            }
            for (int i=n/2;i<n;i++) {
                ans[i] = i-n/2+1;
            }
        } else {
            for (int i=0;i<n;i++) {
                ans[i] = (-n/2)+i;
            }            
        }


        return ans;
    }
}
