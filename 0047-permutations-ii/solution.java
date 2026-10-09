class Solution {
    public void backtrack(List<List<Integer>> res, int[] nums, List<Integer> curr, boolean[] used) {
        if (curr.size() == nums.length) {
            // if (!res.contains(curr))
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            curr.add(nums[i]);
            backtrack(res, nums, curr, used);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }
}
