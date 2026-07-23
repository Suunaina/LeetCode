/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val)//both smaller , go left ignore right
            return lowestCommonAncestor(root.left, p, q);

        if (p.val > root.val && q.val > root.val)//both greater , g right ignore left
            return lowestCommonAncestor(root.right, p, q);

        return root;//if none of both , return the current node becuase this means the q is lower and p is greater or viceversa

    }
}