package com.algorithms.leetcode;

public class leetcode530 {

    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(
                Math.min(getMin(root, root.val), getMinimumDifference(root.left)),
                getMinimumDifference(root.right));
    }

    private static int getMin(TreeNode root, int v) {
        if (root == null)
            return Integer.MAX_VALUE;
        if (root.left == null && root.right == null)
            return Integer.MAX_VALUE;
        if (root.left == null)
            return Math.min(Math.abs(v - root.right.val), getMin(root.right, v));
        if (root.right == null)
            return Math.min(Math.abs(v - root.left.val), getMin(root.left, v));
        return Math.min(
                Math.min(Math.abs(v - root.left.val), getMin(root.left, v)),
                Math.min(Math.abs(v - root.right.val), getMin(root.right, v)));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
