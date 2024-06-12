package org.leetcode.tree;

public class ConstructBinaryTreefromPreorderandInorderTraversal105 {

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        new ConstructBinaryTreefromPreorderandInorderTraversal105().buildTree(preorder, inorder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0)
            return null;
        TreeNode root = helper(0, 0, preorder.length - 1, preorder, inorder);
        return root;
    }

    private TreeNode helper(int preIndex, int start, int end, int[] preorder, int[] inorder) {

        if (start > end || preIndex == preorder.length)
            return null;
        TreeNode cur = new TreeNode(preorder[preIndex]);
        int mid = 0;
        for (int i = start; i <= end; ++i) {
            if (inorder[i] == preorder[preIndex]) {
                mid = i;
                break;
            }
        }
        cur.left = helper(preIndex + 1, start, mid - 1, preorder, inorder);
        cur.right = helper(preIndex + mid - start + 1, mid + 1, end, preorder, inorder);
        return cur;
    }
}
