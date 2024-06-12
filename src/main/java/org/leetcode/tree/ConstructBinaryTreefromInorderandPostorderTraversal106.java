package org.leetcode.tree;

import java.util.stream.IntStream;

public class ConstructBinaryTreefromInorderandPostorderTraversal106 {


    int pEnd = 0;

    public static void main(String[] args) {
        TreeNode root = new ConstructBinaryTreefromInorderandPostorderTraversal106().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pEnd = postorder.length - 1;
        return helper(0, inorder.length - 1, inorder, postorder);
    }

    private TreeNode helper(int inStart, int inEnd, int[] inorder, int[] postorder) {
        if (inStart > inEnd)
            return null;
        int inLoc = IntStream.range(0, inorder.length).filter(i -> inorder[i] == postorder[pEnd]).findFirst().orElse(-1);
        TreeNode node = new TreeNode(postorder[pEnd]);
        pEnd--;
        node.right = helper(inLoc + 1, inEnd, inorder, postorder);
        node.left = helper(inStart, inLoc - 1, inorder, postorder);

        return node;
    }

}
