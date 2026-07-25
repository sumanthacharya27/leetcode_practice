class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long count=0;
        long len=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                if(count>0){
                    len+=(count*(count+1))/2;
                    count=0;
                }
            }else{
                count++;
            }
        }
        if(nums[n-1]==0){
            len+=(count*(count+1))/2;
        }
        return len;
    }
}
