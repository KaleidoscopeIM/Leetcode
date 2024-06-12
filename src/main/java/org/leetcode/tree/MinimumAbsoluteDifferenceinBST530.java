package org.leetcode.tree;

public class MinimumAbsoluteDifferenceinBST530 {
    TreeNode pre = null;
    int res = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null)
            return;
        getMinimumDifference(root.left);
        if (pre != null) {
            res = Math.min(res, Math.abs(root.val - pre.val));
        }
        pre = root;
        getMinimumDifference(root.right);
    }
}
