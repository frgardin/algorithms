
package com.algorithms.leetcode;


//https://leetcode.com/problems/maximum-depth-of-binary-tree/?envType=problem-list-v2&envId=breadth-first-search&
public class leetcode104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left, 1), maxDepth(root.right, 1));
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        return Math.max(maxDepth(root.left, depth+1), maxDepth(root.right, depth+1));
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
