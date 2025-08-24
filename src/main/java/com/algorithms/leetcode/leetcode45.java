package com.algorithms.leetcode;

public class leetcode45 {

    public static int jump(int[] nums) {
        int n = nums.length;
        int[] visited = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; i + j < n && j <= nums[i]; j++) {
                if (visited[i + j] == 0 && i + j != 0) {
                    visited[i + j] = visited[i] + 1;
                }
                visited[i + j] = Math.min(visited[i] + 1, visited[i + j]);
            }
        }
        return visited[n - 1];
    }

    public static int jump2(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};

        System.out.println(jump(nums));
    }
}
