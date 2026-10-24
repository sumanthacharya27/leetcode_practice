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
    public void helper(TreeNode root, int tar, List<List<Integer>> res, List<Integer> curr, int sum) {
        if (root == null)
            return;
        sum += root.val;
        curr.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == tar){
                res.add(new ArrayList<>(curr));
            }
        }
        helper(root.left, tar, res, curr, sum);
        helper(root.right, tar, res, curr, sum);
        curr.remove(curr.size() - 1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, targetSum, res, new ArrayList<>(), 0);
        return res;
    }
}
