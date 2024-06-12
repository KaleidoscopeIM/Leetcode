package org.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator173 {
    class BSTIterator {
        Queue<Integer> values = new LinkedList<>();

        public BSTIterator(TreeNode root) {
            inOrder(root);
        }

        private void inOrder(TreeNode root) {
            if (root == null)
                return;
            inOrder(root.left);
            values.add(root.val);
            inOrder(root.right);
        }

        public int next() {
            return values.poll();
        }

        public boolean hasNext() {
            return !values.isEmpty();
        }
    }
}
