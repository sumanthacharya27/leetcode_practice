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
    boolean res=false;
    public void pre(TreeNode root,int tar,int sum){
        if(root==null ) return;
        if(sum+root.val==tar &&(root.left==null && root.right==null)){
            res=true;
            return;
        }
        
        pre(root.left,tar,sum+root.val);
        pre(root.right,tar,sum+root.val);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        pre(root,targetSum,0);
        return res;
    }
}
