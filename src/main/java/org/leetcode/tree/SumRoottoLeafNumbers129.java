package org.leetcode.tree;

public class SumRoottoLeafNumbers129 {
    public int sumNumbers(TreeNode root) {
        return helper(root, "");
    }

    private int helper(TreeNode root, String num) {
        if (root == null)
            return 0;
        num += root.val;
        if (root.left == null && root.right == null)
            return Integer.parseInt(num);
        int left = helper(root.left, num);
        int right = helper(root.right, num);
        return left + right;
    }
}
