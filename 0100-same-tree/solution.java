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
    boolean res=true;
    public void helper(TreeNode p,TreeNode q){
        if(p==null && q==null) return;
        
        if((p==null || q==null)||(p.val!=q.val)){
            res=false;
            return;
        } 
        helper(p.left,q.left);
        helper(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
         if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        helper(p,q);
        return res;
    }
}
