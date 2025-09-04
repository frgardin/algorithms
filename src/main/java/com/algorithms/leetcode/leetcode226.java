package com.algorithms.leetcode;

public class leetcode226 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        swap(root);
        root.right = invertTree(root.right);
        root.left = invertTree(root.left);
        return root;
    }

    private static void swap(TreeNode root) {
        TreeNode tempRight = root.right;
        root.right = root.left;
        root.left = tempRight;
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
