// Last updated: 7/9/2026, 9:27:28 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
       int c1=maxDepth(root.left);
       c1++;
        int c2= maxDepth(root.right);  
        c2++;
        if(c1>c2)return c1;
        return c2;
    }
}