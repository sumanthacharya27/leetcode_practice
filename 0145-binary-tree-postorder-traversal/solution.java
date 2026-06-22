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
    List<Integer> list= new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root==null) return ;
        inOrder(root.left);
        inOrder(root.right); 
        list.add(root.val);      
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }
}
