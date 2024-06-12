package org.leetcode.tree;

public class KthSmallestElementinaBST230 {
    int i, res = Integer.MAX_VALUE;

    public static void main(String[] args) {
        TreeNode r = new TreeNode(3);
        r.left = new TreeNode(1);
        r.left.right = new TreeNode(2);
        r.right = new TreeNode(4);
        System.out.println(new KthSmallestElementinaBST230().kthSmallest(r, 2));
    }

    public int kthSmallest(TreeNode root, int k) {
        Integer res = null;
        helper(root, k, res);
        return res;
    }

    private void helper(TreeNode root, Integer i, Integer res) {
        if (res != null || root == null)
            return;
        helper(root.left, i, res);
        if (i-- == 1)
            res = root.val;
        helper(root.right, i, res);
    }
}
