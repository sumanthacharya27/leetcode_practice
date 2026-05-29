class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int c;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        
        while(min>0){
            c=max%min;
            max=min;
            min=c;
        }
        return max;
    }
}
