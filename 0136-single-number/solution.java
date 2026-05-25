class Solution {
    public int singleNumber(int[] nums) {
        int bitwise=nums[0];
        for(int i=1;i<nums.length;i++){
            bitwise=bitwise^nums[i];
        }
        return bitwise;
        
    }
}
