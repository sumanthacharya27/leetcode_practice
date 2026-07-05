class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] freq= new int[2];
        int res=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            freq[nums[right]]++;
            if(freq[0]>k){
                freq[nums[left]]--;
                left++;
            }
            right++;
            res=Math.max(res,right-left);
        }
        return res;
    }
}
