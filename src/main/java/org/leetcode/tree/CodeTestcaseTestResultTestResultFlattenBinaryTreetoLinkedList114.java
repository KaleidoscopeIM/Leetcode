package org.leetcode.tree;

public class CodeTestcaseTestResultTestResultFlattenBinaryTreetoLinkedList114 {
    public void flatten(TreeNode root) {
        helper(root);
    }

    private TreeNode helper(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = helper(root.left);
        TreeNode right = helper(root.right);
        if (left != null) {
            root.right = left;
            while (left.right != null)
                left = left.right;
            left.right = right;
            root.left = null;
        }
        return root;
    }
}
