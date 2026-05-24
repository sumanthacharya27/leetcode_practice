class Solution {
    public int differenceOfSum(int[] nums) {
        int dsum=0;
        int nsum=0;
        for(int i=0; i<nums.length;i++){
            nsum+=nums[i];
            if(nums[i]>=10){
                dsum=dsum+digitsum(nums[i]);
            }else{
                dsum+=nums[i];
            }
        }
        return nsum-dsum;

        
    }
    public int digitsum(int n){
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}
