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
    // Stack<Integer> stack = new Stack<>();
    int maxdepth=-1;
    int res;

    public void dfs(TreeNode root, int depth)
    {
        if (root == null)
            return ;
        if (depth>maxdepth){
            maxdepth=depth;
            res=root.val;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        // System.out.println(stack);

        return res;
    }
}
