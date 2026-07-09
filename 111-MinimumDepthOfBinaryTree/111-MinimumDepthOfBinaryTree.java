// Last updated: 7/9/2026, 9:27:26 AM
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
    public int minDepth(TreeNode root) {
        int c1=0,c2=0;
        if(root==null)return 0;
       c1=1+minDepth(root.left);
       c2=1+ minDepth(root.right);  
        if(c1==1)return c2;
        if(c2==1)return c1;
        return Math.min(c1,c2);
    }
}