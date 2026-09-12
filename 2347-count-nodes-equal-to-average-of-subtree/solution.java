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
    public int[] getavg(TreeNode root){
        if(root==null) return new int[]{0,0};
        // int[] res= new int[2]; //0=sum , 1=sum
        int[] left=getavg(root.left);
        int[] right=getavg(root.right);
        int sum=left[0]+right[0]+root.val;
        int num=left[1]+right[1]+1;
        if(sum/num==root.val) count++;
        return new int[]{sum,num};
        
    }

    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        getavg(root);
        return count;
    }
}
