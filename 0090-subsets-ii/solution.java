class Solution {
    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> curr, int index) {
        if (index == nums.length) {
            if (!result.contains(curr))
                result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(nums, result, curr, index + 1);
        curr.remove(curr.size() - 1);
        backtrack(nums, result, curr, index + 1);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>(), 0);//set,result set,curr set,curr index
        return result;
    }
}
