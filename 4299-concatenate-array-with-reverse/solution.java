class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans= new int[nums.length*2];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int z=0;
        for(int j=nums.length*2-1  ; j>=nums.length;j--, z++){
            ans[j]=nums[z];
        }

        return ans;
    }
}
