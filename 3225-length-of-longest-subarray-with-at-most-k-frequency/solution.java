class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int max=0;
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                max=Math.max(max,(right-left));
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            right++;
        }
        max=Math.max(max,(right-left));
        return max;
    }
}
