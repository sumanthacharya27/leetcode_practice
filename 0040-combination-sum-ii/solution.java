class Solution {
    public void backtrack(List<List<Integer>> res, int[] nums, int target, List<Integer> curr,  int sum,
            int index) {
        if (sum == target) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if(i!=index && nums[i]==nums[i-1]) continue;
            if (sum+nums[i] > target)
                return;
            curr.add(nums[i]);
            backtrack(res, nums, target, curr, sum + nums[i], i+1);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, candidates, target, new ArrayList<>(),  0, 0);
        return res;
    }
}
