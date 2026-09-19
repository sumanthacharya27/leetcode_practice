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
    // List<Integer> res= new ArrayList<>(); 
    int count = 1;
    int res;

    public void dfs(TreeNode root,int k) {
        if (root == null || count>k)
            return;
        dfs(root.left,k);
        // res.add(root.val);
        if (count == k) {
            res = root.val;
            count++;
            return;
        } else
            count++;
        dfs(root.right,k);
    }

    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        // System.out.println(res);
        return res;
    }
}
