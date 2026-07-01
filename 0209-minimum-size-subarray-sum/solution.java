class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int left = 0, right;
        int windowsum = 0;
        int totalsum=0;
        for (right = 0; right < nums.length; right++) {
            windowsum += nums[right];
            totalsum+=nums[right];
            while (windowsum >= target) {
                windowsum -= nums[left];
                len = Math.min(len, right - left);
                left++;
            }
        }
        // if(totalsum==target) return nums.length;
        // if(totalsum<target) return 0;
        return len==Integer.MAX_VALUE? 0: len + 1;
    }
}
