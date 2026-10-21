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
    int min=Integer.MAX_VALUE;
    public void dfs(TreeNode root,int dept){
        if(root==null) return;
        if(root.left==null && root.right==null) min=Math.min(min,dept);
        dfs(root.left,dept+1);
        dfs(root.right,dept+1);
        
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        dfs(root,1);
        return min;
    }
}
