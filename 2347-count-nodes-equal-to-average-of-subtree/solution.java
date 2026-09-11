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
    int count=0;
    public int getsum(TreeNode root){
        if(root==null) return 0;
        int sum=0;
        sum+=getsum(root.left);
        sum+=getsum(root.right);
        sum+=root.val;
        return sum;
    }
    public int getnum(TreeNode root){
        if(root==null) return 0;
        int num=0;
        num+=getnum(root.left);
        num+=getnum(root.right);
        num+=1;
        return num;
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        int sum=getsum(root)/getnum(root);
        if(root.val==sum) count++;
        dfs(root.left);
        dfs(root.right);
    }

    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return count;
    }
}
