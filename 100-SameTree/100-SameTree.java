// Last updated: 7/9/2026, 9:27:34 AM
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Case 1: both are null
        if (p == null && q == null) {
            return true;
        }

        // Case 2: one is null, other is not
        if (p == null || q == null) {
            return false;
        }

        // Case 3: values don't match
        if (p.val != q.val) {
            return false;
        }

        // Recursive check for left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}