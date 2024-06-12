package org.leetcode.tree;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        int curVal = targetSum - root.val;
        if (curVal == 0 && root.left == null && root.right == null)
            return true;
        return hasPathSum(root.left, curVal) || hasPathSum(root.right, curVal);
    }
}
