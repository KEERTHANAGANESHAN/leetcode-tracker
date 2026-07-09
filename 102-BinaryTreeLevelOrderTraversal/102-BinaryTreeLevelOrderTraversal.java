// Last updated: 7/9/2026, 9:27:31 AM
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
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode > qu=new LinkedList<>();
        if(root ==null) return ans;
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> subans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode peek=qu.poll();
                subans.add(peek.val);
                if(peek.left!=null){
                    qu.add(peek.left);
                }
                if(peek.right!=null){
                    qu.add(peek.right);
                }
            }
            ans.add(subans);
        }
        return ans;
    }
}