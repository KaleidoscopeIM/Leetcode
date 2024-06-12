package org.leetcode.tree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class AmountofTimeforBinaryTreetoBeInfected2385 {

        int res = 0;
      public int dfs(TreeNode root, int start){
        if(root == null)
          return 0;
        int leftDepth = dfs(root.left, start);
        int rightDepth = dfs(root.right, start);
        int finalDepth = -1;
        if(root.val == start){
            res = Math.max(leftDepth,rightDepth);
        }else if(leftDepth>=0 && rightDepth >= 0 ){
            finalDepth = Math.max(leftDepth,rightDepth)+1;
        }else{
            int dist = Math.abs(leftDepth) + Math.abs(rightDepth);
            res = Math.max(dist,res);
            finalDepth = Math.min(leftDepth,rightDepth)-1;
        }
        return finalDepth;

      }

    public int amountOfTime(TreeNode root, int start) {
        if(root == null)
            return 0;
        dfs(root,start);
        return res;
        }

    public static void main(String[] args) {
        AmountofTimeforBinaryTreetoBeInfected2385 obj  = new
                AmountofTimeforBinaryTreetoBeInfected2385();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        //System.out.println(obj.dfs(root));
    }
}
