class Solution {
    public int maximizeExpressionOfThree(int[] nums) {

        Arrays.sort(nums);
        return ((nums[nums.length-1]+nums[nums.length-2])-nums[0]);
        // int firstmax=nums[0];
        // int secondmax=nums[0];
        // int smallest=nums[0];
        // for(int i=1;i<nums.length ;i++){
        //     if(nums[i]>=firstmax){
        //         secondmax=firstmax;
        //         firstmax=nums[i];

        //     }
        //     else if(nums[i]>=secondmax){
        //         secondmax=nums[i];
        //     }
        //      if(nums[i]<smallest){
        //         smallest=nums[i];
        //     }
        // }
        // if(((firstmax+secondmax)-(smallest))<0){
        //     return -((firstmax+secondmax)-(smallest));
        // }

        // return (firstmax+secondmax)-(smallest);
    }
}
