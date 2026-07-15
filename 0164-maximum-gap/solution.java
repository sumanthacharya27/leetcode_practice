class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<=1) return 0;
        Arrays.sort(nums);
        int maxdif=0;

        for(int i=0;i<nums.length-1;i++){
            maxdif=Math.max(maxdif,(nums[i+1]-nums[i]));
        }
        return maxdif;
    }
}
