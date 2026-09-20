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
    int depth=0;
    public void dfs(TreeNode root,int dep){
        if(root==null) return;
        depth=Math.max(depth,dep);
        dfs(root.left,dep+1);
        dfs(root.right,dep+1);
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        dfs(root,1);
        return depth;
    }
}
