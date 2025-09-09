package com.algorithms.leetcode;

public class leetcode783 {

    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        // Compute the minimum difference involving this node,
        // and also check recursively in left and right subtrees
        int leftMin = minDiffInBST(root.left);
        int rightMin = minDiffInBST(root.right);
        int currentMin = getMinDifferenceWithValue(root, root.val);

        return Math.min(currentMin, Math.min(leftMin, rightMin));
    }

    /**
     * Computes the minimum absolute difference between a given value (v)
     * and all node values in the subtree rooted at 'node'.
     */
    private int getMinDifferenceWithValue(TreeNode node, int v) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        // If it's a leaf, no further comparisons are possible
        if (node.left == null && node.right == null) {
            return Integer.MAX_VALUE;
        }

        int minDiff = Integer.MAX_VALUE;

        if (node.left != null) {
            minDiff = Math.min(minDiff, Math.abs(v - node.left.val));
            minDiff = Math.min(minDiff, getMinDifferenceWithValue(node.left, v));
        }

        if (node.right != null) {
            minDiff = Math.min(minDiff, Math.abs(v - node.right.val));
            minDiff = Math.min(minDiff, getMinDifferenceWithValue(node.right, v));
        }

        return minDiff;
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
