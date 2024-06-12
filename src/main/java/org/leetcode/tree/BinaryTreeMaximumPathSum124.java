package org.leetcode.tree;

public class BinaryTreeMaximumPathSum124 {
    int res = 0;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.val;
        int left = helper(root.left);
        int right = helper(root.right);
        int sum = left + right + root.val;
        res = Math.max(res, sum);
        return Math.max(left + root.val, right + root.val);
    }
}
