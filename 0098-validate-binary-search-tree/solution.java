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
    TreeNode prev=null;
    public  boolean inOrder(TreeNode node){
        if(node==null) return true;
        //left subtree
        if(!inOrder(node.left)) return false;
        //root node
        if(prev!=null && node.val<=prev.val){
            return false;
        }
        prev=node;
        return inOrder(node.right);
    }
    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }
}
