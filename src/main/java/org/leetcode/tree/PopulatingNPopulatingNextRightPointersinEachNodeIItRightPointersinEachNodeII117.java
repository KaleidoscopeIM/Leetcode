package org.leetcode.tree;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNPopulatingNextRightPointersinEachNodeIItRightPointersinEachNodeII117 {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null)
            return null;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
//            Node pre = null;
//            while (size-- > 0) {
//                Node cur = queue.poll();
//                if (cur.left != null)
//                    queue.add(cur.left);
//                if (cur.right != null)
//                    queue.add(cur.right);
//                if (pre == null) {
//                    pre = cur;
//                } else {
//                    pre.next = cur;
//                    pre = cur;
//                }
//            }
        }
        return root;
    }
}
